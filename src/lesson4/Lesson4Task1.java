package lesson4;

/**
 * Created by Radion on 21.02.2017.
 */
public class Lesson4Task1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i <array.length; i++) {
            printArray(moveToTheRight(array));
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(" " + number + " ");
        }
        System.out.println();
    }

    public static int[] moveToTheRight(int[] array) {
        int arraySize = array.length;
        for (int i = arraySize - 1; i !=arraySize - 2; i--) {
            int lastInRow = array[i];
            for (int j = i; j != 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastInRow;
        }
        return array;
    }
}

