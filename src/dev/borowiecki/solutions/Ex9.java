package dev.borowiecki.solutions;


public class Ex9 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int res = a;
        while(b>1) {
            res*=a;
            b--;
        }
        System.out.println(res);

    }
}
