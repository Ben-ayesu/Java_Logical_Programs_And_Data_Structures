package Section3_Strings;

import java.util.Scanner;

public class Assignment7CountVowelsAndConsonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;

        // Long way
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u'
            ) {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels and " + consonantsCount + " consonants");
        scanner.close();
    }

}
