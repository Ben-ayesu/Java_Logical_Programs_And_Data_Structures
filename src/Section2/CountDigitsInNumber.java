package Section2;

import java.util.Scanner;

public class CountDigitsInNumber {
    //Count how many digits are in a number
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println("The number of digits in the number is: " + count);
    }
}
