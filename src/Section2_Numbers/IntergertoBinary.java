package Section2_Numbers;

import java.util.Scanner;

public class IntergertoBinary {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] binaryNum = new int[10];

        int i = 0;

        while (num != 0) {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i-1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }
}
