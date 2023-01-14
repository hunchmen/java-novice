/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course5.controlstructures;

import java.util.Arrays;

/**
 * 
 * @author via
 * 
 * @date 5 Dec 2022
 */
public class RunJavaPrograms {

    public static void main(String[] args) {

        // javac RunJavaPrograms
        // java RunJavaPrograms Document
        // java RunJavaPrograms Document 5

        System.out.println("The input args are: " + Arrays.toString(args));

        String[] treasureChest = {"Book", "Quill", "Gold", "Quill", "Document",
                "Silver", "Gold", "Book", "Book", "Spoon", "Silver", "Gold"};

        String item = args[0];
        boolean itemFound = false;

        System.out.println("Let the search begin for: " + item);

        for (int i = 0; i < treasureChest.length; i++) {

            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!");
                itemFound = true;
                break;
            }

            System.out.printf(
                    "\n%s is not what I wanted. Moving on with the search...",
                    treasureChest[i]);
            i++;
        }

        System.out.println("\nWas the search a success? : " + itemFound);
    }
}
