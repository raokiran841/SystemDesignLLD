package org.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String rollNo, name, address;
    private LocalDate dob;

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDob() {
        return dob;
    }
    public Student(String rollNo, String name, String address, LocalDate dob) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob.format(DateTimeFormatter.ofPattern("yyyy, MMM dd")) +
                '}';
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{
        private String rollNo, name, address;
        private LocalDate dob;
        public StudentBuilder rollNo(String rollNo){
            this.rollNo = rollNo;
            return this;
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder address(String addr){
            this.address = addr;
            return this;
        }
        public StudentBuilder dob(LocalDate dob){
            this.dob = dob;
            return this;
        }

        public Student build(){
            return new Student(rollNo, name, address, dob);
        }
    }
}
