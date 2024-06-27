package com.example.boeingapplication.loginactivities;

import com.google.gson.annotations.SerializedName;

public class LogoutRequest {
    @SerializedName("atg-rest-output")
    private String atgRestOutput;
    @SerializedName("is_cmp_admin_login_param")
    private String isCmpAdminLoginParam;
    private String login;
    private String password;

    public LogoutRequest(String atgRestOutput , String isCmpAdminLoginParam, String login, String password) {
        this.atgRestOutput = atgRestOutput;
        this.isCmpAdminLoginParam = isCmpAdminLoginParam;
        this.login = login;
        this.password = password;
    }
}