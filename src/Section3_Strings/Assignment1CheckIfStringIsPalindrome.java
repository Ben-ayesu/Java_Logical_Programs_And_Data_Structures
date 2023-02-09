package Section3_Strings;

import java.util.Scanner;

public class Assignment1CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(new StringBuilder(input).reverse());
    }
}
