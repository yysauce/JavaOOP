package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("yy", "02", "male", 18);
        System.out.println(student.getName());
        System.out.println(student.getID());
        System.out.println(student.getGender());
        System.out.println(student.getAge());
    }
}