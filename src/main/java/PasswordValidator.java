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
//    public static boolean containsUpperAndLowerCase(String password);
//    public static boolean isCommonPassword(String password);
//
//
//    //Bonus
//    public static boolean containsSpecialChar(String passowrd, String allowed);
//
//    public static boolean isValidPassword(String password);
}
