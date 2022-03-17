package tddDeitelExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account oyinAccount = new Account();
        //when
        oyinAccount.deposit(100);
        //assert takes in what to expect and what is actual
        assertEquals(100, oyinAccount.getBalance());

    }

    @Test
    public void depositTwiceTest(){
        //given
        Account oyinAccount = new Account();
        //when
        oyinAccount.deposit(400);
        oyinAccount.deposit(500);
        //check
        assertEquals(900, oyinAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative deposit will not work")
    public void negativeDepositTest(){
        //given
        Account oyinAccount = new Account();
        //when
        oyinAccount.deposit(-500);
        //check
        assertEquals(0, oyinAccount.getBalance());


    }

    @Test
    @DisplayName("Test that withdrawn amount leaves balance")
    public void withdrawTest(){
        //given
        Account oyinAccount = new Account();
        //when
        oyinAccount.deposit(1000);
        oyinAccount.withdraw(500);
        //assert
        assertEquals(500, oyinAccount.getBalance());

    }
    @Test
    @DisplayName("Test that balance is zero when account is empty")
    public void withdrawZeroTest(){
        //given
        Account oyinAccount = new Account();
        //when
        oyinAccount.deposit(0);
        //oyinAccount.withdrawZeroTest(500)
        assertEquals(0, oyinAccount.getBalance());            }
}
