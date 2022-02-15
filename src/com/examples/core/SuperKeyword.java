package com.examples.core;

class A {
    int a = 1;

    public A() {
        System.out.println("Class A default constructor");
    }

    public A(int num) {
        System.out.println("Class A parameterized constructor");
    }

    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    int b = super.a + 1;  //super keyword to access parent class variable

    public B() {
        System.out.println("Class B Default constructor");
    }

    public B(int num) {
        super(num); //refers to parent class
        System.out.println("Class B parameterized constructor");
    }

    void config() {
        System.out.println("Some config details");
    }

    @Override
    void display() {
        super.display(); //super keyword to invoke parent class method
        //some more code
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B b1 = new B();
        //Prints content of default constructor in A&B

        B b2 = new B(10);
        //Prints content of A's default and B's parameterized constructor (without super)

        A b3 = new B(); //runtime polymorphism
        //Creates object B with reference to A, since B inherits A
        //Only methods in class A will be accessible
        b3.display();
        //Can't access "config()" though it is in class B
    }
}
