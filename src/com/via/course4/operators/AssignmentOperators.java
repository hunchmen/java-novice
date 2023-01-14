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
public class AssignmentOperators {

    public static void main(String[] args) {

        int varInt1 = 10, varInt2 = 5;
        System.out.println("varInt1 = " + varInt1);
        System.out.println("varInt2 = " + varInt2);

        varInt1 = varInt1 + 1;
        System.out.println("\nvarInt1 after increment: " + varInt1);

        varInt2 = varInt2 - 1;
        System.out.println("varInt2 after decrement: " + varInt2);

        /** ############## */
        int a = 10, b = 5, c = 0, d = 0;
        System.out.println("\ninitial values:");
        System.out.println("a = " + a + "\tb = " + b);
        System.out.println("c = " + c + "\td = " + d);

        c = a++;
        d = ++b;
        System.out.println("\nAfter increments");
        System.out.println("a = " + a + "\tb = " + b);
        System.out.println("c = " + c + "\td = " + d);

    }
}
