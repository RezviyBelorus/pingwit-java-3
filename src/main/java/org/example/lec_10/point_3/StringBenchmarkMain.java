package org.example.lec_10.point_3;

public class StringBenchmarkMain {
    public static void main(String[] args) {
        String symbol = "A";
        String string = "A";
        StringBuilder stringBuilder = new StringBuilder("A");
        StringBuffer stringBuffer = new StringBuffer("A");

        int time = 1000_000;

        long startString = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            string = string + symbol;
        }
        long finishString = System.currentTimeMillis();

        System.out.println("string=" + (finishString - startString));


        long startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            stringBuilder.append(symbol);
        }
        String resultStringBuilder = stringBuilder.toString();
        long finishStringBuilder = System.currentTimeMillis();

        System.out.println("stringBuilder=" + (finishStringBuilder - startStringBuilder));


        long startStringBuffer = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            stringBuffer.append(symbol);
        }
        String resultStringBuffer = stringBuffer.toString();
        long finishStringBuffer = System.currentTimeMillis();

        System.out.println("stringBuffer=" + (finishStringBuffer - startStringBuffer));
    }

}
