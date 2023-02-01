package Section2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int result = 0;
        int temp = num;

        while (num != 0) {
            digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        if (result == temp) {
            System.out.println("This " + result + " is a Palindrome: ");
        } else {
            System.out.println("Is not a Palindrome");
        }
    }
}

/**
 * num
 * 12321
 * 1232
 * 123
 * 12
 * 1
 *
 * digit
 * 1
 * 2
 * 3
 * 2
 * 1
 *
 * result
 * 12321
 *
 *
 * temp
 * 12321
 */
