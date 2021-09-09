package com.example.retrofitimagemultipartupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @Headers("Authorization: Client-ID abbc47f92eb6398")
    @Multipart
    @POST("3/image")
    Call<ResponseDTO> uploadImage(
            @Part MultipartBody.Part image
    );
}
