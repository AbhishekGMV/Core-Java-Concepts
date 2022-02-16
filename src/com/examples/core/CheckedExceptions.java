package com.examples.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//java.io package is resources class which has to be closed after using

public class CheckedExceptions {
    //compile time exceptions

    public static void main(String[] args) throws IOException /*throws Exception*/ {
        int n = 0;
        System.out.println("Enter a number: ");
        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));
        //br.readLine();//Compile time error
        //Can be handled by try-catch or giving throws Exception to the method

        try {
            n = Integer.parseInt(br.readLine());
        } /*catch (Exception e){}*/ finally {
            br.close();
            System.out.println("Closed");
        }
        //try-finally block (without catch)
    }
}
