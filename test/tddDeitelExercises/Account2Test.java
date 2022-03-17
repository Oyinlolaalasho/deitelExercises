package tddDeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account2Test {

    @Test
    //given
    public void depositTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to deposit
    oyinAccount2.deposit(100);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(200, balance);
    }

    @Test   
    //given
    public void doubleDepositTest() {
        Account2 oyinAccount2 = new Account2();
        //when we try to deposit twice
        oyinAccount2.deposit(100);
        oyinAccount2.deposit(100);
        int balance = oyinAccount2.getBalance();
        //assert
        assertEquals(200, balance);
    }

    @Test
    //given
    public void tripleDepositTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to deposit thrice
    oyinAccount2.deposit(100);
    oyinAccount2.deposit(100);
    oyinAccount2.deposit(100);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(300, balance);
    }

    @Test
    //given
    public void negativeDepositTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to deposit a negative balance
    oyinAccount2.deposit(-500);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(0, balance);

    }

    @Test
    //given
    public void validInvalidDepositTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to deposit a valid and invalid balance
    oyinAccount2.deposit(1500);
    oyinAccount2.deposit(-1000);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(1500, balance);

    }

    @Test
    //given
    public void withdrawTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to withdraw from balance
    oyinAccount2.deposit(500);
    oyinAccount2.withdraw(200);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(300, balance);
    }

    @Test
    //given
    public void withdrawAboveBalanceTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to withdraw from balance
    oyinAccount2.deposit(500);
    oyinAccount2.withdraw(550);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(500, balance);
    }
    
    @Test
    //given
    public void withdrawEmptyBalanceTest(){
    Account2 oyinAccount2 = new Account2();
    //when we try to withdraw from balance
      oyinAccount2.deposit(0);
    oyinAccount2.withdraw(100);
    int balance = oyinAccount2.getBalance();
    //assert
    assertEquals(0, balance);
    }


}
