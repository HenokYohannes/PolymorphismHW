package com.class21;

public class MethodOverloadingDemo {

// Check the examples below where & how to overload.


    //public void method(int number) {
        //System.out.println(number);
        //System.out.println("Hello");
        //System.out.println("Java");

// Access modifiers can not help us in methodoverloading


    // static void method(int number)

    // System.out.println(number);
    //  System.out.println("Hello");
    //  System.out.println("Java");
    // { non access modifier Static,finally e.t.c.)

    // can not help us in methodoverloading


    //void method1 (int number){

    //System.out.println(number);
        //System.out.println("Hello");
        //System.out.println("Java");
  //return number;

    // by changing the method name(method1) can not help us methodOverloading

    void method(int num) {
        System.out.println(num);
    }
     //Now I change the datatype & Overloading will happenn

    void method(String name) {
    System.out.println(name);
    System.out.println("Hello");
    System.out.println("Java");
}

    //Now I change the number of parameters (from 1 String to 2 String & int.) & Overloading will happenn
    void method(String name,int num ) {
        System.out.println(num);
        System.out.println("Hello");
        System.out.println("Java");
    }
        //Now I change the sequence of parameters (Int num,String name) & Overloading will happenn

        void method(int num, String name){
            System.out.println(num);
            System.out.println("Hello");
            System.out.println("Java");
        }


        public static void main(String[] args) {

        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.method( 10);
            md.method("Muzit");
            md.method("Muzit", 10);
    }
}
