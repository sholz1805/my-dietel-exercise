package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


        MyAct account = new MyAct("Damola Ademola", "1973");



    @Test
    public void createAccountTest(){

        String name = account.getName();
        assertEquals("Damola Ademola",name);
    }

    @Test
    public void checkIfBalanceIsWorking(){
        int  balance = account.getBalance("1973");
        assertEquals(50000,balance);
    }

    @Test
    public void checkIfDepositIsWorking(){
        int deposit = account.deposit(3000);
        assertEquals(deposit, 53000);
    }
    @Test
    public void checkIfNegativeIsWorking(){
        int deposit = account.deposit(-5999);
        assertEquals(deposit, 50000);
    }

    @Test
    public void checkIfWithdrawalIsWorking(){
        int withdrawal = account.withdraw(10000);
        assertEquals(withdrawal,40000);
    }
    @Test
    public void checkIfWithdrawalCanBeNegative(){

        int withdrawal = account.withdraw(-2000);
        assertEquals(withdrawal,50000);
    }


}
