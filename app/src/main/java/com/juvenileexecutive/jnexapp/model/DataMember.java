package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataMember {

    public static ArrayList<MemberModel> generateDataMember(){
        ArrayList<MemberModel> memberModels = new ArrayList<>();
        memberModels.add(new MemberModel("Name","Age", R.drawable.background1));
       memberModels.add(new MemberModel("Name","Age", R.drawable.background2));
        return memberModels;
    }
}
