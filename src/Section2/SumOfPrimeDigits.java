package Section2;

import java.util.Scanner;

public class SumOfPrimeDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int sums = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7){
                sums += digit;
            }
            num = num / 10;
        }
        System.out.println("The sum is: " + sums);
    }
}
