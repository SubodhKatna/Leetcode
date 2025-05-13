public class StringCOnversionApproach {

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;


        // Testing the palindrome check with different inputs
        System.out.println(isPalindrome(x1));  // true
        System.out.println(isPalindrome(x2));  // false
        System.out.println(isPalindrome(x3));  // false
    }

    // Method to check if the given integer is a palindrome
    private static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }   
        String num = x + ""; // Convert the number to a string
        int length = num.length();
        
        // Check if the number is the same forwards and backwards
        for (int i = 0; i < length / 2; i++) {
            if (num.charAt(i) != num.charAt(length - i - 1)) {
                return false;  // Not a palindrome
            }
        }
        return true;
    }
}
