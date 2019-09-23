package dev.borowiecki.home.after_week_1.solutions;


import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        // leniwe rozwiazanie
        String s1 = "abc";
        String s2 = "abc";


        char[] sc1 = s1.toLowerCase().toCharArray();
        char[] sc2 = s2.toLowerCase().toCharArray();

        Arrays.sort(sc1);
        Arrays.sort(sc2);

        if (new String(sc1).equals(new String(sc2))) {
            System.out.println("napisy zawieraja takie same litery");
        } else {
            System.out.println("napisy zawieraja inne litery");
        }


        int[] histogramOfS1 = new int[26]; // 26 mozliwych , jeden case
        int[] histogramOfS2 = new int[26]; // 26 mozliwych , jeden case

        String s1Upper = s1.toUpperCase();
        String s2Upper = s2.toUpperCase();
        for(int i = 0;i<s1.length();i++) {
            int charPost = s1Upper.charAt(i) - 65;
            histogramOfS1[charPost] = histogramOfS1[charPost] + 1;
        }

        for(int i = 0;i<s2.length();i++) {
            int charPost = s2Upper.charAt(i) - 65;

            histogramOfS2[charPost] = histogramOfS2[charPost] + 1;
        }

        // Sprawdz czy histogramy sa takie same
        // wersja leniwa
        System.out.println(Arrays.equals(histogramOfS1, histogramOfS2));

//        histogramOfS1.equals(histogramOfS2); <- to nie dziala
        // werjsa "manualna"

        boolean areEqual = true;
        for (int i = 0; i < 26; i++) {
            if (histogramOfS1[i] != histogramOfS2[i]) {
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            System.out.println("napisy zawieraja takie same litery");
        } else {
            System.out.println("napisy zawieraja inne litery");
        }
    }
}
