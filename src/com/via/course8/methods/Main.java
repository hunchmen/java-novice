/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course8.methods;

/**
 * 
 * @author via
 * 
 * @date 19 Dec 2022
 */
public class Main {

    public static void main(String[] args) {

        // Employee e1 = new Employee("Alex", 2.5, 70000);
        // e1.printDetails();
        //
        // Employee e2 = new Employee("Betty", 5, 65000);
        // e2.printDetails();
        //
        // Employee e3 = new Employee("Carol", 3, 96000);
        // e3.printDetails();

        Employee e1 = new Employee("Alex", 2.5, 70000);
        e1.printDetails();

        System.out.println("***** After Update");

        e1.update("Alix", 3, 72000);
        e1.printDetails();
        System.out.println();

        Employee e2 = new Employee("Betty", 5, 65000);

        String name = e2.getName();
        double experience = e2.getExperience();
        double salary = e2.getSalary();

        System.out.printf("*** Name: %s, Experience: %.2f, Salary: %.2f", name,
                experience, salary);

    }
}
