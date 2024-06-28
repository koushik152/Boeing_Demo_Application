package com.example.boeingapplication.loginactivities;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class ProfileDetailResponse {
    @SerializedName("accountInfo")
    private AccountInfo accountInfo;
    @SerializedName("userProfile")
    private UserProfile userProfile;
    @SerializedName("status")
    private Status status;

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static class AccountInfo {
        @SerializedName("alternateAccounts")
        private List<String> alternateAccounts;
        @SerializedName("defaultOrgId")
        private String defaultOrgId;

        public List<String> getAlternateAccounts() {
            return alternateAccounts;
        }

        public void setAlternateAccounts(List<String> alternateAccounts) {
            this.alternateAccounts = alternateAccounts;
        }

        public String getDefaultOrgId() {
            return defaultOrgId;
        }

        public void setDefaultOrgId(String defaultOrgId) {
            this.defaultOrgId = defaultOrgId;
        }
    }

    public static class UserProfile {
        @SerializedName("fname")
        private String fname;
        @SerializedName("lname")
        private String lname;
        @SerializedName("profileId")
        private String profileId;
        @SerializedName("roles")
        private List<Map<String, String>> roles;
        @SerializedName("aboutUsLink")
        private String aboutUsLink;
        @SerializedName("login")
        private String login;
        @SerializedName("email")
        private String email;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public List<Map<String, String>> getRoles() {
            return roles;
        }

        public void setRoles(List<Map<String, String>> roles) {
            this.roles = roles;
        }

        public String getAboutUsLink() {
            return aboutUsLink;
        }

        public void setAboutUsLink(String aboutUsLink) {
            this.aboutUsLink = aboutUsLink;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class Status {
        @SerializedName("status_code")
        private String statusCode;
        @SerializedName("status_msg")
        private String statusMsg;
        @SerializedName("status_key")
        private String statusKey;

        public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getStatusMsg() {
            return statusMsg;
        }

        public void setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
        }

        public String getStatusKey() {
            return statusKey;
        }

        public void setStatusKey(String statusKey) {
            this.statusKey = statusKey;
        }
    }
}
