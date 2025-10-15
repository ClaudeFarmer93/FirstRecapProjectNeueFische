import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
     void hasMinLength_shouldReturnTrue_whenPasswordHasLength8(){
        String password = "qwertzui";
        boolean expected = true;
        boolean actual = PasswordValidator.hasMinLength(password,8);
        assertEquals(expected, actual);

    }
    @Test
    void hasMinLength_shouldReturnFalse_whenPasswordHasLength7(){
        String password = "qwertzu";
        boolean expected = false;
        boolean actual = PasswordValidator.hasMinLength(password,8);
        assertEquals(expected, actual);
    }
    @Test
   void hasMinLength_shouldReturnFalse_WhenPasswordIsEmpty(){
        String password = "";
        boolean expected = false;
        boolean actual = PasswordValidator.hasMinLength(password,8);
        assertEquals(expected, actual);
    }
    @Test
    void hasMinLength_shouldReturnFalse_WhenPasswordIsNull(){
        boolean expected = false;
        boolean actual = PasswordValidator.hasMinLength(null,8);
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldReturnTrue_whenPasswordContainsDigit(){
        String password = "qwertzu1";
        boolean expected = true;
        boolean actual = PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_shouldReturnFalse_WhenPasswordContainsNoDigit(){
        String password = "qwertzue";
        boolean expected = false;
        boolean actual = PasswordValidator.containsDigit(password);
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_shouldReturnTrue_WhenPasswordIsAllDigits(){
        String password = "12345678";
        assertTrue(PasswordValidator.containsDigit(password));
    }
    @Test
    void containsDigit_shouldReturnTure_WhenPasswordMoreDigits(){
        String password = "q3er3t4u";
        assertTrue(PasswordValidator.containsDigit(password));
    }
}
