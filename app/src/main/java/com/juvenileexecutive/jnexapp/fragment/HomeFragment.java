package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.juvenileexecutive.jnexapp.R;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class HomeFragment extends Fragment {
    FlipperLayout flipper;
    Context context;

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

        Toolbar myToolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(myToolbar);
    }

    private void setLayoutSlider() {
        Integer images [] = new Integer[]{
          R.drawable.slider1, R.drawable.slider002, R.drawable.slideerr3
        };

        for(int i=0;i<3;i++){
            FlipperView view = new FlipperView(getContext());
            view.setImageDrawable(images[i])
            .setImageScaleType(ImageView.ScaleType.CENTER_CROP);
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
}
