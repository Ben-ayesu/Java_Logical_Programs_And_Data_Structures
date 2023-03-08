package Section3_Strings;

import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        // Short way
        System.out.println(input.replaceAll("[aeiou]", ""));

        // Long way
        StringBuffer output = new StringBuffer();
        // TODO Check for uppercase
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u'
            ) {
                continue;
            } else {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
        scanner.close();
    }

}
