import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class PasswordValidator {

    // dummy password
    public String passwordString = "M!@jat91";
    // split the password into individual chars to loop through next
    public String passwordExploded[] = passwordString.split("");

    // chars
    public String specialChars = "!@#$%^&*()";

    // check if the password is 8 chars long
    @Test
    public void validateLength() {
        Assert.assertEquals(8, passwordString.length());
    }

    // check if the password has 2 special signs in it
    @Test
    public void validateSpecialCharacters() {
        int specialCharsCount = 0;
        for (int i=0;i<passwordExploded.length; i++) {
            if (specialChars.contains(passwordExploded[i])){
                specialCharsCount++;
            }
        }

        Assert.assertEquals(2, specialCharsCount);
    }

    // check if the password has 2 numbers in it
    @Test
    public void validateNumbers() {
        int numberCharCount = 0;
        for (int i=0;i<passwordExploded.length; i++) {
            if (passwordExploded[i].matches("[0-9]")){
                numberCharCount++;
            }
        }

        Assert.assertEquals(2, numberCharCount);
    }

    // check id the password has 1 uppercase letter in it
    @Test
    public void validateCapitalLetters() {
        int capitalCharCount = 0;
        for (int i=0;i<passwordExploded.length; i++) {
            if (passwordExploded[i].matches("[A-Z]")){
                capitalCharCount++;
            }
        }

        Assert.assertEquals(1, capitalCharCount);
    }

    // check if the password starts with a capital letter and ends with a number
    @Test
    public void validateBeginCapitalEndNumber() {
        String beginningChar = passwordExploded[0];
        String endingChar = passwordExploded[7];

        boolean isValid = false;

        if(beginningChar.matches("[A-Z]") && endingChar.matches("[0-9]")){
            isValid = true;
        }

        Assert.assertEquals(true, isValid);
    }
}
