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
}
