package org.example;

public class EmployeeTableImpl implements EmployeeTable {
    @Override
    public void create(String client, EmployeeObj obj) {
        System.out.println("created an employee");
    }

    @Override
    public void delete(String client, EmployeeObj obj) {
        System.out.println("deleted an employee");
    }

    @Override
    public EmployeeObj get(String client, int employeeId) {
        return new EmployeeObj();
    }
}
