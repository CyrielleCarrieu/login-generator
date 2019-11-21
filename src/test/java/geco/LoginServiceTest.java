package geco;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {


    @Test
    public void loginExists() {
        //GIVEN
        String[] loginsExistants ={"nom","g,jhg"};
        LoginService log = new LoginService(loginsExistants);
        //WHEN
        boolean exist = log.loginExists("nom");
        //THEN
        assertTrue(exist);
    }
    @Test
    public void loginExists2() {
        //GIVEN
        String[] loginsExistants ={"nom","g,jhg"};
        LoginService log = new LoginService(loginsExistants);
        //WHEN
        boolean exist = log.loginExists("jhgfd");
        //THEN
        assertFalse(exist);
    }

    @Test
    public void addLogin() {
        //GIVEN
        String[] loginsExistants ={"nom","g,jhg"};
        LoginService log = new LoginService(loginsExistants);
        //WHEN
        log.addLogin("nrhts");
        boolean exist = log.loginExists("nrhts");
        //THEN
        assertTrue(exist);
    }

    @Test
    public void addLogin2() {
        //GIVEN
        String[] loginsExistants ={"nom","g,jhg"};
        LoginService log = new LoginService(loginsExistants);
        //WHEN
        log.addLogin("nrhts");
        boolean exist = log.loginExists("jej");
        //THEN
        assertFalse(exist);
    }


    @Test
    public void findAllLoginsStartingWith() {
        //GIVEN
        String[] loginsExistants ={"nom","g,jhg","non"};
        LoginService log = new LoginService(loginsExistants);
        List<String> liste;
        //WHEN
        liste = log.findAllLoginsStartingWith("no");
        //THEN
        assertEquals("[nom, non]", liste.toString());
    }

    @Test
    public void findAllLogins() {
        //GIVEN
        String[] loginsExistants ={"nom","jhg"};
        LoginService log = new LoginService(loginsExistants);
        List<String> liste;
        //WHEN
        liste = log.findAllLogins();
        //THEN
        assertEquals("[jhg, nom]", liste.toString());
    }
}