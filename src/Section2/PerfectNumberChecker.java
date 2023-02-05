package Section2;

import java.util.Scanner;

public class PerfectNumberChecker {

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " is a perfect number: " + isPerfect(num));
    }
}
