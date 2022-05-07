package BankApp;

public class Accounting {

    private final String ACCOUNT_NUMBER;
    private final String fullName;
    private int balance;
    private String pin;

    public Accounting(String accountNumber, String lastName, String firstName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        this.fullName = lastName + " " + firstName;
        this.pin = pin;

    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getFullName() {
        return fullName;
    }

    public void deposit(int amount) {

        balance += amount;
    }

    public int getBalance(String pin) {
        if (pin.equals((this.pin)))
            return balance;
        return 0;
    }

    public void withdraw(int amount, String pin) {
        if (this.pin.equals(pin)) {
            if (amount < balance) {
                balance -= amount;
            }
        }
    }
    @Override
    public String toString() {
        return String.format("""
                        Account Name:   %s
                        Account Number: %s
                        Balance:        %d
                        """, fullName, ACCOUNT_NUMBER, balance);

    }
}


