package com.company;

import com.company.inherit.Tiger;
import com.company.polymorphism.BlackPrinter;
import com.company.polymorphism.ColorPrinter;

public class Main {

    public static void main(String[] args) {
//        Student student = new Student("yy", "02", "male", 18);
//        System.out.println(student.getName());
//        System.out.println(student.getID());
//        System.out.println(student.getGender());
//        System.out.println(student.getAge());

        //for the inherit task
//        Tiger tiger = new Tiger();
//        tiger.call();

        //for the polymorphism task
        //overload
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.printing("red");
        //override
        BlackPrinter blackPrinter = new BlackPrinter();
        blackPrinter.printing();


    }
}
