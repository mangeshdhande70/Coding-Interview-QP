import java.util.PriorityQueue;

/**

 QP : Given an array of n elements, where each element is at most k away from its target position,
      return the sorted array.

 Example:

 Input: array[] = {5, 6, 3, 2, 8, 9, 10}        k = 3  Output: array[] = {2, 3, 5, 6, 8, 9, 10}
 Input: array[] = {10, 9, 8, 4, 7, 70, 50, 60}            k = 4 Output: array[] = {4, 7, 8, 9, 10, 50, 60, 70}


 */


class SortedOnK{

    public static void main(String[] args) {

        int array[] = {5, 6, 3, 2, 8, 9, 10};

        sort(3,array);

        int array2[] = {10, 9, 8, 4, 7, 70, 50, 60};
    }

    static void sort(int k, int[] arr){

        int index = 0;
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= k && i < n ; i++) {
            minHeap.add(arr[i]);
        }

        System.out.println("minHeap after 1st for ::"+minHeap);


    }

}