package dev.borowiecki.home.after_week_1.solutions;

public class Ex2 {

    public static void main(String[] args) {

        char[][] array = new char[5][5];

        for(int i = 0; i<5 ;i++) {
            array[i][i] = 'X';
            array[4-i][i] = 'X';
        }

        for(int i = 0; i<5 ;i++) {
            for(int j = 0; j<5 ;j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
