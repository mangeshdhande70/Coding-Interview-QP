// Two strings are anagrams if they contain exactly the same characters in any order, ignoring spaces and case

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";

        String str3 = "car";
        String str4 = "rat";

        System.out.println(isValidAnagram(str1, str2));

        System.out.println(isValidAnagram(str3, str4));


    }

    static boolean isValidAnagram(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);

         return Arrays.equals(c1,c2);




    }

}
