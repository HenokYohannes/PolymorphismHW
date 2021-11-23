package com.class21;

public class Car {

    void start() {
        System.out.println("Use keys to start me");
    }

    void stop() {
        System.out.println("Use break to stop me");
    }

    void park() {
        System.out.println("Park me manually");
    }

}
    class BMW extends Car {

        @Override
        void start() {
            System.out.println("Use the Buttom to start me");
        }
    }

    class Tesla extends Car {
        @Override
        void start() {
            System.out.println("Use the Mobile App to start me");
        }
    }
        class Toyota extends Car {

            }


