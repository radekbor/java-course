package dev.borowiecki.solutions;

public class Ex6 {

    public static void main(String[] args) {
        int number = 18;

        int dzielnik = 2;
        while(number > 0) {
            if (number % dzielnik == 0) {
                System.out.println(dzielnik);
                number /= dzielnik;
            } else {
                dzielnik++;
            }
        }

    }
}
