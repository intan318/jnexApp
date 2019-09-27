package com.juvenileexecutive.jnexapp.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.juvenileexecutive.jnexapp.R;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    FlipperLayout flipperLayout;
    Context context;

    private View SearchView;

//    public SearchFragment() {
//        // Required empty public constructor
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       SearchView = inflater.inflate(R.layout.fragment_search, container, false);
       return SearchView;
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


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        flipperLayout = view.findViewById(R.id.flipper_search);
        setLayoutSlider();
    }

    private void setLayoutSlider() {
        Integer img [] = new Integer[]{
                R.drawable.slider1, R.drawable.slider002, R.drawable.ic_launcher_background
        };

        for(int i=0; i<3; i++){
            FlipperView view = new FlipperView(getContext());
            view.setImageDrawable(img[i])
                    .setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            flipperLayout.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {

                }
            });
        }
    }
}
