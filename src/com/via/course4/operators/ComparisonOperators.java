/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course4.operators;

/**
 * 
 * @author via
 * 
 * @date 28 Nov 2022
 */
public class ComparisonOperators {

    public static void main(String[] args) {

        boolean _x = true;
        boolean result = _x == true;
        System.out.println("x == true : " + result);
        System.out.println("x != true : " + result);

        int x = 5;
        int y = 7;

        System.out.println("x < y : " + (x < y));
        System.out.println("x > y : " + (x > y));

        // == opertor, .equals() method
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); // reference or address comparison
        System.out.println(s1.equals(s2)); // content comparison
        System.out.println(s1.equals(s3));
    }
}
