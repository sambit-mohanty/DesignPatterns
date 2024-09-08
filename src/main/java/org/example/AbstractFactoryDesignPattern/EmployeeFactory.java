package org.example.AbstractFactoryDesignPattern;

//this class is responsible for creating classes
public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
