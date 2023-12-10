package com.Alexis.two;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int finalResult = 0;
        try {
            File myFile = new File("C:/Users/Alexis Salazar/IdeaProjects/adventOfCodex1/src/com/Alexis/two/myFile2");
            int totalGreen = 13;
            int totalRed = 12;
            int totalBlue = 14;
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {
                boolean thisWillBeAdded = true;
                String currentLine = scanner.nextLine();

                String[] gameSplit = currentLine.split("[;:,] ");
                for (String s : gameSplit) {
                    String[] splitting = s.split(" ");
                    if (s.contains("green")) {



                        if (totalGreen < Integer.parseInt(splitting[0])) {
                            System.out.println("redundant game");
                            thisWillBeAdded = false;
                        }
                    }
                    if (s.contains("blue")) {


                        if (totalBlue < Integer.parseInt(splitting[0])) {
                            System.out.println("redundant game");
                            thisWillBeAdded = false;
                        }

                    }
                    if (s.contains("red")) {
                        if (totalRed < Integer.parseInt(splitting[0])) {
                            System.out.println("redundant game");
                            thisWillBeAdded = false;

                        }
                    }

                }
                if (thisWillBeAdded) {
                    gameSplit[0] = gameSplit[0].replaceAll("Game ", "");
                    int addedNumber = Integer.parseInt(gameSplit[0]);
                    finalResult += addedNumber;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(finalResult);
    }
}
