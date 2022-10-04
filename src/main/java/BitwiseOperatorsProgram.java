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

    public int reverse(int num) {

        return num < 10 ? num : Integer.parseInt(String.valueOf(num % 10) + reverse(num / 10));
    }
}

