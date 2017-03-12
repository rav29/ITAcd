package lesson4;

/**
 * Created by Radion on 23.02.2017.
 */
public class Lesson4Task4 {
    public static void main(String[] args) {
        int[][] arrayOne = new int[5][7];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = j;
                System.out.print(arrayOne[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < linearize(arrayOne).length; i++) {
            System.out.print(linearize(arrayOne)[i]);
        }

    }

    private static int[] linearize(int[][] arrayOne) {
        int arrayOneLenght = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOneLenght += arrayOne[i].length;
        }
        int[] linearized = new int[arrayOneLenght];
        int indexOfLinearized = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                linearized[indexOfLinearized] = arrayOne[i][j];
                indexOfLinearized++;
            }
        }
        return linearized;
    }

}
