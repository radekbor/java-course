package dev.borowiecki.practices.day3.bank;



public class PrivateBankAccount extends BankAccount {

    private long ownerId;

    protected PrivateBankAccount(long ownerId, int maxDebit) {
        super(maxDebit);
        this.ownerId = ownerId;
    }

    @Override
    int transferCost(BankAccount other) {
        if (other instanceof PrivateBankAccount) {
            PrivateBankAccount p = (PrivateBankAccount)other;
            if (p.ownerId == this.ownerId) {
                return 0;
            }
        }
        return 1;
    }
}
