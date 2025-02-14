package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.home.adapter.RvItemAgeAdapter;
import com.juvenileexecutive.jnexapp.home.adapter.RvProductsAdapter;
import com.juvenileexecutive.jnexapp.home.model.AgeModel;
import com.juvenileexecutive.jnexapp.home.data.DataAge;
import com.juvenileexecutive.jnexapp.home.data.DataProducts;
import com.juvenileexecutive.jnexapp.home.model.ProductsModel;

import java.util.ArrayList;
import java.util.List;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class HomeFragment extends Fragment {
    FlipperLayout flipper;
    Context context;
    List<ProductsModel> productsModelList;
    List<AgeModel> ageModelList;

    private ArrayList<String> mTitleAge = new ArrayList<>();
    private ArrayList<String> mImageAge = new ArrayList<>();

    private View HomeView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeView = inflater.inflate(R.layout.fragment_home, container, false);
        return HomeView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        flipper = view.findViewById(R.id.flipper);
        setLayoutSlider();
        Toolbar myToolbar = view.findViewById(R.id.my_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(myToolbar);

        Log.d(TAG, "initRecyclerView: init recyclerview");

        // getItemLayoutAge();


        // setup recyclerview for age button
        LinearLayoutManager layoutManagerAge = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewAge = view.findViewById(R.id.rv_age);
        ageModelList = DataAge.generateDataAge();
        recyclerViewAge.setLayoutManager(layoutManagerAge);
        RvItemAgeAdapter ageAdapter = new RvItemAgeAdapter(context, ageModelList);
        recyclerViewAge.setAdapter(ageAdapter);


        //setup recyclerview for products
        LinearLayoutManager layoutManagerProduts = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewProducts = view.findViewById(R.id.rv_products);
        productsModelList = DataProducts.generateDataProduct();
        recyclerViewProducts.setLayoutManager(layoutManagerProduts);
        RvProductsAdapter productsAdapter = new RvProductsAdapter(context, productsModelList);
        recyclerViewProducts.setAdapter(productsAdapter);


    }


    private void setLayoutSlider() {
        Integer[] images = new Integer[]{
                R.drawable.slider0001, R.drawable.slider0002, R.drawable.slider0003
        };

        for (int i = 0; i < 3; i++) {
            FlipperView view = new FlipperView(getContext());
            view.setImageDrawable(images[i])
                    .setImageScaleType(ImageView.ScaleType.FIT_XY);
            //  .setDescription("Image"+(i+1));
            flipper.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                    //  Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

    private void getItemLayoutAge() {
        mTitleAge.add("Lahir");
        mImageAge.add("");

        mTitleAge.add("Balita");
        mImageAge.add("");

        mTitleAge.add("Anak-anak");
        mImageAge.add("");

        mTitleAge.add("Remaja");
        mImageAge.add("");

        mTitleAge.add("Young Adult");
        mImageAge.add("");

        mTitleAge.add("Dewasa");
        mImageAge.add("");

        mTitleAge.add("Dewasa");
        mImageAge.add("");

        mTitleAge.add("Dewasa");
        mImageAge.add("");

        mTitleAge.add("Pensiun");
        mImageAge.add("");

        mTitleAge.add("Lansia");
        mImageAge.add("");

        mTitleAge.add("Pulang");
        mImageAge.add("");


    }


}
