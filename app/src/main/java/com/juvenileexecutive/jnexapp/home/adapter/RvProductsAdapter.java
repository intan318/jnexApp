package com.juvenileexecutive.jnexapp.home.adapter;

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
import com.juvenileexecutive.jnexapp.ProductActivity;
import com.juvenileexecutive.jnexapp.home.model.ProductsModel;

import java.util.List;

public class RvProductsAdapter extends RecyclerView.Adapter<RvProductsAdapter.ViewHolder> {
    Context context;
    List<ProductsModel> productsList;

    public RvProductsAdapter(Context context, List<ProductsModel> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_products, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(productsList.get(position).getProductImage())
                .into(holder.imageProduct);
        //  holder.txtProduct.setText(productsList.get(position).getProductTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ProductActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageProduct;
        TextView txtProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageProduct = itemView.findViewById(R.id.iv_product_image);
            // txtProduct = itemView.findViewById(R.id.txt_desc_product);
        }
    }
}
