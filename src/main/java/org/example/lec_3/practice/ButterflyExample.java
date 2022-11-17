package org.example.lec_3.practice;

public class ButterflyExample {
    public static void main(String[] args) {
        /*
        1 0 0 0 0
        1 2 0 0 0
        1 2 3 0 0
        1 2 3 4 0
        1 2 3 4 5
         */
        int size = 9;
        int leftBorder = 1;
        int rightBorder = size;
        double mid = size / 2d;

        String emptySymbol = " ";


        for (int i = 0; i < mid; i++) {
            int printingIndex = 1;
            for (int j = 1; j < size + 1; j++) {

                if (j <= leftBorder) {
                    System.out.print(printingIndex);
                } else {
                    if (j < mid) {
                        System.out.print(emptySymbol);
                    } else {
                        if (j < rightBorder) {
                            System.out.print(emptySymbol);
                        } else {
                            System.out.print(printingIndex);
                        }
                    }
                }

                if (j < mid) {
                    printingIndex++;
                }

                if (j > mid) {
                    printingIndex--;
                }

            }
            System.out.println();
            leftBorder++;
            rightBorder--;
        }
    }

}
