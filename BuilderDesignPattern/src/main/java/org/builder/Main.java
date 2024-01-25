package org.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Student: "
                + Student.builder()
                .name("mariam")
                .rollNo("CSE-001")
                .address("bangalore")
                .dob(LocalDate.of(1997, 02, 06))
                .build()
        );
    }
}