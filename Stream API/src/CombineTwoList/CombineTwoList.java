package CombineTwoList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineTwoList {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,3,5,7);
        List<Integer> list2 = Arrays.asList(2,4,6,10);

        List<Integer> combineList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        System.out.println("combineList ::"+combineList);

    }

}
