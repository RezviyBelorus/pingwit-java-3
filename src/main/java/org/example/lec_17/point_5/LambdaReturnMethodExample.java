package org.example.lec_17.point_5;

public class LambdaReturnMethodExample {
    public static void main(String[] args) {
        Operation operation;

        for (Operator value : Operator.values()) {
            operation = operationStrategy(value);

            Integer result = operation.process(2, 4);
            System.out.println(value + ": " + result);
        }
    }

    private static Operation operationStrategy(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case SUBTRACT -> (x, y) -> x - y;
            case MULTIPLY -> (x, y) -> x * y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }
}

interface Operation {
    Integer process(Integer x, Integer y);
}

enum Operator {
    SUM,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}
