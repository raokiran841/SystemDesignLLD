package org.example;
public interface EmployeeTable {
    public void create(String client, EmployeeObj obj);
    public void delete(String client, EmployeeObj obj);
    public EmployeeObj get(String client, int employeeId);
}