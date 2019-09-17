package dev.borowiecki.solutions;

import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {

        // rozwiazanie dla macierzy kwadratowej, i bez uzycia tablicy pomocniczej
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        final int L = array.length;
        for(int i = 0; i < L/2;i++) {
            for (int j = 0; j < L; j++) {
                System.out.println(String.format("Swap %d %d", i, j));
                int temp = array[i][j];
                System.out.println(String.format("%d %d", array[i][j], array[j][i]));
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < L; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // rozwiazanie dla macierzy nie kwadratowej, i z uzyciem tablicy pomocniczej,
        // ps: musimy utworzyc nowa tablice o innych wymiarach

        int[][] rectangle = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] rectangleFinal = new int[rectangle[0].length][rectangle.length];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangleFinal[j][i] = rectangle[i][j];
            }
        }

        for (int i = 0; i < rectangleFinal.length; i++) {
            System.out.println(Arrays.toString(rectangleFinal[i]));
        }


    }
}
