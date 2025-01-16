public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12231)); //false
        System.out.println(isPalindrome(121)); //true

    }

    public static boolean isPalindrome(int x) {
        System.out.println(100%10);
        String value = String.valueOf(x);
        int size = value.length() / 2;
        int last = value.length() - 1;
        for(int i = size; i >= 0; i--){
            if(!(value.charAt(i) == value.charAt(last - i))){
                return false;
            }
        }
        return true;
    }
}