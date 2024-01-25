package org.example;

public class EmployeeTableProxy implements EmployeeTable{
    EmployeeTable employeeTable;
    public EmployeeTableProxy(){
        this.employeeTable = new EmployeeTableImpl();
    }
    @Override
    public void create(String client, EmployeeObj obj) {
        if(client.equals("ADMIN")){
            employeeTable.create(client, obj);
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public void delete(String client, EmployeeObj obj) {
        if(client.equals("ADMIN")){
            employeeTable.delete(client, obj);
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public EmployeeObj get(String client, int employeeId) {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeTable.get(client, employeeId);
        } else {
            System.out.println("ACCESS DENIED");
        }
        return null;
    }
}
