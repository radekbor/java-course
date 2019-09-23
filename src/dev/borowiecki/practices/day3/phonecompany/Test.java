package dev.borowiecki.practices.day3.phonecompany;

public class Test {

    public static void main(String[] args) {
        PhoneNumber p1 = new MobilePhoneNumber();
        PhoneNumber p2 = new MobilePhoneNumber();
        PhoneNumber p3 = new LandingPhoneNumber();

        p1.callTo(p2, 4);
        p1.callTo(p3, 3);

        System.out.println(p1.currentMonthBill());
    }
}
