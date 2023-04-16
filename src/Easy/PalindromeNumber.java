package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
       String isPallindrome = Integer.toString(x);
       int L = 0, R = isPallindrome.length() - 1;
       while (L < R) {
           char startChar = isPallindrome.charAt(L);
           char endChar = isPallindrome.charAt(R);

           if(startChar != endChar)
               return false;
           else {
               L++;
               R--;
           }
       }
       return true;
    }
}
