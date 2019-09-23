package dev.borowiecki.practices.day3.phonecompany;

public interface PhoneNumber {

    int currentMonthBill();

    void callTo(PhoneNumber number, int time);
}
