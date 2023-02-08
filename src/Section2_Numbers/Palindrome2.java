package Section2_Numbers;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        StringBuffer sb = new StringBuffer(number);
        String reversedNumber = sb.reverse().toString();

        System.out.println(number.equals(reversedNumber) ? number + " is a Palindrone" : number + " is not a Palindrone");
    }
}
