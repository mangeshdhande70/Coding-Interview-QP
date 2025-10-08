import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

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


        Employee secondHighestEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .distinct().skip(1).findFirst().get();

        Employee secondHighestEmployee1 = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                        .distinct().skip(1).findFirst().get();

        System.out.println("SecondHighestEmployee :: "+secondHighestEmployee);
        System.out.println("SecondHighestEmployee1 :: "+secondHighestEmployee1);

        List<Employee> employeeList = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(
                Employee::getSalary)).collect(Collectors.toList());


    }

}
