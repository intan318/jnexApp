package com.juvenileexecutive.jnexapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.ListPreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.adapter.RvAssitenAdapter;
import com.juvenileexecutive.jnexapp.adapter.RvInfoAccount;
import com.juvenileexecutive.jnexapp.adapter.RvPersonalMenuAdapter;
import com.juvenileexecutive.jnexapp.adapter.RvSettingMenuAdapter;
import com.juvenileexecutive.jnexapp.model.AssistenMenuModel;
import com.juvenileexecutive.jnexapp.model.DataAsisten;
import com.juvenileexecutive.jnexapp.model.DataInfoAccount;
import com.juvenileexecutive.jnexapp.model.DataPersonalMenu;
import com.juvenileexecutive.jnexapp.model.DataSettingMenu;
import com.juvenileexecutive.jnexapp.model.InfoAccountModel;
import com.juvenileexecutive.jnexapp.model.PersonalMenuModel;
import com.juvenileexecutive.jnexapp.model.SettingMenuModel;

import java.util.ArrayList;
import java.util.List;

public class AccountFragment  extends Fragment {

    private ArrayList<String> mTitleInfo = new ArrayList<>();
    private ArrayList<String> mAssistants = new ArrayList<>();
    private ArrayList<String> mPersonal = new ArrayList<>();
    private ArrayList<String> mSettings = new ArrayList<>();
    private View AccountView;

    List<InfoAccountModel> infoAccountModelsList;
    List<AssistenMenuModel> assistenMenuModelList;
    List<PersonalMenuModel> personalMenuModelList;
    List<SettingMenuModel> settingMenuModelList;

    Context context;

    private ListPreference mListPreference;


//    @Override
//    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//        setPreferencesFromResource(R.xml.root_preferences, rootKey);
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_account, container, false);
    }





    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //setLayoutInfo();
        RecyclerView recyclerInfoAccount = view.findViewById(R.id.rv_info_account);
        recyclerInfoAccount.setLayoutManager(new LinearLayoutManager(context));
        infoAccountModelsList = DataInfoAccount.generateDataInfoAccount();
        RvInfoAccount infoAdapter = new RvInfoAccount(context,infoAccountModelsList);
        recyclerInfoAccount.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();


        RecyclerView recyclerAssiten = view.findViewById(R.id.rv_asistants);
        recyclerAssiten.setLayoutManager(new LinearLayoutManager(context));
        assistenMenuModelList = DataAsisten.generateDataAsisten();
        RvAssitenAdapter asistenAdapter = new RvAssitenAdapter(context,assistenMenuModelList);
        recyclerAssiten.setAdapter(asistenAdapter);
        asistenAdapter.notifyDataSetChanged();

        RecyclerView recyclerViewPersonal = view.findViewById(R.id.rv_personal);
        recyclerViewPersonal.setLayoutManager(new LinearLayoutManager(context));
        personalMenuModelList = DataPersonalMenu.generateDataPersonal();
        RvPersonalMenuAdapter personalAdapter = new RvPersonalMenuAdapter(context,personalMenuModelList);
        recyclerViewPersonal.setAdapter(personalAdapter);
        personalAdapter.notifyDataSetChanged();

        RecyclerView recyclerViewSetting = view.findViewById(R.id.rv_settings);
        recyclerViewSetting.setLayoutManager(new LinearLayoutManager(context));
        settingMenuModelList = DataSettingMenu.generateDataSetting();
        RvSettingMenuAdapter settingAdapter = new RvSettingMenuAdapter(context,settingMenuModelList);
        recyclerViewSetting.setAdapter(settingAdapter);
        settingAdapter.notifyDataSetChanged();
//        RecyclerView recyclerViewSettings = view.findViewById(R.id.rv_settings );
//        recyclerViewSettings.setLayoutManager(new LinearLayoutManager(context));
//        RvInfoAccount settingAdapter = new RvInfoAccount(context,mSettings);
//        recyclerViewSettings.setAdapter(settingAdapter);
//        settingAdapter.notifyDataSetChanged();


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
