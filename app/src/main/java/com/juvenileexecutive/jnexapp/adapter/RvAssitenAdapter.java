package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.model.AssistenMenuModel;

import java.util.List;

public class RvAssitenAdapter extends RecyclerView.Adapter<RvAssitenAdapter.ViewHolder> {
    List<AssistenMenuModel> assistenMenuModelList;
    private Context context;

    public RvAssitenAdapter( Context context,List<AssistenMenuModel> assistenMenuModelList) {
        this.assistenMenuModelList = assistenMenuModelList;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_info_account,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.labelInfo.setText(assistenMenuModelList.get(position).getTitleAsisten());
    }

    @Override
    public int getItemCount() {
        return assistenMenuModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView labelInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            labelInfo = itemView.findViewById(R.id.tv_info_account);
        }
    }
}
