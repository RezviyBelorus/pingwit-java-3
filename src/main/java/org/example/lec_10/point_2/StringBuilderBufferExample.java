package org.example.lec_10.point_2;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Kukuha doswidania");

        String fullSubString = stringBuilder.substring(5);
        String offsetSubstring = stringBuilder.substring(5, 10);

        System.out.println(fullSubString);
        System.out.println(offsetSubstring);

        System.out.println(stringBuilder);
        stringBuilder.append(777);
        System.out.println(stringBuilder);


        StringBuffer stringBuffer = new StringBuffer();
    }

}
