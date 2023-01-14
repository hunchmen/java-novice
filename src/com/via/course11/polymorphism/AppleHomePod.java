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
public class AppleHomePod extends SmartSpeaker {

    /**
     * 
     */
    public AppleHomePod() {
        super("Apple Home Pod");
    }

    public void siri() {
        System.out.println("Wake phrase: Hey Siri");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Hey Siri");
    }
}
