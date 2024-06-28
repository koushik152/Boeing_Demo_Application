package com.example.boeingapplication.loginactivities;

import com.google.gson.annotations.SerializedName;

public class ProfileDetailRequest {
    @SerializedName("atg-rest-output")
    private String atgRestOutput;

    public ProfileDetailRequest(String atgRestOutput) {
        this.atgRestOutput = atgRestOutput;
    }

    public String getAtgRestOutput() {
        return atgRestOutput;
    }

    public void setAtgRestOutput(String atgRestOutput) {
        this.atgRestOutput = atgRestOutput;
    }
}
