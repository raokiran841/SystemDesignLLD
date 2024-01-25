package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeTable employeeTable = new EmployeeTableProxy();
        employeeTable.create("USER", new EmployeeObj());
        System.out.println(employeeTable.get("USER", 100));
    }
}