package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataFeaturedProduct {
    public static ArrayList<FeaturedProductModel> generateDataProduct() {
        ArrayList<FeaturedProductModel> featuredProductModels= new ArrayList<>();

        featuredProductModels.add(new FeaturedProductModel("Title1", "price ", R.drawable.ic_launcher_background));
        featuredProductModels.add(new FeaturedProductModel("Title1", "price ", R.drawable.ic_launcher_background));
        featuredProductModels.add(new FeaturedProductModel("Title1", "price ", R.drawable.ic_launcher_background));
        featuredProductModels.add(new FeaturedProductModel("Title1", "price ", R.drawable.ic_launcher_background));
        featuredProductModels.add(new FeaturedProductModel("Title1", "price ", R.drawable.ic_launcher_background));

        return featuredProductModels;
    }
}
