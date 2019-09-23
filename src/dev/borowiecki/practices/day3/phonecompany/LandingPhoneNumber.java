package dev.borowiecki.practices.day3.phonecompany;

public class LandingPhoneNumber implements PhoneNumber {

    private int bill = 0;

    @Override
    public int currentMonthBill() {
        return bill;
    }

    @Override
    public void callTo(PhoneNumber number, int time) {
        if (number instanceof LandingPhoneNumber) {
            bill += time;
        } else {
            bill += time * 2;
        }
    }
}
