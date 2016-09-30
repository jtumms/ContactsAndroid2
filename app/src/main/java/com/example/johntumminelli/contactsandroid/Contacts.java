package com.example.johntumminelli.contactsandroid;

import java.io.Serializable;

/**
 * Created by john.tumminelli on 9/29/16.
 */

public class Contacts implements Serializable{
    String name;
    String phone;

    public Contacts (String name, String phone){
        this.name = name;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return String.format("%s  %s", name, phone);

    }
}
