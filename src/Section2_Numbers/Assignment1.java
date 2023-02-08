package Section2_Numbers;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int digit, num = scanner.nextInt();
        int evenSums = 0;
        int oddSums = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0){
                evenSums += digit;
            } else {
                oddSums += digit;
            }
            num = num / 10;
        }
        System.out.println("The sum of evens are : " + evenSums);
        System.out.println("The sum of odds are : " + oddSums);
    }
}
