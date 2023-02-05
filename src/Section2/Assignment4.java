package Section2;

public class Assignment4 {
    public static void main(String[] args) {
        int digit1, digit2;

        for (int i = 10; i < 100; i++) {
            digit1 = i % 10;
            digit2 = i / 10;
            if ((digit1 + digit2) + (digit1 * digit2) == i){
                System.out.println(i + " is a special number");
            }
        }
    }
}
