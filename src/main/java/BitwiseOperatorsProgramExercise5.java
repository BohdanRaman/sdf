/**
 * Exercise 10: (3) Write a program with two constant values, one with alternating binary
 * ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
 * this). Take these two values and combine them in all possible ways using the bitwise
 * operators, and display the results using Integer.toBinaryString( ).
 * <p>
 * Repeat Exercise 10 from the previous chapter, using the ternary operator
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */

/* convert decimal to binary */

public class BitwiseOperatorsProgramExercise5 {
    private int decimal;

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }


    public static void getBinary(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            a = a / 2;
            temp = b + temp;
        }
        System.out.print(temp);
    }
}

