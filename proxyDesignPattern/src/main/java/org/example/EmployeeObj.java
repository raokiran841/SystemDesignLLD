package org.example;

public class EmployeeObj {
    String name;
    int age;

    public EmployeeObj(){
        this.name = "kiran";
        this.age = 28;
    }
    public String toString(){
      return name + " is " + age + " yrs old";
    }
}
