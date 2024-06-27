package com.example.boeingapplication.loginactivities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;



import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "LogoutResponse", strict = false)
public class LogoutResponse {
    @Element(name = "is-logged-out", required = false)
    private String isLoggedOut;
    public String getIsLoggedOut() {
        return isLoggedOut;
    }
}