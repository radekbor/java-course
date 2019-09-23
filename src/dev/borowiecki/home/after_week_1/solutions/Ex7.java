package dev.borowiecki.home.after_week_1.solutions;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {

        char[] someArray = "My lstirng".toCharArray();

        for(int i = 0; i < someArray.length / 2;i++) {
            char temp = someArray[i];
            someArray[i] = someArray[someArray.length - i - 1];
            someArray[someArray.length -i - 1 ] = temp;
        }

        System.out.println(Arrays.toString(someArray));

    }
}
