package dev.borowiecki.practices.day3.bank;

public abstract class BankAccount {

    private int saldo = 0;
    private int maxDebit;

    protected BankAccount(int maxDebit) {
        this.maxDebit = maxDebit;
    }

    void deposit(int m) {
        saldo +=m;
    }

    void withdraw(int m) {
        saldo -=m;
    }

    private void receive(int m) {
        saldo +=m;
    }

    abstract int transferCost(BankAccount a);

    void transferTo(BankAccount other, int m) {
        other.receive(m);
        saldo -= m;
        saldo -= transferCost(other);
    }
}
