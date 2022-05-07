package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountingTest {
    private Accounting account;

    @BeforeEach
    public void startsWith() {
        account = new Accounting("2015347", "AJALA", "Tolu", "1234");
    }

    @Test
    public void accountCanBeCreatedTest() {
        assertNotNull(account);
    }

    @Test
    public void accountCanBeCreatedWithAllDetailsTest() {
        assertEquals("2015347", account.getAccountNumber());
    }

    @Test
    public void accountCreateFullName() {
        assertEquals("AJALA" + " " + "Tolu", account.getFullName());
    }

    @Test
    public void depositTest() {

        account.deposit(500);
        assertEquals(500, account.getBalance("1234"));
    }

    @Test
    public void depositTwice() {

        account.deposit(200);
        account.deposit(700);
        assertEquals(900, account.getBalance("1234"));
    }

    @Test
    public void withdrawalTest() {

        account.deposit(1500);
        account.withdraw(500, "1234");
        assertEquals(1000, account.getBalance("1234"));
    }

    @Test
    public void wrongPinTest() {

        account.deposit(1500);
        account.withdraw(500, "12345");
        assertEquals(0, account.getBalance("0000"));
    }

    @Test
    public void accountBalanceReturnsZeroWithWrongPinTest() {

        account.deposit(2000);
        assertEquals(0, account.getBalance("1111"));
    }

}

