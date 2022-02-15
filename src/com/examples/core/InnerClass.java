package com.examples.core;

class Outer {

    String hereWeGoAgain = "CJ"; //Member variable

    void doesNothing() {  //Member function
    }

    static class StaticInnerClass {
        static void display() {
            System.out.println("Static inner class!");
        }
    }

    class Inner { //Member class -> Outer$inner.class
        void display() {
            System.out.println("Inner class!");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();      //create object of parent class
        Outer.Inner inner = outer.new Inner();  //Create object of member class
        inner.display();

        //Nested static class with static method
        Outer.StaticInnerClass.display();
    }
}
