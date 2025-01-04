//2. Valid Palindrome

public class Jaseel_2 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(Valid_Palindrome(s));
    }
    static boolean Valid_Palindrome(String s){
        s = s.toLowerCase();
        int last = s.length() - 1;
        int first = 0;

        while (first <= last) {
            if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            else {
                if (s.charAt(first) != s.charAt(last)) {
                    return false;
                }
                first++;
                last--;
            }
        }
        return true;
    }
}
