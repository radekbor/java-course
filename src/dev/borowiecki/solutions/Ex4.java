package dev.borowiecki.solutions;


import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {
        String text = "Moj bardzo dlugi napis";
        int[] histogram = new int[26]; // 26 mozliwych , jeden case, tylko znaki A-Z

        String textUpper = text.toUpperCase().replaceAll("\\s", "");// pozbywamy sie spacji oraz innych bialych znakow oraz duzy case
        for(int i = 0;i<textUpper.length();i++) {
            int charPost = textUpper.charAt(i) - 65;
            histogram[charPost] = histogram[charPost] + 1;
        }

        System.out.println(Arrays.toString(histogram));

    }
}
