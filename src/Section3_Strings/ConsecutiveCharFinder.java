package Section3_Strings;

import java.util.Scanner;

public class ConsecutiveCharFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.next();

        boolean found = false;

        for (int i = 0; i <input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
