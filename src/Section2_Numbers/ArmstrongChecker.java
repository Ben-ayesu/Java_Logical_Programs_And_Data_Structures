package Section2_Numbers;

import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int temp = num, sum = 0;

        while (num != 0) {
            digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        System.out.println(temp == sum? "Armstrong Number": "Not an Armstrong Number");
        scanner.close();
    }
}
