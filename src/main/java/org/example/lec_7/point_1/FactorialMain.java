package org.example.lec_7.point_1;

public class FactorialMain {
    public static void main(String[] args) {
        long result = 1;
        int number = 5;

        result = factorialRecursion(result, number);// 1*2*3*4*5

        System.out.println(result);

        long cycleResult = factorialCycle(number);
        System.out.println(cycleResult);
    }

    private static long factorialRecursion(long result, int number) {
        if (number == 0) {
            return result;
        }
        System.out.println("result=" + result);

        return factorialRecursion(result * number, --number);
        // *7 *6 *5 *4
    }

    private static long factorialCycle(int number) {
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

}
