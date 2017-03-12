package lesson5;

import java.util.Scanner;

/**
 * Created by Radion on 24.02.2017.
 */
public class Lesson5Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine().replace(" ", "").toLowerCase();
        String reversOfPhrase = new StringBuilder(phrase).reverse().toString();
        if (phrase.contentEquals(reversOfPhrase)) {
            System.out.println("Введенная строка является полиндромом");
        } else {
            System.out.println("Введенная строка не является полиндромом");
        }

    }

}
