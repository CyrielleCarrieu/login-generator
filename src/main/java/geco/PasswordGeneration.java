package geco;

import java.util.Random;

public class PasswordGeneration {

    public String getRandomPassword(){
        String motDePasse = "";
        Random rand = new Random();
        for (int i =0; i< 8; i++) {
            char c = (char) (rand.nextInt(10));
            motDePasse += c;
        }
        return motDePasse;
    }

}