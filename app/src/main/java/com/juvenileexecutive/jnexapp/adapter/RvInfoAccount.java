package com.juvenileexecutive.jnexapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class RvInfoAccount extends RecyclerView.Adapter<RvInfoAccount.ViewHolder> {

    private ArrayList<String> infoAccount = new ArrayList<>();
    private Context context;

    public RvInfoAccount(Context context,ArrayList<String> infoAccount) {
        this.infoAccount = infoAccount;
        this.context = context;
    }

    @NonNull
    @Override
    public RvInfoAccount.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_info_account,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvInfoAccount.ViewHolder holder, int position) {
        holder.labelInfo.setText(infoAccount.get(position));

    }

    @Override
    public int getItemCount() {
        return infoAccount.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView labelInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            labelInfo = itemView.findViewById(R.id.tv_info_account);
        }
    }
}
