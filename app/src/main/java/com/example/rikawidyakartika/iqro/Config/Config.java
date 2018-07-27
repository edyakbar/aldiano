package com.example.rikawidyakartika.iqro.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by edy akbar on 27/07/2018.
 */

public class Config {
    public static final String BASE_URL = "http://192.168.1.29/CI_madrasah/";
    public static final String URL = BASE_URL + "Api/";
    public static final String URL_IMG = BASE_URL + "images/";
    public static final String URL_IMG_GLR = BASE_URL + "assets/galeri/";

    public static Retrofit getRetrofit() {
        return new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    private static Retrofit retrofit = null;
}
