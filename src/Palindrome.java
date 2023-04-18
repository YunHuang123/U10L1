public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String check) {
        if (check.length() ==  1 || check.length() == 0){
            return true;
        }
        if (check.charAt(0) != check.charAt(check.length()-1)){
            return false;
        }
        return (isPalindrome(check.substring(1, check.length()-1)));
    }
}
