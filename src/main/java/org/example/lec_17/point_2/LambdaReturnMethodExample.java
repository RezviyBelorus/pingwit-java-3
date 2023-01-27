package org.example.lec_17.point_2;

public class LambdaReturnMethodExample {
    public static void main(String[] args) {
        LambdaMethod incrementByOne =  integer -> integer + 1;
        LambdaMethod incrementMultiplyByTwo =  integer -> integer * 2;

        Integer incrementResult = process(incrementByOne, 2);
        System.out.println(incrementResult);

        Integer multiplyResult = process(incrementMultiplyByTwo, 3);
        System.out.println(multiplyResult);
    }

    private static Integer process(LambdaMethod operation, Integer input) {
        return operation.increment(input);
    }
}

interface LambdaMethod {
    Integer increment(Integer integer);
}
