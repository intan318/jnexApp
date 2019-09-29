package com.juvenileexecutive.jnexapp.model;

import java.util.ArrayList;

public class DataInfoAccount {
    public static ArrayList<InfoAccountModel> generateDataInfoAccount(){
        ArrayList<InfoAccountModel> accountItems = new ArrayList<>();

        accountItems.add(new InfoAccountModel("About Account"));
        accountItems.add(new InfoAccountModel("Members"));
        accountItems.add(new InfoAccountModel("Profile"));
        accountItems.add(new InfoAccountModel("Business Center"));
        accountItems.add(new InfoAccountModel("Device Request"));
        accountItems.add(new InfoAccountModel("GO LIVE"));

        return accountItems;

    }
}
