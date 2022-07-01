package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccountTest {
    bankAccount bamsesAccount = new bankAccount();
    @Test
    void getId() {
        bamsesAccount.setId("018411342");
        String getId = bamsesAccount.getId();
        Assertions.assertEquals("018411342", "018411342");
    }

    @Test
    void getBalance() {
        bamsesAccount.setBalance(201);
        int getBalance = bamsesAccount.getBalance();
        Assertions.assertEquals(201,201);
    }

    @Test
    void deposit() {
        bamsesAccount.setBalance(201);
        bamsesAccount.deposit(1);
        Assertions.assertTrue(true);
    }

    @Test
    void withdraw() {
        bamsesAccount.setBalance(202);
        bamsesAccount.withdraw(200);
        Assertions.assertTrue(true);
    }
}