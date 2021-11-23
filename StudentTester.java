package com.class21;


import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudents(),new SchoolStudent()};

       // Car[] cars = {new BMW(), new Tesla(), new Toyota()};

        for (Student student : students

        ) {
            student.study();
            student.PayFee();
            student.useLibrary();
        }
    }

}