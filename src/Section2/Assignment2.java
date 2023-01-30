package Section2;

import java.util.Scanner;
public class Assignment2 {
    // Sum of multiples of 3 aka divisible by 3
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int sums = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit % 3 == 0) {
                sums += digit;
            }
            num = num / 10;
        }
        System.out.println("The sum is: " + sums);
    }
}
