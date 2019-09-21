package dev.borowiecki.rev.day2;

import sun.util.resources.cldr.ar.CalendarData_ar_YE;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        String napis = "Ala i Ola poszly na zakupy.  ";
        System.out.println(napis.length());

        napis = napis.replace("Ala", "X");
        napis = napis.replace("Ola", "Y");
        napis = napis.replace("Y", "Ala");
        napis = napis.replace("X", "Ola");

        System.out.println(napis);

        napis = "Ala i Ola poszly na zakupy.  ";
        String[] words = napis.split(" ");
        System.out.println(Arrays.toString(words));
        int posAli = 0;
        int posOli = 2;

        String temp = words[posAli];
        words[posAli] = words[posOli];
        words[posOli] = temp;

        System.out.println(Arrays.toString(words));

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                result += words[i];
            } else {
                result += words[i] + " ";
            }
        }
        System.out.println(result);
        System.out.println(result.length());

    }
}
