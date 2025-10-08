public class LongestCoConsecutiveSequence {

    public static void main(String[] args) {

//        String num = "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10";
//        printLongestConsecutiveSequenceIndex(num);
//
//        String n = "1,2,1,3,3,3";
//        printLongestConsecutiveSequenceIndex(n);

        String n = "1,2,2";
        printLongestConsecutiveSequenceIndex(n);

//        String n1 = "1,1,1,1,2,1,3,3,3";
//        printLongestConsecutiveSequenceIndex(n1);
    }


    static void printLongestConsecutiveSequenceIndex(String num){

        String[] arr = num.split(",");
        int maxLength = 1, currentLength = 1;
        int startIndex = 0, endIndex = 0;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i].equals(arr[i -1])){
                currentLength++;
            }else {
                currentLength = 1;
            }

            if(currentLength > maxLength){
                maxLength = currentLength;
                endIndex = i;
            }

        }

        startIndex = (endIndex - maxLength) + 1;

        System.out.println("maxLength :: "+maxLength +" \ncurrentLength :: "+currentLength);
        System.out.println("startIndex :: "+startIndex +" \nendIndex :: "+endIndex);
    }

}
