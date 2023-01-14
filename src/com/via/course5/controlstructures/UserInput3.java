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
public class UserInput3 {

    public static void main(String[] args) {
        // int count = 3;
        //
        // for (int i = 0; i < count; i++) {
        // System.out.printf("\nMessage %d: Welcome to Java Programmin!",
        // i + 1);
        // }

        Scanner numberInput = new Scanner(System.in);
        System.out.println("How many time should I repeat the message? : ");

        int count = numberInput.nextInt();

        numberInput.close();

        for (int i = 0; i < count; i++) {
            System.out.printf("\nMessage %d: Welcome to Java Programmin!",
                    i + 1);
        }
    }
}
