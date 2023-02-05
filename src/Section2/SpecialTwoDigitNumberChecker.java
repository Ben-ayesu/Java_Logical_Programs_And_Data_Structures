package Section2;

import java.util.Scanner;

public class SpecialTwoDigitNumberChecker {
    // Sum of all the digits
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit1, digit2, num = scanner.nextInt();
        int result = 0;

        digit1 = num % 10;
        digit2 = num / 10;
        result = (digit1 + digit2) + (digit1 * digit2);

        System.out.println(result == num? "Special number": "Not so special");
    }
}
