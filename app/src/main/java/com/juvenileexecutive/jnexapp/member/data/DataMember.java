package com.juvenileexecutive.jnexapp.member.data;

import com.juvenileexecutive.jnexapp.R;
import com.juvenileexecutive.jnexapp.member.model.MemberModel;

import java.util.ArrayList;

public class DataMember {

    public static ArrayList<MemberModel> generateDataMember() {
        ArrayList<MemberModel> memberModels = new ArrayList<>();
        memberModels.add(new MemberModel("JESSICA TRAINING CENTER", "https://j-nex.com/jessica/", R.drawable.jessica_training));
        memberModels.add(new MemberModel("ANJELINE CAREER CENTER", "https://j-nex.com/anjeline/", R.drawable.anjeline_training));
        memberModels.add(new MemberModel("JENIVER BUSINESS CENTER", "https://j-nex.com/jeniver/", R.drawable.jeniver));
        return memberModels;
    }
}
