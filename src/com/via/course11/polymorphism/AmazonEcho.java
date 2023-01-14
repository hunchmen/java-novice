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
public class AmazonEcho extends SmartSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    public void alexa() {
        System.out.println("Wake phrase: Alexa");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa");
    }

}
