package Section4_Recursions;

import static Section4_Recursions.SumOfNumbers.sum;

public class SumOfCubes {

    public static double cube(double num) {
        if (num == 0) {
            return 0;
        } else {
            return Math.pow(num,3) + cube(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(cube(5));
    }
}
