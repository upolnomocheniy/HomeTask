package lection3.task2;

import java.util.HashMap;
import java.util.Scanner;

public class TaskTwoStrings {

    public static void main(String[] args) {

        String[] arr = scanningIntoArray();
//        shortestAndLongestString(arr);
//        linesLongerThanAverage(arr);
        linesShortThanAverage(arr);
        minimumOfDifferentCharacter(arr);
    }

    private static String[] scanningIntoArray() { //поймать строки вместо числа
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count <= 0) {
            System.out.print("Enter the number of lines: ");
            count = scanner.nextInt();
        }
        String[] arrStr = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("n " + i + ": ");
            String scanText = scanner.next();
            arrStr[i] = scanText;
        }
        return arrStr;
    }

    private static void shortestAndLongestString(String[] mainArr) {

        String shortStr = null;
        String longStr = null;

        for (String s : mainArr) {
            if (shortStr == null || shortStr.length() > s.length()) {
                shortStr = s;
            }
            if (longStr == null || longStr.length() < s.length()) {
                longStr = s;
            }
        }
        System.out.println("The shortest line: " + shortStr + ", " + shortStr.length() + " symbols.");
        System.out.println("The longest line: " + longStr + ", " + longStr.length() + " symbols.");
    }

    private static double averageStrings(String[] arr) {
        int sumString = 0;
        for (String s : arr) {
            sumString += s.length();
        }
        return (double) sumString / arr.length;
    }

    private static void linesLongerThanAverage(String[] arr) {
        double avgStr = averageStrings(arr);
        System.out.println("Average: " + avgStr);
        for (String s : arr) {
            if (s.length() >= avgStr) {
                System.out.println("Lines: " + s + ", length: " + s.length());
            }
        }
    }

    private static void linesShortThanAverage(String[] arr){
        double avgStr = averageStrings(arr);
        System.out.println("Average: " + avgStr);
        for (String s : arr) {
            if (s.length() <= avgStr) {
                System.out.println("Lines: " + s + ", length: " + s.length());
            }
        }
    }

    private static int minDifferent(String str) {
        StringBuilder sb = new StringBuilder();
        String txt = "";

        for (int i = 0; i < str.length(); i++) {
            txt = String.valueOf(str.charAt(i));
            if (sb.indexOf(txt) == -1) {
                sb.append(txt);
            }
        }
        return sb.length();
    }

    private static void minimumOfDifferentCharacter(String[] arr) {

        int[] arrTest = new int[arr.length];
        int min = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arrTest[i] = minDifferent(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arrTest[i] > min) {
                min = arrTest[i];
                minIndex = i;
            }
        }
        System.out.println("Minimal different: " + arr[minIndex]);
    }

}
