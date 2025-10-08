package FindUniqueWords;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueWords {

    public static void main(String[] args) {

        String str = "Java is fun and Java is a powerful programming language";

        List<String> uniqueWords = Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .distinct().sorted().collect(Collectors.toList());

        System.out.println("uniqueWords :: "+uniqueWords);


    }

}
