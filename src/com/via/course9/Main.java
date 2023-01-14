/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course9;

/**
 * 
 * @author via
 * 
 * @date 3 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        Cookie c1 = new Cookie("abc12", "Alice22", "ali@22", 2);
        System.out.println("\n(c1): " + c1.cookieType);

        Cookie c2 = new Cookie("abc22", "Bob667", "B#t12", 0);
        System.out.println("\n(c2): " + c2.cookieType);

        Cookie c3 = new Cookie("abc34", "Charles", "C223", 4);
        System.out.println("\n(c3): " + c3.cookieType);

        Product phone =
                new Product(12345, "iPhone 6s", 500, "Mobile and Accessories");

        Product tv = new Product(84773, "Samsung", 1500, "Electronics");

        System.out.println("Phone: " + phone);
        System.out.println("TV: " + tv);

    }
}
