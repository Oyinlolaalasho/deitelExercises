package tddDeitelExercises;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if(amount<0) amount = 0;
        balance = amount +balance;
    }
    public int getBalance() {
        return balance;
    }


        //given that i have an account with money via deposit plus amount added, withdraw will equal get balance;
        //givenm that i have account and account == 0,
        //given that balance == 5k and withdraw >5k return account

    public int withdraw(int dispense) {
         balance = balance - dispense;

            return balance;
        }


    public int withdrawTestZero(int dispense) {
        //if (balance == 0 ){ dispense == 0;
        return balance;
    }
}

