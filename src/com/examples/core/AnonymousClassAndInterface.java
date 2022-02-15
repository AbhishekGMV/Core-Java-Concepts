package com.examples.core;

class Anonymous {
    void display() {
        System.out.println("This method will be overridden by anonymous class");
    }
}

@FunctionalInterface       //interface with only one "abstract" method
interface AnonymousInterface {
    //Variables will be "final" by default
    String defaultFinalValue = "thisVariableValueCantBeChangedByImplementingClass";

    void notification(); //abstract method

    //Can define method in interface with default keyword
    default void ping() {
    }

    //Static methods can also be created in Interfaces
    static void poke() {
        System.out.println("Poked");
    }
}

public class AnonymousClassAndInterface {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            @Override
            void display() {
                System.out.println("Overridden by anonymous class");
            }
        };
        anonymous.display();

        AnonymousInterface anonymousInterface = () ->
                //Lambda expression can be used when there's only one method in the interface(Functional interface)
                //No need to implement and override the interface methods separately
                System.out.println("Anonymous interface with lambda function");
    }
}
