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
public class SwitchStatement {

    public static void main(String[] args) {

        System.out.print("Enter a day index: ");
        Scanner dayScanner = new Scanner(System.in);
        int dayIndex = dayScanner.nextInt();
        dayScanner.close();

        switch (dayIndex) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tueday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day index!");
                break;
        }
    }
}
