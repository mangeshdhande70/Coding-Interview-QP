public class ReverseOfString {

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println("Reverse String Using StringBuilder :: "+ reverseStringUsingStringBuilder(str));

        System.out.println("Reverse String manually :: "+ reverseString(str));
    }

    static String reverseString(String input){
       char[] ch  =   input.toCharArray();
       int left = 0, right = input.length() - 1;
       while (left < right){
           char temp = ch[left];
           ch[left] = ch[right];
           ch[right] = temp;

           left++; right--;
       }
       return new String(ch);
    }

    static StringBuilder reverseStringUsingStringBuilder(String input){

        if(input == null){
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse();
    }


}


