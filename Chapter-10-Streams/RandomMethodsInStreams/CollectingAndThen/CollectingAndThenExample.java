import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenExample {

    static class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Naruto", 25800),
                new Employee("Ichigo Kurosaki", 39090),
                new Employee("Kenny Kenpachi", 52050)
        );

        Long aLong = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Employee::getSalary),
                        Math::round
                ));

        System.out.println(aLong);
    }
}

