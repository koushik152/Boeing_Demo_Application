package com.example.boeingapplication.loginactivities;



import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProfileDetailResponse {

    @SerializedName("accountInfo")
    private AccountInfo accountInfo;

    @SerializedName("userProfile")
    private UserProfile userProfile;

    @SerializedName("status")
    private Status status;

    // Getters and setters
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

        // Getters and setters
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
        private List<Role> roles;

        @SerializedName("aboutUsLink")
        private String aboutUsLink;

        @SerializedName("login")
        private String login;

        @SerializedName("email")
        private String email;

        // Getters and setters
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

        public List<Role> getRoles() {
            return roles;
        }

        public void setRoles(List<Role> roles) {
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

        public static class Role {
            @SerializedName("DPDEPT")
            private String dpdept;

            @SerializedName("900002")
            private String customerMedium;

            // Getters and setters
            public String getDpdept() {
                return dpdept;
            }

            public void setDpdept(String dpdept) {
                this.dpdept = dpdept;
            }

            public String getCustomerMedium() {
                return customerMedium;
            }

            public void setCustomerMedium(String customerMedium) {
                this.customerMedium = customerMedium;
            }
        }
    }

    public static class Status {
        @SerializedName("status_code")
        private String statusCode;

        @SerializedName("status_msg")
        private String statusMsg;

        @SerializedName("status_key")
        private String statusKey;

        // Getters and setters
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
