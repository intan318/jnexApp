package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataItemCart {
    public static ArrayList<ItemCartModel> generateData() {
        ArrayList<ItemCartModel> cartItems = new ArrayList<>();

        cartItems.add(new ItemCartModel("Web Development", R.drawable.ic_launcher_background));
//        cartItems.add(new ItemCartModel("Mobile App Development", R.drawable.ic_launcher_background));
//        cartItems.add(new ItemCartModel("Content Strategy", R.drawable.ic_launcher_background));

        return cartItems;
    }
}
