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
import com.juvenileexecutive.jnexapp.model.FeaturedProductModel;

import java.util.List;

public class RvFeaturedProduct extends RecyclerView.Adapter<RvFeaturedProduct.ViewHolder> {

    Context context;
    List<FeaturedProductModel> featuredProductModels;

    public RvFeaturedProduct(Context context, List<FeaturedProductModel> featuredProductModels) {
        this.context = context;
        this.featuredProductModels = featuredProductModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_featured_products, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext())
                .load(featuredProductModels.get(position).getImgFeatured())
                .into(holder.imgProducts);
        holder.titleProduct.setText(featuredProductModels.get(position).getTitleFeatured());
        holder.priceProduct.setText(featuredProductModels.get(position).getPriceFeatured());
    }

    @Override
    public int getItemCount() {
        return featuredProductModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProducts;
        TextView titleProduct;
        TextView priceProduct;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProducts = itemView.findViewById(R.id.iv_image_feature);
            titleProduct = itemView.findViewById(R.id.tv_title_feature_products);
            priceProduct = itemView.findViewById(R.id.tv_price_featured_products);

        }
    }
}
