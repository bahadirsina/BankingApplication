package com.turkcell;


public class Customer {
 
    Customer(int id, String name, String surname, int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.age = age;
    }
    Customer() {
        
    }
    private String name;
    private String surname;
    private int age;
    private int id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
    if (age < 0 || age > 120) {
        throw new IllegalArgumentException("Age must be between 0 and 120.");
    }
    this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
  

}
