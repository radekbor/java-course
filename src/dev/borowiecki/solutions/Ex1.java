package dev.borowiecki.solutions;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        for(char letter = 65; letter <= 90;letter++) {
            letters[letter-65] = letter;
        }
        System.out.println(Arrays.toString(letters));

    }
}
