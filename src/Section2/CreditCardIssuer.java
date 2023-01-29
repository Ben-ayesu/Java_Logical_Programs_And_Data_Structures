package Section2;

import java.util.Scanner;

public class CreditCardIssuer {
    // If credit score is between 400-600 -> Silver card
    // If credit score is between 600-800 -> Gold card
    // If credit score is between 800-850 -> Platinum card
    // Less than < 400 and > 800 if not a valid credit score number

    public static void main(String[] args) {
        System.out.println("Enter Credit Score Number: ");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();

        if (creditScore < 400 || creditScore > 850) {
            System.out.println("Invalid credit score: " + creditScore + "\nEnter number between 400 and 850");
        } else {
            if (creditScore >= 400 && creditScore < 600) {
                System.out.println("You qualify for a Silver card!");
            } else if (creditScore >= 600 && creditScore < 800) {
                System.out.println("You qualify for a Gold card!");
            } else {
                System.out.println("You qualify for a Platinum card!");
            }
        }
        scanner.close();
    }
}
