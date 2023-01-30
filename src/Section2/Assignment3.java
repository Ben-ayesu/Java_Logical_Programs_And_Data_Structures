package Section2;

import java.util.Scanner;

public class Assignment3 {
    // Count the number of times a digit occurs
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt(), digitToSearch = scanner.nextInt(), count = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit == digitToSearch)
                count++;
            num = num / 10;
        }
        System.out.println("The number of " + digitToSearch + " is: " + count);
        scanner.close();
    }
}
