package com.examples.core;

interface displayInterface {
    //Use implements keyword
    //Cannot define any method unlike abstract classes

    void display();
}

class NotificationClass {
    void notification() {
        System.out.println("Some Notification");
    }
}

class Implementor extends NotificationClass implements displayInterface {
    //Can achieve multiple inheritance
    //Extends keyword should appear before implements

    @Override
    public void display() {
        System.out.println("Lorem ipsum");
    }

    @Override
    void notification() {
        super.notification();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        //Can create only reference to interface
        displayInterface demo = new Implementor();
        demo.display();

        //Need to create Implementor object since Notification method is not in displayInterface
        Implementor im = new Implementor();
        im.notification();
    }
}
