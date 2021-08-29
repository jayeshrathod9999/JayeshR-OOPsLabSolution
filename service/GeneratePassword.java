package service;

import java.util.*;

public class GeneratePassword {

    public String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    public String numbers = "0123456789";
    public String specialCharacters = "!@#$%^&*_=+-/.?<>)";

    public String values = capitalLetters + smallLetters + numbers + specialCharacters;
    Random random = new Random();

    public String generatePassword() {
        char password[] = new char[8];
        for (int i = 0; i < password.length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return String.valueOf(password);
    }

}
