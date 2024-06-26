package com.example.boeingapplication.loginactivities;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CommonService {

    @POST("rest/model/com/mobility/service/CommonService/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);


    @POST("rest/model/com/mobility/service/CommonService/logout")
    Call<LogoutResponse> logout(
            @Body LogoutRequest logoutRequest
    );

    @POST("rest/model/com/mobility/service/auth/MService/getProfileDetail")
    Call<ProfileDetailResponse> getProfileDetail(
            @Header("Content-Type") String contentType,
            @Header("Connection") String Connection,
            @Header("Cache-Control") String Cache_Control,
            @Header("m-service-token") String token,
            @Body ProfileDetailRequest request
    );
}
