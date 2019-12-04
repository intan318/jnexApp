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
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.activity.DetailActivity;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;
import com.juvenileexecutive.jnexapp.model.TechnolojeModel;

import java.util.List;

public class RvProductTechnoloje extends RecyclerView.Adapter<RvProductTechnoloje.ViewHolder>{

    Context context;
    List<TechnolojeModel> listTechnoloje;

    public RvProductTechnoloje(Context context, List<TechnolojeModel> listTechnoloje) {
        this.context = context;
        this.listTechnoloje = listTechnoloje;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_technoloje, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.namaProduk.setText(listTechnoloje.get(position).getProductNameTechnoloje());
        Glide.with(context)
                .load(listTechnoloje.get(position).getImageProductTechnoloje())
                .into(holder.gambarProduk);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TechnolojeModel data = listTechnoloje.get(position);

                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("namaitem", data.getProductNameTechnoloje());
                i.putExtra("descitem", data.getProductDescriptionTechnoloje());
                i.putExtra("imgitem", data.getImageProductTechnoloje());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTechnoloje.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaProduk,ketProduk;
        ImageView gambarProduk;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaProduk = itemView.findViewById(R.id.txtNamaTechnoloJE);
            gambarProduk = itemView.findViewById(R.id.imageItemTechnoloje);


        }
    }
}
