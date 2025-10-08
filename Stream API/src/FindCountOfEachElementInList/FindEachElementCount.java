package FindCountOfEachElementInList;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindEachElementCount {

    public static void main(String[] args) {

        List<String> colours = Arrays.asList("red", "white", "black", "white", "black","green", "red");

        Map<String, Long> countMap = colours.stream().collect(Collectors.groupingBy(colour -> colour, Collectors.counting()));
        System.out.println("count map :: "+countMap);

        Map<String, Long> ascendingSort = colours.stream().collect(Collectors.groupingBy(col -> col, Collectors.counting()))
                 .entrySet().stream()
                 .sorted(Map.Entry.comparingByKey())
                 .collect(
                         Collectors.toMap(
                                 Map.Entry::getKey,
                                 Map.Entry::getValue,
                                 (e1, e2) -> e1,
                                 LinkedHashMap::new
                         )
                 );

//        Map.Entry::getKey Extracts the key from each map entry.
//        This becomes the key in the new map.

//        Map.Entry::getValue Extracts the value from each map entry.
//        This becomes the value in the new map.

//        (e1, e2) -> e1, This is the merge function.
//        It decides what to do if there are duplicate keys.
//        Here, (e1, e2) -> e1 means:
//        If the same key appears more than once, keep the first value (e1) and ignore the second (e2).

//        LinkedHashMap::new
//        The map supplier (which type of map to create).
//        LinkedHashMap is used here because it preserves insertion order.
//        This is very important since we sorted the entries already — if we used a normal HashMap, the order would be lost.


        System.out.println("ascendingSort :: "+ascendingSort);


        List<Integer> numbers = Arrays.asList(4, 2, 4, 5, 2, 3, 1);

        Map<Integer, Long> countNumber = numbers.stream().collect(Collectors.groupingBy(num -> num , Collectors.counting()));

        System.out.println("Count Numbers :: "+countNumber);

        // To Find all repeating elements in an array

      Map<Integer, Long> repeatedNumbers  =  numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        HashMap::new
                ));

        System.out.println("repeatedNumbers :: "+repeatedNumbers);

    }

}
