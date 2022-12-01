/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course5.controlstructures;

import java.util.Scanner;

/**
 * 
 * @author via
 * 
 * @date 1 Dec 2022
 */
public class UserInput {

    public static void main(String[] args) {

        System.out.println("Enter the temperature in Fahrenheit");
        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();

        tempInput.close();

        System.out.println("The input temperature is : " + temperature);

        if (temperature >= 84)
            System.out.println("Its a hot day");

    }

}
