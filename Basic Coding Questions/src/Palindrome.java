public class Palindrome {

    public static void main(String[] args) {

        String str = "ABCDDCBA";

        System.out.println(isStringPalindrome(str));
        System.out.println(isStringPalindrome("BCAB"));

        System.out.println(isPalindromeString(str));
        System.out.println(isPalindromeString("BCAB"));




    }

    static boolean isStringPalindrome(String input){
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reverseString+= input.charAt(i);
        }

//        System.out.println("reverseString :: "+reverseString);
        if(input.equalsIgnoreCase(reverseString)) return true;
        return false;
    }

    // Best Practice

    static boolean isPalindromeString(String input) {
       int left = 0, right = input.length() - 1;
       while (left < right){
           if(Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))){
               return false;
           }
           left++; right--;
       }
        return true;
    }

    static boolean isPalindromeNumber(int input) {



        return false;
    }
}
