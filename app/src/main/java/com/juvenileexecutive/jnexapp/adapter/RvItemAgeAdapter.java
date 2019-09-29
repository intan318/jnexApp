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
import com.juvenileexecutive.jnexapp.model.AgeModel;
import com.juvenileexecutive.jnexapp.model.ProductsModel;

import java.util.ArrayList;
import java.util.List;

public class RvItemAgeAdapter extends RecyclerView.Adapter<RvItemAgeAdapter.ViewHolder> {


    List<AgeModel> ageList;
    private Context context;


    public RvItemAgeAdapter(Context context,List<AgeModel> ageList) {
        this.context = context;
        this.ageList = ageList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_age,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(ageList.get(position).getImageAge())
                .into(holder.image);
           //holder.title.setText(titleAge.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return ageList.size();
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
