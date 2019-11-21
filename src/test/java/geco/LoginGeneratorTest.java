package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService logS = new LoginService(new String[]
            {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

    @Test
    public void generateLoginForNomAndPrenom() {
        //Given
        String nom = "carrieu";
        String prenom = "cyrielle";
        String resultat = "CCAR";
        LoginGenerator log = new LoginGenerator(logS);
        //When
        String newLog = log.generateLoginForNomAndPrenom(nom,prenom);

        //Then
        assertEquals(resultat, newLog);
    }

    @Test
    public void generateLoginForNomAndPrenom2() {
        //Given
        String nom = "Ralling";
        String prenom = "John";
        String resultat = "JRAL2";
        LoginGenerator log = new LoginGenerator(logS);
        //When
        String newLog = log.generateLoginForNomAndPrenom(nom,prenom);

        //Then
        assertEquals(resultat, newLog);
    }
    @Test
    public void generateLoginForNomAndPrenom3() {
        //Given
        String nom = "Rolling";
        String prenom = "Jean";
        String resultat = "JROL1";
        LoginGenerator log = new LoginGenerator(logS);
        //When
        String newLog = log.generateLoginForNomAndPrenom(nom,prenom);

        //Then
        assertEquals(resultat, newLog);
    }
    @Test
    public void generateLoginForNomAndPrenom4() {
        //Given
        String nom = "Dùrand";
        String prenom = "Paul";
        String resultat = "PDUR";
        LoginGenerator log = new LoginGenerator(logS);
        //When
        String newLog = log.generateLoginForNomAndPrenom(nom,prenom);

        //Then
        assertEquals(resultat, newLog);
    }
}