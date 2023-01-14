/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.variables;

import java.util.Arrays;

/**
 * 
 * @author via
 * 
 * @date 19 Nov 2022
 */
public class DataTypes {

    public static void main(String[] args) {

        boolean isJavaFun = true;
        byte numCredits = 3;
        char myGrade = 'A';
        short numCourse = 4;
        int age = 19;
        long tuituinPaid = 23983L;
        float gpa = 10e3f;
        double incomeEarned = 8283.98d;

        System.out.println("Is Java Fun To learn? : " + isJavaFun);
        System.out.println("Number of credits for the course : " + numCredits);
        System.out.println("The students grade in the course : " + myGrade);
        System.out
                .println("The number of courses the student has enrolled in : "
                        + numCourse);
        System.out.println("The age of the student : " + age);
        System.out.println(
                "Cumulative tuition paid by the student : " + tuituinPaid);
        System.out.println("The student GPA : " + gpa);
        System.out.println("Earned income : " + incomeEarned);

        // ##############
        byte varByte = 30;
        System.out.println("byte value is : " + varByte);

        byte newVarByte = 127;
        System.out.println("byte value is : " + newVarByte);

        // ##############
        String name = "Fiona";
        String name2 = new String();
        System.out.println("The name is : " + name2);

        String[] carBrands = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Car brands: " + carBrands);

        String carBrandsString = Arrays.toString(carBrands);
        System.out.println("The string of car brands : " + carBrandsString);
        System.out.println("Numbers of car brands: " + carBrands.length);

    }
}
