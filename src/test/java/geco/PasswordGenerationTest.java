package geco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private static PasswordGeneration passwordG;

    @Before
    public void init() {
        passwordG = new PasswordGeneration();
        assertNotNull(passwordG);
    }

    @Test
    public void getRandomPasswordTest() {
       int expected = 8;
       assertEquals(8,passwordG.getRandomPassword().length());
    }
}
