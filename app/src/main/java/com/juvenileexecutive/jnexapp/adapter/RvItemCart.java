package com.juvenileexecutive.jnexapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.ItemCartModel;

import java.util.List;

public class RvItemCart extends RecyclerView.Adapter<RvItemCart.ViewHolder> {

    Context context;
    List<ItemCartModel> itemCarts;

    public RvItemCart(Context context, List<ItemCartModel> itemCarts) {
        this.context = context;
        this.itemCarts = itemCarts;
    }

//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_checkout, parent, false);
//        return new ViewHolder(view);
//    }
//

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_checkout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Intent i = ((Activity) context).getIntent();

        holder.itemName.setText(i.getStringExtra("namaitem"));

        //holder.itemName.setText(itemCarts.get(position).getItemName());
        Glide.with(context)
                .load( i.getStringExtra("imgitem"))
                .into(holder.imgItem);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemCarts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemName;
        ImageView imgItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.txtItemName);
            imgItem = itemView.findViewById(R.id.imgItemCheckout);
        }
    }

}
