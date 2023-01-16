package org.example.lec_13.practice.task_5;

import java.io.File;

public class FileExplorerMain {
    public static void main(String[] args) {
        String rootPath = "src/main/java/org/example/lec_1";
        File root = new File(rootPath);

        printCatalogs(new File[] {root}, "");
    }

    private static void printCatalogs(File[] files, String margin) {
        for (int i = 0; i < files.length; i++) {
            File file = files[i];

            if (file.isDirectory()) {
                System.out.println(margin + file.getName());
                margin += " ";
            }

            if (file.isFile()) {
                System.out.println(margin + " " + file.getName());
            } else {
                File[] directoryFiles = file.listFiles();
                printCatalogs(directoryFiles, margin);
            }
        }
    }

}
