/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course13;

import java.util.Calendar;

/**
 * 
 * @author via
 * 
 * @date 11 Jan 2023
 */
public interface Automobile {

    String getMake();

    String getModel();

    Double getPrice();

    static String getFormattedCalendarString() {
        Calendar now = Calendar.getInstance();

        return String.format("%s-%s-%s", now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.YEAR));
    }

    default String getReleaseDate() {
        return getFormattedCalendarString();
    }
}
