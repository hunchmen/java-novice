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
public class Employee {

    private String name = "";
    private double experience = 0.0;
    private double salary = 0.0;

    public Employee(String name, double experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    /**
     * 
     */
    public void printDetails() {
        System.out.println("\n*** In printDetails()");
        System.out.println("Name: " + name + " Years of Experience: "
                + experience + " Salary: " + salary);

        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void update(String name, double experience, double salary) {
        setName(name);
        setExperience(experience);
        setSalary(salary);
    }

}
