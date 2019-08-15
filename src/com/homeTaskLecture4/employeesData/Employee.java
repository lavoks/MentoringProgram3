package com.homeTaskLecture4.employeesData;

import java.util.Random;

public class Employee {
    public String name;
    public String surname;

    Random random = new Random();
    public int id;
    public Employee(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        id = random.nextInt(1000);
    }

    public Employee(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id){
        this.id = id;
    }

    public void print() {
        System.out.println("Employee name " + name + " surname " + surname + " id " + id);
    }


}
