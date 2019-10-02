package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataProductActivity {
    public static ArrayList<ProductActivityModel> generateDataProduct() {
        ArrayList<ProductActivityModel> productModels = new ArrayList<>();

        productModels.add(new ProductActivityModel("Title1", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title2", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title3", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title4", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title5", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title6", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title7", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title8", "description ", R.drawable.ic_launcher_background));
        productModels.add(new ProductActivityModel("Title9", "description ", R.drawable.ic_launcher_background));
        return productModels;
    }
}
