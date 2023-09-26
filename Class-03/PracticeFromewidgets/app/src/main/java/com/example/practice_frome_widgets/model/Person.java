package com.example.practice_frome_widgets.model;

public class Person {
    private String name;
    private String lastName;
    private String dni;
    private String gender;

    public Person(String name, String lastName, String dni, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public Person() {
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
