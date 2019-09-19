package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvCategoriesAdapter;
import com.juvenileexecutive.jnexapp.adapter.RvMemberAdapter;
import com.juvenileexecutive.jnexapp.model.CategoryModel;
import com.juvenileexecutive.jnexapp.model.DataCategory;
import com.juvenileexecutive.jnexapp.model.DataMember;
import com.juvenileexecutive.jnexapp.model.MemberModel;

import java.util.List;

public class MemberFragment extends Fragment {

    private View memberView;
    RecyclerView recyclerViewMember;
    List<MemberModel> memberModels;
    RvMemberAdapter adapter;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        memberView = inflater.inflate(R.layout.fragment_member, container, false);
        return memberView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewMember = view.findViewById(R.id.rv_member);
        memberModels= DataMember.generateDataMember();
        adapter = new RvMemberAdapter(getActivity(),memberModels);
        recyclerViewMember.setLayoutManager(new LinearLayoutManager(context));
        recyclerViewMember.setAdapter(adapter);
    }
}
