package com.juvenileexecutive.jnexapp.member.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.member.model.MemberModel;

import java.util.List;

public class RvMemberAdapter extends RecyclerView.Adapter<RvMemberAdapter.ViewHolder> {
    Context context;
    List<MemberModel> memberList;

    public RvMemberAdapter(Context context, List<MemberModel> memberList) {
        this.context = context;
        this.memberList = memberList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_member, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load(memberList.get(position).getImageMember())
                .into(holder.imageMember);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageMember;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMember = itemView.findViewById(R.id.iv_member);


        }
    }
}
