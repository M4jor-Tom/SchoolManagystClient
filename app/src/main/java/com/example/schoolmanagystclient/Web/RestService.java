package com.example.schoolmanagystclient.Web;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestService
{
    private static final String TAG = "Logic";

    private static RestServiceInterface _restServiceInterface;

    public static RestServiceInterface getInstance()
    {
        if(_restServiceInterface == null)
        {
            Log.i(TAG, "========= RestServiceInit ========");
            _restServiceInterface = new Retrofit.Builder()
                    .baseUrl(_restServiceInterface.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(RestServiceInterface.class);
        }
        return _restServiceInterface;
    }
}