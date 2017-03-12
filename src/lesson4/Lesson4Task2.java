package lesson4;

import java.util.Random;

/**
 * Created by Radion on 21.02.2017.
 */
public class Lesson4Task2 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        printArray(array);
        int numberToCheck = 0;
        for (int i = 0; i < array.length; i++) {
            numberToCheck = array[i];
            for (int j = 0; j < array.length; j++) {
                if (numberToCheck == array[j] && numberToCheck != 0 && i != j) {
                    array[i] = 0;
                    array[j] = 0;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(" "+ number + " ");
        }
        System.out.println();
    }

}
