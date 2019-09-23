package dev.borowiecki.practices.day3.bank;



public class CompanyBankAccount extends BankAccount {

    private long companyId;

    protected CompanyBankAccount(long companyId, int maxDebit) {
        super(maxDebit);
        this.companyId = companyId;
    }

    @Override
    int transferCost(BankAccount other) {
        if (other instanceof CompanyBankAccount) {
            CompanyBankAccount p = (CompanyBankAccount)other;
            if (p.companyId == this.companyId) {
                return 0;
            }
        }
        return 2;
    }
}
