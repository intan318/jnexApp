package com.juvenileexecutive.jnexapp.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.juvenileexecutive.jnexapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

//    mSearchView.setOnQueryChangeListener(new FloatingSearchView.OnQueryChangeListener() {
//        @Override
//        public void onSearchTextChanged(String oldQuery, final String newQuery) {
//
//            //get suggestions based on newQuery
//
//            //pass them on to the search view
//            mSearchView.swapSuggestions(newSuggestions);
//        }
//    });

}
