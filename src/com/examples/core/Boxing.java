package com.examples.core;

public class Boxing {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt; //Boxing(auto)
        int unboxedInt = boxedInt.intValue(); //Unboxing
        int autoUnboxedInt = boxedInt; //auto-unboxing
    }
}
