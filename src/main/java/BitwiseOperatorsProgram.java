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

public class BitwiseOperatorsProgram {
    private int a = 0b010101;
    private int b = 0b101010;

    public int reverse(int a, int b) {
        return a < 10 ? a * 100 : a * 10;
    }
}

