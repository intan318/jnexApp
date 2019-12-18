package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.WebviewExpansion;
import com.juvenileexecutive.jnexapp.activity.SubCategoryActivity;
import com.juvenileexecutive.jnexapp.category.adapter.RvCategoriesAdapter;
import com.juvenileexecutive.jnexapp.category.model.CategoryModel;
import com.juvenileexecutive.jnexapp.category.data.DataCategory;

import java.util.List;

public class CategoryFragment extends Fragment {

    RecyclerView recyclerView;
    List<CategoryModel> categoryModels;
    RvCategoriesAdapter adapter;
    Context context;
    private View CategoryView;

    CardView cardViewOneStopSolution;
    CardView cvExpansion;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CategoryView = inflater.inflate(R.layout.fragment_category, container, false);

        return CategoryView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        recyclerView = view.findViewById(R.id.recyclerView_categories);
//        categoryModels = DataCategory.generateData();
//        adapter = new RvCategoriesAdapter(getActivity(), categoryModels);
//        recyclerView.setLayoutManager(new LinearLayoutManager(context));
//        recyclerView.setAdapter(adapter);

        cardViewOneStopSolution = view.findViewById(R.id.card_view_onestop);
        cardViewOneStopSolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intentonestop = new Intent(getContext(), SubCategoryActivity.class);
                getContext().startActivity(intentonestop);
            }
        });

//        cvExpansion = view.findViewById(R.id.card_view_businessexp);
//        cvExpansion.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentexpansion = new Intent(getContext(), WebviewExpansion.class);
//                getContext().startActivity(intentexpansion);
//            }
//        });


    }
}
