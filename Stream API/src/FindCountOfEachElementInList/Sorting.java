package FindCountOfEachElementInList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

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

        List<Employee> ascendingOrder  = employees.stream().sorted(Comparator.comparing(e -> e.getName())).collect(Collectors.toList());

        System.out.println("Ascending Order :: "+ascendingOrder);

        List<Employee> descendingOrder  = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());


        System.out.println("Descending Order  :: "+descendingOrder);

       // For Null Safety

      List<Employee> ascendingOrderWithNameAndThenSalary =  employees.stream().sorted(Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo))
                        .thenComparing(Employee::getSalary, Comparator.nullsLast(Double::compareTo))).collect(Collectors.toList());


        System.out.println("ascendingOrderWithNameAndThenSalary Order  :: "+ascendingOrderWithNameAndThenSalary);


    }

}
