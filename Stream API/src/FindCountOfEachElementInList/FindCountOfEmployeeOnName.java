package FindCountOfEachElementInList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCountOfEmployeeOnName {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee("Akash", 50000d),
                new Employee("Ketan", 50000d),
                new Employee("Prashant", 60000d),
                new Employee("Praful", 70000d),
                new Employee("Mahesh", 80000d),
                new Employee("Mahesh", 90000d),
                new Employee("Akash", 80000d)
        );

       Map<String, Long> countMap = employees.stream().collect(Collectors.groupingBy
               (employee -> employee.getName(), Collectors.counting()));

        System.out.println("Count Employee Map :: "+countMap);

    }

}
