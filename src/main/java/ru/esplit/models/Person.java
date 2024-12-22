package ru.esplit.models;

public class Person {
    private int id;
    private String name;
    //private String surname;

    public Person() {

    }

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        //this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public String getSurname() {
    //    return this.surname;
    //}

    //public void setSurname(String surname) {
    //    this.surname = surname;
    //}
}

    
