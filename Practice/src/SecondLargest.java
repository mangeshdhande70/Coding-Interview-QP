public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1,48};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){

            if(num > largest){
                secondLargest = largest;
                largest = num;
            }

            if(num > secondLargest && largest > num){
                secondLargest = num;
            }

        }

        System.out.println("Second largest number is :: "+secondLargest);

    }

}
