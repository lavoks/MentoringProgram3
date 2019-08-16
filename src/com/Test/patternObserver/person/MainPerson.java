package com.Test.patternObserver.person;

public class MainPerson {
    public static void main(String[] args) {
        PersonsData personNumberOne = new PersonsData();
        personNumberOne.setName("Oksana");
        personNumberOne.setSurname("Lavr");
        personNumberOne.setEmail("@mail");
        personNumberOne.print();
        PersonsData personNumberTwo = new PersonsData("vlad","yak", "mail");
        personNumberTwo.print();

        personNumberTwo.getEmail();
        personNumberTwo.print();
    }
}
