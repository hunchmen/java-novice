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
public class Cookie {

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

    public static String cookieType = "SESSION_COOKIE";

    public Cookie(String id, String userName, String sessionKey,
            int itemsInCart) {

        this.id = id;
        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(int itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Cookie id: %s, userName: %s, sessionKey: %s. itemsInCart: %d",
                id, userName, sessionKey, itemsInCart);
    }
}
