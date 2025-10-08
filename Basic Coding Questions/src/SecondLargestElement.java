// Q.Find Second Largest Element in an Array without sorting

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }

        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is a no second largest :: "+secondLargest);
        }else {
            System.out.println("Second largest element is :: "+secondLargest);
        }


    }

}
