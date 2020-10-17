public class UserNameValidation {
    public static boolean isUserNameValid(String userName) {
        int size = userName.length();
        if (size > 8 && size < 20) {
            char[] characterList = userName.toCharArray();
            for (char c : characterList) {
                if (Character.isLetter(c)) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUserNameValid("SachinJohn"));
        System.out.println(isUserNameValid("SachinJohn123"));
    }
}
