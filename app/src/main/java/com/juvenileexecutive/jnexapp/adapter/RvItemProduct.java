package com.juvenileexecutive.jnexapp.adapter;

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
import com.juvenileexecutive.jnexapp.DetailActivity;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

import org.w3c.dom.Text;

import java.util.List;

public class RvItemProduct extends RecyclerView.Adapter<RvItemProduct.ViewHolder> {

    Context context;
    List<ItemDetailModel> itemDetailModels;

    public RvItemProduct(Context context, List<ItemDetailModel> itemDetailModels) {
        this.context = context;
        this.itemDetailModels = itemDetailModels;
    }

    @NonNull
    @Override
    public RvItemProduct.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_jepro, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvItemProduct.ViewHolder holder, final int position) {

        holder.namaItem.setText(itemDetailModels.get(position).getItemNameDetail());
        Glide.with(context)
                .load(itemDetailModels.get(position).getImgItemDetail())
                .into(holder.imgItem);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemDetailModel data = itemDetailModels.get(position);

                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("namaitem", data.getItemNameDetail());
                i.putExtra("descitem", data.getItemDescription());
                i.putExtra("imgitem", data.getImgItemDetail());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemDetailModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaItem;
        TextView descItem;
        ImageView imgItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaItem = itemView.findViewById(R.id.txtNamaItem);
//            descItem = itemView.findViewById(R.id.txtDescItemDetail);
            imgItem = itemView.findViewById(R.id.imgItem);
        }
    }
}
