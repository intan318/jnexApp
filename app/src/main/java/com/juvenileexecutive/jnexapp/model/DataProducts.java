package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataProducts {

    public static ArrayList<ProductsModel> generateDataProduct() {
        ArrayList<ProductsModel> productItems = new ArrayList<>();

        productItems.add(new ProductsModel("title1", "description", R.drawable.find_solution));
        productItems.add(new ProductsModel("title2", "description", R.drawable.child));
        productItems.add(new ProductsModel("title3", "description", R.drawable.ask_juvena));
        productItems.add(new ProductsModel("title4", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title5", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title6", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title7", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title8", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title9", "description", R.drawable.ic_launcher_background));
        productItems.add(new ProductsModel("title10", "description", R.drawable.ic_launcher_background));

        return productItems;
    }
}
