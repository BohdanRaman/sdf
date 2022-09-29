public class Fibonacci {
    public void getNumbersFibonacci(int a) {
        /*A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...*/
        int b1 = 1;
        int b2 = 1;
        int nextNumber;
        for (int i = 0; i < a; i++) {
            nextNumber = b1 + b2;
            System.out.println("number a Fibonacci = " +nextNumber);
            b1 = b2;
            b2 = nextNumber;
        }
    }
}
