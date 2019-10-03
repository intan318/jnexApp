package com.juvenileexecutive.jnexapp.member.model;

public class MemberModel {
    String nameMember;
    String ageMember;
    int imageMember;

    public MemberModel() {
    }

    public MemberModel(String nameMember, String ageMember, int imageMember) {
        this.nameMember = nameMember;
        this.ageMember = ageMember;
        this.imageMember = imageMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public String getAgeMember() {
        return ageMember;
    }

    public void setAgeMember(String ageMember) {
        this.ageMember = ageMember;
    }

    public int getImageMember() {
        return imageMember;
    }

    public void setImageMember(int imageMember) {
        this.imageMember = imageMember;
    }
}
