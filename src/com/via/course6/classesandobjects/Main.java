/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course6.classesandobjects;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author via
 * 
 * @date 5 Dec 2022
 */
public class Main {

    public static void main(String[] args) {

        String someString = new String("Hello String class!");
        String someString1 = new String("Hello String class!");
        System.out.println("Some string: " + someString);

        String anotherString = new String("Another object of type string");
        System.out.println("Another string: " + anotherString);

        System.out.println();

        Date someDate = new Date();
        System.out.println("Some Date: " + someDate);

        Date anotherDate = new Date();
        System.out.println("Another date: " + anotherDate);

        System.out.println();

        Random someRandom = new Random();
        System.out.println("Some random: " + someRandom);

        System.out.println("Equals " + someString.equals(someString));

        System.out.println(someString == someString1);

    }
}
