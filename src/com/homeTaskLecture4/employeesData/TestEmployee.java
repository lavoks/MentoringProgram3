package com.homeTaskLecture4.employeesData;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(11);
        Employee employeeTwo = new Employee("Oksana", "Yakym", 19);
        employeeOne.print();
        employeeTwo.print();
    }
}
