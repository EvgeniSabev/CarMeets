package com.example.iliqn.example.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by iliqn on 14-Jan-17.
 */
public class UserManager {

    private static UserManager ourInstance;
    private HashMap<String, User> users;
    public static UserManager getInstance() {
        if(ourInstance==null) {
            ourInstance = new UserManager();
        }
        return ourInstance;
    }

    private UserManager() {
        this.users = new HashMap<>();
        loadUsers();
    }

    private void loadUsers() {
        //Load users from db;
    }

    public User getUser(String userName) {
        if(users.containsKey(userName)){
            return users.get(userName);
        }
        return null;
    }
}
