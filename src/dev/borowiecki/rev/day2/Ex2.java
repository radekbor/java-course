package dev.borowiecki.rev.day2;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Rozdziel podana tablice transakcji na dwie tablice:
        - tablice przychodów
        - tablice rozchodów
         */
        int[] transakcje = {
                -100,
                200,
                220,
                -50,
                -60,
                -300
        };

        int[] przychody = new int[transakcje.length];
        int[] rozchody = new int[transakcje.length];

        int y = 0;
        for (int i = 0, x = 0; i < transakcje.length; i++) {
            if (transakcje[i] > 0) {
                przychody[x++] = transakcje[i];
            }

            if (transakcje[i] < 0) {
                rozchody[y++] = transakcje[i];
            }
        }
        System.out.println(y);

        System.out.println(Arrays.toString(przychody));
        System.out.println(Arrays.toString(rozchody));

        /*
        Policz ilosc wykonanych transakcji
        oraz stan konta
         */
        int stanKonta = 0;
        int iloscTransakcjiWychodzących = 0;
        for (int i = 0; i < transakcje.length; i++) {
            stanKonta += transakcje[i];
            if (transakcje[i] < 0) {
                iloscTransakcjiWychodzących++;
            }
        }
        System.out.println(stanKonta);
        System.out.println(iloscTransakcjiWychodzących);

    }
}
