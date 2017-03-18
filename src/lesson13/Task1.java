package lesson13;

import java.io.*;
import java.util.HashMap;

/**
 * Created by Radion on 16.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        File directory = new File("src" + File.separator + "lesson13" + File.separator);
        File numberOfLetters = new File(directory, "numberOfLetters.txt");
        File pushkin = new File(directory, "Pushkin.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pushkin));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(numberOfLetters))) {

            HashMap<Character, Integer> map = new HashMap<>();
            int c;
            while ((c = bufferedReader.read()) != -1) {
                Character symbol = Character.toLowerCase((char) c);
                if (symbol == 1025 || symbol > 1071 && symbol < 1104) {
                    if (map.containsKey(symbol)) {
                        map.put(symbol, map.get(symbol) + 1);
                    } else {
                        map.put(symbol, 1);
                    }
                }
            }
            for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
                bufferedWriter.write(entry.getKey() + " - " + entry.getValue() + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}