package Section3_Strings;

import java.util.Scanner;

public class Assignment6StringsEndsWithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = scanner.nextLine();
        System.out.println("Enter Second String");
        String s2 = scanner.nextLine();

        System.out.println(s1.endsWith(s2) ? "Yes" : "No");

    }
}
