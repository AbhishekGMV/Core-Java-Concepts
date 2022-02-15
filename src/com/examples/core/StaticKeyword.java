package com.examples.core;

class Employee {
    static String ceo;

    static {        //static block will be executed only once, when class is loaded
        ceo = "John";
    }

    int id;
//    static String ceo = "John"; //Common for all the Employees
    String title;


    Employee(int id, String title) {
        this.id = id;
        this.title = title;
//        this.ceo = ceo;    No need to assign the value of ceo as it's same for every instance (static)
    }

    public static String getCEO() {
        return Employee.ceo; //static methods can only have static variables in them
    }

    public String getEmployeeData() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", CEO='" + ceo + '\'' +
                '}';
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Employee ben = new Employee(1, "SDE");
        System.out.println(ben.getEmployeeData());
        System.out.println(Employee.getCEO()); //Static members can be invoked without creating an instance of class
        Employee.ceo = "Ryan"; //Changing value of static variables reflects in all the objects
        Employee kelly = new Employee(2, "UI/UX");
        System.out.println(kelly.getEmployeeData());
    }
}
