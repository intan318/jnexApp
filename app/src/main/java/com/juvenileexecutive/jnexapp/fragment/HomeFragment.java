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
        setLayout();

        Toolbar myToolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(myToolbar);
    }

    private void setLayout() {


        String url[] = new String[]{
                "https://aonojikken.net/wp-content/uploads/2019/07/black-abstract-background-elegant-49-best-dark-wallpaper-on-wallpapersafari-ideas-of-black-abstract-background.jpg",
        "https://blog-assets.hootsuite.com/wp-content/uploads/2016/08/social-media-for-business-940x470.jpg",
        "https://www.cocobproductions.com/wp-content/uploads/2018/06/agreement-business-clapping-990817-1300x630.jpg",
                "https://www.cocobproductions.com/wp-content/uploads/2018/06/agreement-business-clapping-990817-1300x630.jpg"
        };

        String description[] = new String[]{" ",
                "One Stop Solutions Business Provider", "Our Extensive Partner Network Helps Us\n" +
                "Drive Collaboration and Leverage Business", "Discover a World of Innovative Ideas and Projects Creating\n" +
                "New Investment Opportunities."

        };

        for(int i=0;i<4;i++){
            FlipperView view = new FlipperView(getContext());
            view.setImageUrl(url[i])
                    .setDescription(description[i])
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
