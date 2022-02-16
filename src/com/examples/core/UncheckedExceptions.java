package com.examples.core;

public class UncheckedExceptions {
    //Runtime exceptions

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
            //Raises divide by zero exception
            //Any statements below this(in try block) won't be executed
            //if this exception is raised

            int[] arr = null;
            arr[1] = 10;

            //Raises null pointer exception
            //This exception will not be reached if there's another
            //exception encountered before this

            arr = new int[]{1, 2, 3};
            System.out.println(arr[4]);
            //Array indexed out of bounds exception

        } catch (ArithmeticException ae) {
            System.err.println("Caught arithmetic exception: " + ae);
        } catch (NullPointerException ne) {
            System.err.println("Caught null pointer exception: " + ne);
        } catch (Exception e) {
            System.err.println("Caught exception: " + e);
        }
    }
}
