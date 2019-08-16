package com.homeTaskLecture4.employeesData;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = generateRandomId();
    }

    public Employee() {
        this.id = generateRandomId();
    }

    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    private String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }

    private int getId() {
        return id;
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
        System.out.println("Employee name " + getName() + " surname " + getSurname() + " id " + getId());
    }


}
