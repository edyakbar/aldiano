package com.example.rikawidyakartika.iqro.Config.Modul;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by edy akbar on 27/07/2018.
 */

public interface UserAPIService {
    @GET("madrasah")
    Call<Value> getJSON();
}
