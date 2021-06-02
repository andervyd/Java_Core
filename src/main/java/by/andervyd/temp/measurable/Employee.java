package by.andervyd.temp.measurable;

import static java.lang.Float.NaN;

public class Employee implements Measurable {
    private String name;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static double average(Measurable[] objects) {
        if (objects.equals(null) || objects.length == 0) {
            return NaN;
        }

        double totalSum = 0.0;
        for (Measurable measure : objects) {
            totalSum += measure.getMeasure();
        }
        return totalSum / objects.length;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public void largest(Measurable[] objects) {
        if (objects.equals(null) || objects.length == 0) {
            System.out.println("List is empty.");
            ;
        }

        double avg = average(objects);
        for (Measurable measure : objects) {
            if (avg < measure.getMeasure()) {
                System.out.println(measure);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee | name: " + name
                + ", department: " + department
                + ", salary: " + salary;
    }
}