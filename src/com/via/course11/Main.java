/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course11;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava name: " + headFirstJava.getName());

        Book effectiveJava = new Book();
        System.out.println("effectiveJava name: " + effectiveJava.getName());

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println(
                "algorithmsTOLiveBy name: " + algorithmsToLiveBy.getName());

        SelfHelpBook twoAwesomeHourse = new SelfHelpBook();
        System.out
                .println("twoAwesomeHours name: " + twoAwesomeHourse.getName());

    }
}
