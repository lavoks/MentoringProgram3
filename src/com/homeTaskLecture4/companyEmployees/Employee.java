package com.homeTaskLecture4.companyEmployees;
import java.util.Random;
public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname, int id){
        this.name=name;
        this.surname=surname;
        Random random = new Random();
        this.id=random.nextInt(500);
    }
    public Employee(int id){
        Random random = new Random();
        this.id =random.nextInt(500);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void print() {
        System.out.println(getName(), getSurname(), getId());
    }

}
