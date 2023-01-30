package Section2;

import java.util.Scanner;

public class DuckNumberChecker {
    // Checks to see if number is  duck number
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        boolean isDuckNumber = false;

        while (num != 0) {
            digit = num % 10;
            if (digit == 0) {
                isDuckNumber = true;
                break;
            }
            num /= 10;
        }
        if (isDuckNumber) {
            System.out.println("Number is a duck number!");
        } else {
            System.out.println("Number is not a duck number!");
        }
        scanner.close();
    }
}
