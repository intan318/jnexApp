package com.juvenileexecutive.jnexapp.model;

import java.util.ArrayList;

public class DataAsisten {

    public static ArrayList<AssistenMenuModel> generateDataAsisten() {
        ArrayList<AssistenMenuModel> asistenItems = new ArrayList<>();

        asistenItems.add(new AssistenMenuModel("Chat with Juvenna"));
        asistenItems.add(new AssistenMenuModel("Groups"));
        asistenItems.add(new AssistenMenuModel("Forums"));
        asistenItems.add(new AssistenMenuModel("Marketplace"));
        asistenItems.add(new AssistenMenuModel("Events"));


        return asistenItems;
    }
}
