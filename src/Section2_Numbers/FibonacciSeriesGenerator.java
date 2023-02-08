package Section2_Numbers;

import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
