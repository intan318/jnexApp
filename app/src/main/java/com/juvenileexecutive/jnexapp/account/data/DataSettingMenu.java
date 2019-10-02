package com.juvenileexecutive.jnexapp.account.data;

import com.juvenileexecutive.jnexapp.account.model.SettingMenuModel;

import java.util.ArrayList;

public class DataSettingMenu {
    public static ArrayList<SettingMenuModel> generateDataSetting() {
        ArrayList<SettingMenuModel> settingItems = new ArrayList<>();

        settingItems.add(new SettingMenuModel("Password"));
        settingItems.add(new SettingMenuModel("Members"));
        settingItems.add(new SettingMenuModel("Profile"));
        settingItems.add(new SettingMenuModel("Privacy"));
        settingItems.add(new SettingMenuModel("Localization"));


        return settingItems;
    }

}
