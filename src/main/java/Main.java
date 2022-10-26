public class Main {
    public static void main(String[] args) {

        /* Task 4 */
        System.out.println("Task 4");
        CycleProgram cycleProgram = new CycleProgram();
        cycleProgram.getPrimeNumbers(15);
        System.out.println();

        /* Task 5 */
        System.out.println("Task 5");
        BitwiseOperatorsProgram operatorsProgram = new BitwiseOperatorsProgram();
        System.out.println(operatorsProgram.reverse(34) + "\n");

        /* Task 9 */
        System.out.println("Task 9");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.writeNumbersFibonacci(7);
        System.out.println();

        /* Task 10 */
        System.out.println("Task 10");
        VampireNumbers vampireNumbers = new VampireNumbers();
        vampireNumbers.searchNumbers();
    }

}
