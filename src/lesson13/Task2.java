package lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Radion on 16.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        File directory = new File("src" + File.separator + "lesson13");
        File numbers = new File(directory, "numbers.txt");

        fillFileWithNumbers(numbers);
        sortFilesData(numbers);
    }

    private static void fillFileWithNumbers(File numbers) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(numbers), "UTF-8"))) {
            for (int i = 0; i < 10; i++) {
                writer.write(Integer.toString((int) (Math.random() * 100)));
                writer.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortFilesData(File numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(numbers)))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
            Collections.sort(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(numbers)))) {
            for (Integer aList : list) {
                writer.write(aList.toString());
                writer.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
