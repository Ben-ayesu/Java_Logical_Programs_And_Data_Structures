package Section2_Numbers;

import java.util.Scanner;

public class NivenNumberCheck {
    // A Niven number is a positive integer that is divisible by the sum of its digits.
    // For example, the number 18 is a Niven number because it is divisible by 1 + 8 = 9.
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num%getSums(num)==0? "Niven Number": "Not a Niven Number");
    }

    private static int getSums(int num) {
        int digit;
        int sums = 0;
        while (num != 0) {
            digit = num % 10;
            sums += digit;
            num = num / 10;
        }
        return sums;
    }
}
