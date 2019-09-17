package dev.borowiecki.solutions;

public class Ex5 {

    public static void main(String[] args) {
        int number = 113;

        /*
        dla optymalizacji moglibysmy dac number/2
        albo nawet Sqrt(number) ale wersja "naiwna" tez bedzie akceptowalna
         */
        boolean isFirst = true;
        for (int i = 2; i < number;i++) {
            if (number % i == 0) {
                isFirst = false;
                break;
            }
        }

        if (isFirst) {
            System.out.println(number + " jest pierwsza");
        } else {
            System.out.println(number + " nie jest pierwsza");
        }
    }
}
