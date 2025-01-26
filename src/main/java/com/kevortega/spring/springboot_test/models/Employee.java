package com.kevortega.spring.springboot_test.models;

public class Employee {
    private int id, age, phoneNumber;
    private String name, lastName, street, job;

    
    public Employee(int id, int age, int phoneNumber, String name, String lastName, String street, String job) {
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.job = job;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
}
