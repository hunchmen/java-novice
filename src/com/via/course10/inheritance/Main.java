/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course10.inheritance;

import java.util.Date;

/**
 * 
 * @author via
 * 
 * @date 5 Jan 2023
 */
public class Main {

    public static void main(String[] args) {
        Object object = new Object();

        System.out.println("string representation: " + object.toString());

        Book book = new Book();
        String string = new String("A string");
        @SuppressWarnings("deprecation")
        Date date = new Date("7/11/2022");
        Object obj = new Object();

        System.out.println(book instanceof Book);
        System.out.println(string instanceof String);
        System.out.println(date instanceof Date);
        System.out.println(obj instanceof Object);

        NonFictionBook sapiens = new NonFictionBook();
        NonFictionBook onTheOriginOfSpecies = new NonFictionBook();

        System.out.println(sapiens instanceof NonFictionBook);
        System.out.println(onTheOriginOfSpecies instanceof NonFictionBook);
        System.out.println(sapiens instanceof Book);



    }
}
