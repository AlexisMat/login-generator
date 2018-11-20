package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private static final String ALEXIS = "ALEXIS";
    private static final String MATEO = "MATEO";
    private LoginService ls;

    @Before
    public void setUp() {
        String[] start =  new String[1];
        start[0] = ALEXIS;
        ls = new LoginService(start);
    }
    @Test
    public void loginExists() {
        boolean res = ls.loginExists(ALEXIS);
        assertTrue(res);
        res = ls.loginExists(MATEO);
        assertFalse(res);
    }

    @Test
    public void addLogin() {
        ls.addLogin("AAA");
        ls.addLogin("AAA");
        List<String> allLogin = ls.findAllLogins();
        assertEquals(3,allLogin.size());
    }

    @Test
    public void findAllLoginsStartingWith() {
        List<String> allLogin = ls.findAllLoginsStartingWith("A");
        assertEquals(1,allLogin.size());
        ls.addLogin("AAA");
        allLogin = ls.findAllLoginsStartingWith("A");
        assertEquals(2,allLogin.size());
        allLogin = ls.findAllLoginsStartingWith("B");
        assertEquals(0,allLogin.size());
    }

    @Test
    public void findAllLogins() {
        List<String> allLogin = ls.findAllLogins();
        assertEquals(1,allLogin.size());
        ls.addLogin("AAA");
        allLogin = ls.findAllLogins();
        assertEquals(2,allLogin.size());
    }
}