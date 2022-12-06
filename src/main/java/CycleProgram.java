/**
 * Write a program that uses two nested for loops and the modulus
 * operator (%) to detect and print prime numbers (integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1)
 */

public class CycleProgram {

    public void getPrimeNumbers(int f) {

            for (int i = 2; i < f; ++i) {
                int count = 0;
                for (int j = 2; j <= i && count < 2; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count < 2) {
                    System.out.println(i);
                }
            }
        }
    }