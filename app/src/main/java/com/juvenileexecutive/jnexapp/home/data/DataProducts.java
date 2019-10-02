package com.juvenileexecutive.jnexapp.home.data;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.home.model.ProductsModel;

import java.util.ArrayList;

public class DataProducts {

    public static ArrayList<ProductsModel> generateDataProduct() {
        ArrayList<ProductsModel> productItems = new ArrayList<>();

        productItems.add(new ProductsModel("title1", "description", R.drawable.find_solution));
        productItems.add(new ProductsModel("title2", "description", R.drawable.child));
        productItems.add(new ProductsModel("title3", "description", R.drawable.ask_juvena));
        return productItems;
    }
}
