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
public class UserInput2 {

    public static void main(String[] args) {

        System.out.println("Enter the temperature in Fahrenheit");
        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();

        tempInput.close();

        String tempLevel = null;

        // if (temperature >= 84) {
        // tempLevel = "Hot";
        // }
        //
        // if (temperature >= 70 && temperature < 84) {
        // tempLevel = "Warm";
        // }
        //
        // if (temperature >= 55 && temperature < 70) {
        // tempLevel = "Cool";
        // }
        //
        // if (temperature < 55) {
        // tempLevel = "Cold";
        // }

        // String tempLevel = (temperature > 84) ? "Hot"
        // : (temperature >= 70 && temperature < 84) ? "Warm"
        // : (temperature >= 55 && temperature < 70) ? "Cool"
        // : "Cold";

        if (temperature >= 84) {
            tempLevel = "Hot";
        } else if (temperature >= 70) {
            tempLevel = "Warm";
        } else if (temperature >= 55) {
            tempLevel = "Cool";
        } else {
            tempLevel = "Cold";
        }

        System.out.println("Temperature = " + temperature);
        System.out.println("Temperature Level = " + tempLevel);
    }
}
