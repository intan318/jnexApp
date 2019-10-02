package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataAge {
    public static ArrayList<AgeModel> generateDataAge() {
        ArrayList<AgeModel> ageItems = new ArrayList<>();

        ageItems.add(new AgeModel("title1", R.mipmap.ic_1));
        ageItems.add(new AgeModel("title2", R.mipmap.ic_2));
        ageItems.add(new AgeModel("title3", R.mipmap.ic_3));
        ageItems.add(new AgeModel("title4", R.mipmap.ic_4));
        ageItems.add(new AgeModel("title5", R.mipmap.ic_5));
        ageItems.add(new AgeModel("title6", R.mipmap.ic_6));
        ageItems.add(new AgeModel("title7", R.mipmap.ic_7));
        ageItems.add(new AgeModel("title8", R.mipmap.ic_8));
        ageItems.add(new AgeModel("title9", R.mipmap.ic_9));
        ageItems.add(new AgeModel("title10", R.mipmap.ic_10));

        return ageItems;
    }
}
