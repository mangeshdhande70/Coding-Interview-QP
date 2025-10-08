package FindSecondHighestSalaryEmployee;

import FindCountOfEachElementInList.Employee;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighestSalaryEmployee {

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

        Employee secondHighestSalaryEmployee = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .distinct().skip(1).findFirst().get();

        System.out.println("secondHighestSalaryEmployee :: "+secondHighestSalaryEmployee);

    }

}
