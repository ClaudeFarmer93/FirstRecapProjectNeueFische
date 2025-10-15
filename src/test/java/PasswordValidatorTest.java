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

    @Test
    void containsUpperAndLowerCase_shouldReturnTrue_whenUpperAndLowerCase(){
        String password = "QWerweT";
//        boolean expected = true;
        assertTrue(PasswordValidator.containsUpperAndLowerCase(password));
    }
    @Test
    void containsUpperAndLowerCase_shouldReturnFalse_whenOnlyUpper(){
        String password = "ERORHMEVEOBH";
        assertFalse(PasswordValidator.containsUpperAndLowerCase(password));
    }
    @Test
    void containsUpperAndLowerCase_shouldReturnFalse_whenOnlyLower(){
        String password = "ererogmeofegh";
        assertFalse(PasswordValidator.containsUpperAndLowerCase(password));
    }
    @Test
    void containsLowerAndUpperCase_shouldReturnFalse_whenOnlyOneChar(){
        String password = "p";
        assertFalse(PasswordValidator.containsUpperAndLowerCase(password));
    }

    @Test
    void isCommonPassword_shouldReturnTure_whenCommonPassword(){
        String password = "password";
        boolean expected = true;
        boolean actual = PasswordValidator.isCommonPassword(password);
        assertEquals(expected, actual);
    }
    @Test
    void isCommonPassword_shouldReturnFalse_whenNotCommonPassword(){
        String password = "Wvjod35Fc$";
        boolean expected = false;
        boolean actual = PasswordValidator.isCommonPassword(password);
        assertEquals(expected, actual);
    }
}
