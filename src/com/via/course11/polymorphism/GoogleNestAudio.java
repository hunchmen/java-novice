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
public class GoogleNestAudio extends SmartSpeaker {

    /**
     * 
     */
    public GoogleNestAudio() {
        super("Google Nest Audio");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Ok Google");
    }
}
