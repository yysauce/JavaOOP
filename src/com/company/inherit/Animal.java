package com.company.inherit;

public class Animal {

    public int age;
    public int weight;

    public Animal() {
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void running(){
        System.out.println("Animal Run !");
    }

    public void eating(){
        System.out.println("Animal Eat !");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
