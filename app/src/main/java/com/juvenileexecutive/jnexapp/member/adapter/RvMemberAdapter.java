package com.juvenileexecutive.jnexapp.member.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juvenileexecutive.jnexapp.DetailWebViewJuvenna;
import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.activity.DetailActivity;
import com.juvenileexecutive.jnexapp.member.data.DataMember;
import com.juvenileexecutive.jnexapp.member.model.MemberModel;
import com.juvenileexecutive.jnexapp.model.ItemDetailModel;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context)
                .load(memberList.get(position).getImageMember())
                .into(holder.imageJuvenna);
        holder.namaProdukJuvenna.setText(memberList.get(position).getNameMember());
       // holder.jenisMember.setText(memberList.get(position).getJenisMember());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MemberModel dataMember = memberList.get(position);

                Intent i = new Intent(context, DetailWebViewJuvenna.class);
                i.putExtra("namamember", dataMember.getNameMember());
                i.putExtra("imgmember", dataMember.getImageMember());
                i.putExtra("urlmember", dataMember.getJenisMember());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageJuvenna;
        TextView namaProdukJuvenna;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageJuvenna = itemView.findViewById(R.id.media_image_juvenna);
            namaProdukJuvenna = itemView.findViewById(R.id.txt_title_juvenna);
          //  jenisMember = itemView.findViewById(R.id.jenis_member);

        }
    }
}
