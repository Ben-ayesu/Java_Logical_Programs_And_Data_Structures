package Section3_Strings;

import java.util.Scanner;

public class Assignment5CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        String reversed = String.valueOf(new StringBuilder(input).reverse()).toLowerCase();

        if (input.equals(reversed)) {
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Is not a Palindrome");

        }
    }
}
