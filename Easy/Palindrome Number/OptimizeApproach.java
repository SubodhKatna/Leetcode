public class OptimizeApproach {
    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;


        // Testing the palindrome check with different inputs
        System.out.println(isPalindrome(x1));  // true
        System.out.println(isPalindrome(x2));  // false
        System.out.println(isPalindrome(x3));  // false
    }

    private static boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int reversed = 0;
        while (x > reversed){
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        return x == reversed || x == reversed/10;
    }
    
}
