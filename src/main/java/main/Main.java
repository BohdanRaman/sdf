package main;

import task_10.VampireNumber;
import task_4.CycleProgram;
import task_5.BitwiseOperatorsProgram;
import task_9.Fibonacci;

public class Main {
    public static void main(String[] args) {

        /* Task 4 */
        System.out.println("Task 4");
        CycleProgram cycleProgram = new CycleProgram();
        cycleProgram.getPrimeNumbers(15);
        System.out.println();

        /* Task 5 */
        System.out.println("Task 5");
        BitwiseOperatorsProgram.getBinary(31);
        System.out.println("\n");

        /* Task 9 */
        System.out.println("Task 9");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.writeNumbersFibonacci(7);
        System.out.println();

        /* Task 10 */
        System.out.println("Task 10");
        VampireNumber vampireNumbers = new VampireNumber();
        vampireNumbers.searchNumbers();
    }
}
