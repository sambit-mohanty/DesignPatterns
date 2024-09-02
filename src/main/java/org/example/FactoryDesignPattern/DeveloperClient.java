package org.example.FactoryDesignPattern;

public class DeveloperClient {

    //Employee employee = new AndroidDeveloper(); Tightly coupled. Object creation totally depends on client here
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.salary());

        employee = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee.salary());
    }

}
