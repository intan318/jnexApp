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
import com.juvenileexecutive.jnexapp.adapter.RvInfoAccount;
import com.juvenileexecutive.jnexapp.adapter.RvItemAgeAdapter;
import com.juvenileexecutive.jnexapp.model.DataCategory;

import java.util.ArrayList;

public class AccountFragment extends Fragment {

    private ArrayList<String> mTitleInfo = new ArrayList<>();
    private ArrayList<String> mAssistants = new ArrayList<>();
    private ArrayList<String> mPersonal = new ArrayList<>();
    private ArrayList<String> mSettings = new ArrayList<>();
    private View AccountView;

    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AccountView = inflater.inflate(R.layout.fragment_account, container, false);
        return AccountView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        setLayoutInfo();
        RecyclerView recyclerInfoAccount = view.findViewById(R.id.rv_info_account);
        recyclerInfoAccount.setLayoutManager(new LinearLayoutManager(context));
        RvInfoAccount infoAdapter = new RvInfoAccount(context,mTitleInfo);
        recyclerInfoAccount.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();



        RecyclerView recyclerViewAssistants = view.findViewById(R.id.rv_asistants);
        recyclerViewAssistants.setLayoutManager(new LinearLayoutManager(context));
        RvInfoAccount asistenAdapter = new RvInfoAccount(context,mAssistants);
        recyclerViewAssistants.setAdapter(asistenAdapter);
        asistenAdapter.notifyDataSetChanged();


        RecyclerView recyclerViewPersonal = view.findViewById(R.id.rv_personal);
        recyclerViewPersonal.setLayoutManager(new LinearLayoutManager(context));
        RvInfoAccount personalAdapter = new RvInfoAccount(context,mPersonal);
        recyclerViewPersonal.setAdapter(personalAdapter);
        personalAdapter.notifyDataSetChanged();

        RecyclerView recyclerViewSettings = view.findViewById(R.id.rv_settings );
        recyclerViewSettings.setLayoutManager(new LinearLayoutManager(context));
        RvInfoAccount settingAdapter = new RvInfoAccount(context,mSettings);
        recyclerViewSettings.setAdapter(settingAdapter);
        settingAdapter.notifyDataSetChanged();


    }

    private void setLayoutInfo() {
        mTitleInfo.add("About Account");
        mTitleInfo.add("Members");
        mTitleInfo.add("Profile");
        mTitleInfo.add("Business Center");
        mTitleInfo.add("Device Request");
        mTitleInfo.add("GO LIVE");


        mAssistants.add("Chat With JUVENA");
        mAssistants.add("Groups");
        mAssistants.add("Forums");
        mAssistants.add("Marketplace");
        mAssistants.add("Events");

        mPersonal.add("Chat with ANGELINE");
        mPersonal.add("Chat with JESSICA");
        mPersonal.add("Chat with JENIVER");
        mPersonal.add("Chat with RECEPTIONIST");

        mSettings.add("Password");
        mSettings.add("Members");
        mSettings.add("Profile");
        mSettings.add("Privacy");
        mSettings.add("Localization");


    }
}
