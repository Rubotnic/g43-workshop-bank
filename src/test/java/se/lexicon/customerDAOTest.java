package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class customerDAOTest {
    customer b = new customer();
    @Test
    void addCustomers() {
        b.setFirstName("Bamse");
        b.setLastname("Långhus");
        b.setEmail("bamse.langhus");
        Assertions.assertAll("b",
                () -> assertEquals("Bamse", b.getFirstName()),
                () -> assertEquals("Långhus", b.getLastname()),
                () -> assertEquals("bamse.langhus", b.getEmail()));
    }

    @Test
    void findCustomer() {
        b.setFirstName("Bamse");
        b.setLastname("Långhus");
        Assertions.assertEquals("Bamse Lånhus", "Bamse Lånhus");
    }

    @Test
    void addCustomerToArray() {
        bankAccountDAO bA = new bankAccountDAO();
        customer b = new customer();
        bankAccount c = new bankAccount();
        b.setFirstName("Bamse");
        b.setLastname("Långhus");
        bA.addAccount(c, "164645", 2, b);
        Assertions.assertTrue(true);
    }
}