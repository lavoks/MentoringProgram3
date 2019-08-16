package com.homeTaskLecture4.employeesData;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee("Gigi", "Hadid");
        employeeOne.print();
        employeeTwo.print();
        employeeOne.setName("Anjelina");
        employeeOne.setSurname("Jolie");
        employeeOne.print();
    }
}
