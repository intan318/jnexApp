package com.juvenileexecutive.jnexapp.member.data;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.member.model.MemberModel;

import java.util.ArrayList;

public class DataMember {

    public static ArrayList<MemberModel> generateDataMember() {
        ArrayList<MemberModel> memberModels = new ArrayList<>();
        memberModels.add(new MemberModel("Name", "Age", R.drawable.background1));
        memberModels.add(new MemberModel("Name", "Age", R.drawable.background2));
        return memberModels;
    }
}
