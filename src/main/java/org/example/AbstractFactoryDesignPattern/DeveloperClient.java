package org.example.AbstractFactoryDesignPattern;

public class DeveloperClient {


    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(e1.salary());

        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(e2.salary());
    }

}
