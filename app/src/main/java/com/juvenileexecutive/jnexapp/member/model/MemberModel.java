package com.juvenileexecutive.jnexapp.member.model;

public class MemberModel {
    String nameMember;
    String jenisMember;
    int imageMember;

    public MemberModel() {
    }

    public MemberModel(String nameMember, String jenisMember, int imageMember) {
        this.nameMember = nameMember;
        this.jenisMember = jenisMember;
        this.imageMember = imageMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

    public int getImageMember() {
        return imageMember;
    }

    public void setImageMember(int imageMember) {
        this.imageMember = imageMember;
    }
}
