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

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.WebviewJessica;

import technolifestyle.com.imageslider.FlipperLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    FlipperLayout flipperLayout;
    Context context;
    CardView cvSearchJessica,cvSearchTechnoloJE;
    private View SearchView;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        SearchView = inflater.inflate(R.layout.fragment_search, container, false);
        return SearchView;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cvSearchJessica = view.findViewById(R.id.cv_search_jessica);
        cvSearchJessica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), WebviewJessica.class);
                getContext().startActivity(intent);
            }
        });
    }


}
