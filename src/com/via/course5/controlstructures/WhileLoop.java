/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.course5.controlstructures;

/**
 * 
 * @author via
 * 
 * @date 5 Dec 2022
 */
public class WhileLoop {

    public static void main(String[] args) {

        String[] treasureChest = {"Book", "Quill", "Gold", "Quill", "Document",
                "Silver", "Gold", "Book", "Book", "Spoon", "Silver", "Gold"};

        String item = "Document";
        boolean itemFound = false;

        int i = 0;

        // while (i < treasureChest.length) {
        // System.out.println("Found " + treasureChest[i]);
        // i++;
        // }

        while (!itemFound) {

            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!");
                itemFound = true;
                continue;
            }

            System.out.printf(
                    "\n%s is not what I wanted. Moving on with the search...",
                    treasureChest[i]);
            i++;
        }

        System.out.println("\nWas the search a success? : " + itemFound);

    }
}
