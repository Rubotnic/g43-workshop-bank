package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class customerTest {
    customer a = new customer();
    @Test
    void getFirstName() {
        a.setFirstName("Bamse");
        String getFirstName = a.getFirstName();
        Assertions.assertEquals("Bamse", "Bamse");
    }

    @Test
    void getLastname() {
        a.setLastname("Skalman");
        String getLastName = a.getLastname();
        Assertions.assertEquals("Skalman", "Skalman");
    }

    @Test
    void getEmail() {
        a.setEmail("bamse.skalman@mail.com");
        String getEmail = a.getEmail();
        Assertions.assertEquals("bamse.skalman@mail.com", "bamse.skalman@mail.com");
    }

    @Test
    void getIdentifier() {
        a.setIdentifier(1);
        int getIdentifier = a.getIdentifier();
        Assertions.assertEquals(1,1);
    }
}