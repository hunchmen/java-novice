/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course11.polymorphism;

/**
 * 
 * @author via
 * 
 * @date 7 Jan 2023
 */
public class Main {

    public static void main(String[] args) {

        // SmartSpeaker smartSpeaker = new SmartSpeaker("Google Nest");
        SmartSpeaker googleNestAudio = new GoogleNestAudio();
        SmartSpeaker amazonEcho = new AmazonEcho();
        SmartSpeaker appleHomePod = new AppleHomePod();
        SmartSpeaker sonosOne = new SonosOne();

        System.out.println(
                "googleNestAudio name: " + googleNestAudio.getProductName());
        System.out.println("amazonEcho name: " + amazonEcho.getProductName());
        System.out
                .println("appleHomePod name: " + appleHomePod.getProductName());
        System.out.println("sonosOne name: " + sonosOne.getProductName());

        System.out.println();

        // amazonEcho.alexa();
        // appleHomePod.siri();

        System.out.println();

        googleNestAudio.wakePhrase();
        amazonEcho.wakePhrase();
        appleHomePod.wakePhrase();
        sonosOne.wakePhrase();

    }
}
