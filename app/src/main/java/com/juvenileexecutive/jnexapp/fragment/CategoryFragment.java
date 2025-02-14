package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CategoryView = inflater.inflate(R.layout.fragment_category, container, false);

        return CategoryView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView_categories);
        categoryModels = DataCategory.generateData();
        adapter = new RvCategoriesAdapter(getActivity(), categoryModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);


    }
}
