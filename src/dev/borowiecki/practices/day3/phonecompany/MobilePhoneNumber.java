package dev.borowiecki.practices.day3.phonecompany;

public class MobilePhoneNumber implements PhoneNumber {

    private int bill = 0;

    @Override
    public int currentMonthBill() {
        return bill;
    }

    @Override
    public void callTo(PhoneNumber number, int time) {
        if (number instanceof MobilePhoneNumber) {
            bill += time / 2;
        } else {
            bill += time * 2;
        }
    }
}
