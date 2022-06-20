package com.company;

public class Student {

    private String name;
    private String ID;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String ID, String gender, int age) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
