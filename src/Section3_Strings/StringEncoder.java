package Section3_Strings;

import java.util.Scanner;

import javax.swing.Spring;

public class StringEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output += (char) (input.charAt(i) + 1);
        }

        System.out.println(output);
        scanner.close();
    }
}
