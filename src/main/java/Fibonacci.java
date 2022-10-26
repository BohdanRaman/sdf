/**
 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, and so on, where each number (from the third on) is the sum of the previous two. Create
 * a method that takes an integer as an argument and displays that many Fibonacci numbers
 * starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
 * name of the class) the output will be: 1, 1, 2, 3, 5
 */
public class Fibonacci {

    public static int getNumbersFibonacci(int a) {

        /*A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...*/

        if (a == 0 || a == 1) {
            return a;
        }
        return getNumbersFibonacci(a - 1) + getNumbersFibonacci(a - 2);
    }

    public void writeNumbersFibonacci(int n) {

        for (int i = 1; i <= n; ++i) {
            System.out.println(getNumbersFibonacci(i));
        }
    }
}



