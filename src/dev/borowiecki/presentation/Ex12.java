package dev.borowiecki.presentation;

public class Ex12 {

    public static void main(String[] args) {

        // przerywanie petli nieskonczonej
        int i = 0;
        while(true) {
            System.out.println(i);
            if (i++ == 100) {
                break;
            }
        }

        System.out.println("<------>");

        label1:
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j + " " + k);
                if (k == 5) {
                    break label1;
                }
            }
        }

        System.out.println("<------>");
        label1:
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j + " " + k);
                if (k == 5) {
                    continue label1;
                }
            }
        }


    }
}
