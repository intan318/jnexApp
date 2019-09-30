package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.JEProductionActivity;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.SubCategoryModel;

import java.util.List;

public class RvSubCategoriesAdapter extends RecyclerView.Adapter<RvSubCategoriesAdapter.ViewHolder> {

    Context context;
    List<SubCategoryModel> subCategoryModels;


    public RvSubCategoriesAdapter(Context context, List<SubCategoryModel> subCategoryModels) {
        this.context = context;
        this.subCategoryModels = subCategoryModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_subcategory,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext())
                .load(subCategoryModels.get(position).getImageSubCategory())
                .into(holder.imageSubCategory);

        Glide.with(holder.itemView.getContext())
                .load(subCategoryModels.get(position).getImageProductsSubCateory1())
                .into(holder.imageProductSubCategory1);

        Glide.with(holder.itemView.getContext())
                .load(subCategoryModels.get(position).getImageProductsSubCateory2())
                .into(holder.getImageProductSubCategory2);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(context, "Item clicked", Toast.LENGTH_SHORT).show();
              //  SubCategoryModel subCategory = subCategoryModels.get(position);
                Intent intent = new Intent(context,JEProductionActivity.class);
              //  intent.putExtra("title_subcategory",subCategory.getImageSubCategory());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return subCategoryModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageSubCategory;
        ImageView imageProductSubCategory1;
        ImageView getImageProductSubCategory2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageSubCategory = itemView.findViewById(R.id.iv_subcategory);
            imageProductSubCategory1 = itemView.findViewById(R.id.iv_subcategory_product);
            getImageProductSubCategory2 = itemView.findViewById(R.id.iv_subcategory_product2);
        }
    }
}
