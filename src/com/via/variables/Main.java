/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.variables;

import java.util.Date;
import java.util.Scanner;
import com.via.course10.inheritance.Book;

/**
 * 
 * @author via
 * 
 * @date 12 Jan 2023
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the day index: ");
        Scanner dayScanner = new Scanner(System.in);
        int dayIndex = dayScanner.nextInt();
        dayScanner.close();

        switch (dayIndex) {
            case 1:
                System.out.println("Day : Sunday");
            case 2:
                System.out.println("Day : Monday");
            case 3:
                System.out.println("Day : Tuesday");
            case 4:
                System.out.println("Day : Wednesday");
            case 5:
                System.out.println("Day : Thursday");
            case 6:
                System.out.println("Day : Friday");
            case 7:
                System.out.println("Day : Saturday");
        }
    }
}
