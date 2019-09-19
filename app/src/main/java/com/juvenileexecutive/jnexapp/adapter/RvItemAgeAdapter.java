package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class RvItemAgeAdapter extends RecyclerView.Adapter<RvItemAgeAdapter.ViewHolder> {

    private ArrayList<String> titleAge = new ArrayList<>();
    private ArrayList<String> imageAge = new ArrayList<>();
    private Context context;


    public RvItemAgeAdapter(Context context, ArrayList<String> titleAge, ArrayList<String> imageAge) {
        this.titleAge = titleAge;
        this.imageAge = imageAge;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_age,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//        Glide.with(context)
//                .load(imageAge.get(position))
//                .into(holder.image);
         //  holder.title.setText(titleAge.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return titleAge.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           // title = itemView.findViewById(R.id.txt_desc_age);
            image = itemView.findViewById(R.id.iv_card_age);
        }
    }
}
