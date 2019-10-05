package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.GridProductsModel;

import java.util.List;

public class GvProductsAdapter extends RecyclerView.Adapter<GvProductsAdapter.GridViewHolder> {
    List<GridProductsModel> gridProductsModels;
    Context context;

    public GvProductsAdapter(List<GridProductsModel> gridProductsModels, Context context) {
        this.gridProductsModels = gridProductsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public GvProductsAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_jepro, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GvProductsAdapter.GridViewHolder holder, int position) {
        holder.txTitle.setText(gridProductsModels.get(position).getTitleProductGrid());
        Glide.with(context)
                .load(gridProductsModels.get(position).getImgProductGrid())
                .into(holder.imgProduct);
    }

    @Override
    public int getItemCount() {
        return gridProductsModels.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{

        TextView txTitle;
        ImageView imgProduct;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            txTitle = itemView.findViewById(R.id.txtNamaItem);
            imgProduct = itemView.findViewById(R.id.imgItemJePro);

        }
    }
}
