package org.example.lec_7.point_1;

public class FibonacciExample {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13

        int result = fibonacciRecursion(4);
        System.out.println(result);
    }

    public static int fibonacciRecursion(int number) {
        System.out.println("number = " + number);

        if (number < 2) {
            return number;
        }

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    private static void fibonacciCycle(int count) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series till " + count + " terms:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

}
