package com.example.iliqn.example.model;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String username;
    private char[] password;
    private String firstName;
    private String last_name;
    private String email;
    private String address;
    private int picture_id;
    private String token;
    private boolean isVIP;

    public User(String username, char[] password, String firstName, String last_name, String email, String address, int picture_id, String token, boolean isVIP) {

        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.picture_id = picture_id;
        this.token = token;
        this.isVIP = isVIP;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPicture_id() {
        return picture_id;
    }

    public String getToken() {
        return token;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void postEvent(Event e){
        EventManager.getInstance().addEvent(e);
    }
}
