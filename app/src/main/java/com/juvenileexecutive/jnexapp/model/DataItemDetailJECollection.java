package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataItemDetailJECollection {
    public static ArrayList<ItemDetailModel> generateDataJECollection(){
        ArrayList<ItemDetailModel> detailItemsJecollection = new ArrayList<>();

        detailItemsJecollection.add(new ItemDetailModel(
                "Booth for Exhibition/Event",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id dui pulvinar, tristique tellus eu, semper mi. Cras rutrum ante massa, non suscipit neque dictum ac. Vestibulum eleifend diam sem, sed ultrices nulla sodales vitae. Integer mi lorem, consequat eu feugiat vitae, auctor et est. Sed in justo rutrum, venenatis massa in, varius est. Fusce sit amet dapibus massa, vel sagittis quam. Morbi auctor libero bibendum, tempor sapien sit amet, sagittis enim. Ut et libero ut sem gravida consequat.",
                R.drawable.ic_launcher_background
        ));
        detailItemsJecollection.add(new ItemDetailModel(
                "Concept & Ideation",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id dui pulvinar, tristique tellus eu, semper mi. Cras rutrum ante massa, non suscipit neque dictum ac. Vestibulum eleifend diam sem, sed ultrices nulla sodales vitae. Integer mi lorem, consequat eu feugiat vitae, auctor et est. Sed in justo rutrum, venenatis massa in, varius est. Fusce sit amet dapibus massa, vel sagittis quam. Morbi auctor libero bibendum, tempor sapien sit amet, sagittis enim. Ut et libero ut sem gravida consequat.",
                R.drawable.ic_launcher_background
        ));
        detailItemsJecollection.add(new ItemDetailModel(
                "Communications Planning",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id dui pulvinar, tristique tellus eu, semper mi. Cras rutrum ante massa, non suscipit neque dictum ac. Vestibulum eleifend diam sem, sed ultrices nulla sodales vitae. Integer mi lorem, consequat eu feugiat vitae, auctor et est. Sed in justo rutrum, venenatis massa in, varius est. Fusce sit amet dapibus massa, vel sagittis quam. Morbi auctor libero bibendum, tempor sapien sit amet, sagittis enim. Ut et libero ut sem gravida consequat.",
                R.drawable.ic_launcher_background
        ));

        return detailItemsJecollection;
    }
}
