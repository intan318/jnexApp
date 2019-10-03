package com.juvenileexecutive.jnexapp.account.model;

public class InfoAccountModel {
    String titleAccount;

    public InfoAccountModel() {
    }

    public InfoAccountModel(String titleAccount) {
        this.titleAccount = titleAccount;
    }

    public String getTitleAccount() {
        return titleAccount;
    }

    public void setTitleAccount(String titleAccount) {
        this.titleAccount = titleAccount;
    }
}
