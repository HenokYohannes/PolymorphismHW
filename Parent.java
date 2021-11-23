package com.class21;

public class Parent {
    void method(int num) {
        System.out.println(" From Parent");

    }
}

class Child extends Parent {
    @Override
    void method(int num) {
        System.out.println(" From Child");

        // if we try to change the return type from void in child class to int
        //Parent'; attempting to use incompatible return type error will appear.
        // Parent Class & Child class must have the same return type.
    }

   // void method(String name) {
      //  System.out.println(" From Child");

    // If we use this method we are doing Overloading & overriding at the same time
    // line 19 & line 11 they are Overloading, and line 11 & line 4 are Overriding

    }


    //  class child extends Parent {
//   @Override
//    public void method(int num) {  // Parent class default & child class public is possible
//       System.out.println(num);    // Parent class default child class private is not possible

// Can not decrease the visibility ( check the Parent class vethod it is public void)


    class Tester1 {
        public static void main(String[] args) {

    }

}
