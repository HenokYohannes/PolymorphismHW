package com.class21;

public class Student {
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */

    void study() {
        System.out.println(" All students they study hard");
    }

    void PayFee() {System.out.println(" All Students pay fees");
    }

    void useLibrary() {System.out.println(" All Students use Library resources");}

    }

    class SyntaxStudent extends Student {

        @Override
        void study() {
            System.out.println(" They study Java and coding");
        }
    }

 class CollegeStudents extends Student{

    @Override
    void study() {
        System.out.println(" They study social science and politics");
    }
}

 class SchoolStudent extends Student{

    void study() {
        System.out.println(" They have more practical projects");
}


}


