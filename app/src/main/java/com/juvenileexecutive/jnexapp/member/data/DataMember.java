package com.juvenileexecutive.jnexapp.member.data;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.member.model.MemberModel;

import java.util.ArrayList;

public class DataMember {

    public static ArrayList<MemberModel> generateDataMember() {
        ArrayList<MemberModel> memberModels = new ArrayList<>();
        memberModels.add(new MemberModel("Venus Ragantara, 18 Tahun", "Jessica Training Center", R.drawable.member1));
        memberModels.add(new MemberModel("Aryasa Ragantara, 15 Tahun ", "Jessica Training Center", R.drawable.member2));
        return memberModels;
    }
}
