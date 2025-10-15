
import java.util.List;
import java.util.Locale;

public final class PasswordValidator {

    public static final List<String> commonPasswords = List.of("password", "12345678", "password1", "qwertz123", "asdf1234");


    public static boolean hasMinLength(String password, int min) {
        if(password == null) {
            return false;
        }
        return password.length() >= min;
    }
   public static boolean containsDigit(String password){
        if(password == null) {
            return false;
        }
        char[] chars = password.toCharArray();
        for(char c : chars) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
        return false;
   }
    public static boolean containsUpperAndLowerCase(String password){
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        if(password == null) {
            return false;
        }
        char[] chars = password.toCharArray();
        for(char c : chars) {
            if(Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            if(Character.isUpperCase(c)){
                hasUpperCase = true;
            }
            if(hasLowerCase && hasUpperCase) {
                return true;
            }

        }
        return false;
    }
    public static boolean isCommonPassword(String password){
        if(password == null) {
            return false;
        }
//        if(commonPasswords.contains(password)) {
//            return true;
//        }
        String normalisedPassword = password.trim().toLowerCase(Locale.ROOT);
      for(String common : commonPasswords) {
          if(normalisedPassword.equals(common)) {
              return true;
          }
           }

        return false;
    }
//
//
//    //Bonus
//    public static boolean containsSpecialChar(String passowrd, String allowed);

    public static boolean isValidPassword(String password){
        if(!hasMinLength(password, 8)) {
            return false;
        }
        if(!containsDigit(password)) {
            return false;
        }
        if(!containsUpperAndLowerCase(password)) {
            return false;
        }
        return !isCommonPassword(password);

    }
}

