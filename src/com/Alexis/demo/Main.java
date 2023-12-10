package com.Alexis.demo;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        File myFile = new File("C:/Users/Alexis Salazar/IdeaProjects/adventOfCodex1/src/com/Alexis/demo/myFile.txt");
        try {
            Scanner readFile = new Scanner(myFile);
            int result = 0;
            while (readFile.hasNextLine()) {

                String stillString = readFile.nextLine();
                stillString = stillString.replaceAll("one", "o1ne")
                        .replaceAll("two", "t2wo")
                        .replaceAll("three", "t3hree")
                        .replaceAll("four", "f4our")
                        .replaceAll("five", "f5ive")
                        .replaceAll("six", "s6ix")
                        .replaceAll("seven","s7even")
                        .replaceAll("eight","e8ight")
                        .replaceAll("nine","n9ine")
                        .replaceAll("[A-Z,a-z]", "");

                //int nowNumber = Integer.parseInt(stillString);

                int firstDigit = 0;
                int lastDigit = 0;

                /*lastDigit = Math.abs(nowNumber % 10);

                while (nowNumber != 0) {
                    firstDigit = Math.abs(nowNumber % 10);
                    nowNumber /= 10;
                }

                 */
                char[] newChar = stillString.toCharArray();
                firstDigit = Character.getNumericValue(newChar[0]);
                lastDigit = Character.getNumericValue(newChar[newChar.length - 1]);
                int anotherDigit = firstDigit * 10 + lastDigit;
                System.out.println(anotherDigit + " is added to total");
                result += anotherDigit;
                anotherDigit = 0;

            }

            System.out.println(result);


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}