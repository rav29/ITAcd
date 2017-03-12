package lesson4;

/**
 * Created by Radion on 23.02.2017.
 */
public class Lesson4Task3 {
    public static void main(String[] args) {
        int[] arrayOne = new int[11];
        int[] arrayTwo = new int[13];
        fillArray(arrayOne);
        fillArray(arrayTwo);
        printArray(arrayOne);
        printArray(arrayTwo);
        printArray(unArrays(arrayOne, arrayTwo));
    }


    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(" " + number + " ");
        }
        System.out.println();
    }

    private static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] unArrays(int[] arrayOne, int[] arrayTwo) {
        int[] arrayUn = new int[arrayOne.length + arrayTwo.length];
        int[] maxArray = arrayOne.length < arrayTwo.length ? arrayTwo : arrayOne;
        int[] minArray = arrayOne.length > arrayTwo.length ? arrayTwo : arrayOne;
        int indexCounter = 0;
        for (int i = 0; i < arrayUn.length; i++) {
            if (indexCounter < minArray.length) {
                arrayUn[i] = maxArray[indexCounter];
                arrayUn[i + 1] = minArray[indexCounter];
                i++;
                indexCounter++;
            } else {
                arrayUn[i] = maxArray[indexCounter];
                indexCounter++;
            }
        }
        return arrayUn;
    }
}

