package dev.borowiecki.solutions;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        for(char letter = 65; letter <= 90;letter++) {
            letters[letter-65] = letter;
        }
        System.out.println(Arrays.toString(letters));

        char letter = 'A';
        char[] letters2 = new char[26];
        int pos = 0;
        char z = 'Z';
        while(letter <= (int)(z)) {
            letters2[pos++] = letter++;
        }
        System.out.println(Arrays.toString(letters2));


        char[] letters3 = new char[26];
        for(char let = 'A'; let <= 'Z';let++) {
            letters3[let-65] = let;
        }
        System.out.println(Arrays.toString(letters3));
    }
}
