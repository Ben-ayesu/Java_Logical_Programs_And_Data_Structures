package Section2_Numbers;

import java.util.Scanner;

public class SumsOfADigit {
    // Sum of all the digits
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int sums = 0;

        while (num != 0) {
            digit = num % 10;
            sums += digit;
            num = num / 10;
        }
        System.out.println("The sum is: " + sums);
    }
}
