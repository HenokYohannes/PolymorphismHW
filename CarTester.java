package com.class21;

import java.util.Arrays;

public class CarTester {
    public static void main(String[] args) {

//
//        BMW bmw = new BMW();
//        bmw.start();
//        bmw.stop();
//        bmw.park();
//
//
//        Tesla tesla=new Tesla();
//        tesla.start();
//        tesla.stop();
//        tesla.park();
//
//
//        Toyota toyota =new Toyota();
//        toyota.start();
//        toyota.stop();
//        toyota.stop();
 // we could do it this way but with Polymorphism we can achieve different behaviors in single action.

        Car[] cars = {new BMW(), new Tesla(), new Toyota()};
        for (Car car : cars

        ) {
            car.start();
            car.stop();
            car.park();
        }


    }
}