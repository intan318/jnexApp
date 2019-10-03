package com.juvenileexecutive.jnexapp.account.data;

import com.juvenileexecutive.jnexapp.account.model.PersonalMenuModel;

import java.util.ArrayList;

public class DataPersonalMenu {
    public static ArrayList<PersonalMenuModel> generateDataPersonal() {
        ArrayList<PersonalMenuModel> personalItems = new ArrayList<>();

        personalItems.add(new PersonalMenuModel("Chat with ANJELINE"));
        personalItems.add(new PersonalMenuModel("Chat with JESSICA"));
        personalItems.add(new PersonalMenuModel("Chat with JENIVER"));
        personalItems.add(new PersonalMenuModel("Chat with RECEPTIONIST"));

        return personalItems;
    }
}
