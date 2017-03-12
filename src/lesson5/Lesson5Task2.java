package lesson5;

import java.util.Scanner;

/**
 * Created by Radion on 24.02.2017.
 */
public class Lesson5Task2 {
    public static void main(String[] args) {
        System.out.println("Введите римское чилсо");
        Scanner sc = new Scanner(System.in);
        String scannedRomanNumbers = sc.nextLine();
        System.out.println(RometoArab(scannedRomanNumbers));
    }

    public static int RometoArab(String scannedRomanNumbers) {
        String[] romanArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                "IX", "V", "IV", "I"};
        int[] arabicArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuffer romanNumbers = new StringBuffer(scannedRomanNumbers);
        int arabicNumber = 0, i = 0;
        if (romanNumbers.length() > 0) {
            while (true) {
                do {
                    if (romanArray[i].length() <= romanNumbers.length()) {
                        if (romanArray[i].equals(romanNumbers.substring(0, romanArray[i].length()))) {
                            arabicNumber += arabicArray[i];
                            romanNumbers.delete(0, romanArray[i].length());
                            if (romanNumbers.length() == 0)
                                return arabicNumber;
                        } else
                            break;
                    } else
                        break;
                } while (true && romanNumbers.length() != 0);
                i++;
            }
        }
        return 0;
    }
}
