package by.andervyd.temp.measurable;

public class EmployeeRunner {
    public static void main(String[] args) {


        Measurable[] emptyList = {};

        Measurable[] list = {
                new Employee("Bob", "IT", 2300),
                new Employee("Lee", "HR", 2500),
                new Employee("Bee", "MG", 1800),
                new Employee("Roy", "IT", 2100)
        };

        double average = Employee.average(list);
        System.out.println("Average salary: " + average);

        new Employee().largest(list);
    }
}