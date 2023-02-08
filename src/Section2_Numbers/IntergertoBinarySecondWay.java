package Section2_Numbers;

import java.util.Scanner;

public class IntergertoBinarySecondWay {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(Integer.toBinaryString(num));
    }
}
