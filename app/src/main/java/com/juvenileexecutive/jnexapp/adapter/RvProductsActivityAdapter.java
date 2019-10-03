package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.ProductActivityModel;

import java.util.List;

public class RvProductsActivityAdapter extends RecyclerView.Adapter<RvProductsActivityAdapter.ViewHolder> {

    Context context;
    List<ProductActivityModel> productActivityModelList;

    public RvProductsActivityAdapter(Context context, List<ProductActivityModel> productActivityModelList) {
        this.context = context;
        this.productActivityModelList = productActivityModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_products_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext())
                .load(productActivityModelList.get(position).getImageProduct())
                .into(holder.imgProducts);

        holder.titleProducts.setText(productActivityModelList.get(position).getTitleProduct());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return productActivityModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProducts;
        TextView titleProducts;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProducts = itemView.findViewById(R.id.iv_product_image_actvity);
            titleProducts = itemView.findViewById(R.id.title_product_activity);
        }
    }
}
