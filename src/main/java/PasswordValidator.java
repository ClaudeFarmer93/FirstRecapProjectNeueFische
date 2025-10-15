public final class PasswordValidator {

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
        String[] commonPasswords = {"password", "12345678", "Password1", "QWERTZ123"};
        for(String commonPassword : commonPasswords) {
            if(password.toLowerCase().equals(commonPassword.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
//
//
//    //Bonus
//    public static boolean containsSpecialChar(String passowrd, String allowed);
//
//    public static boolean isValidPassword(String password);
}
