package com.example.schoolmanagystclient;

import android.util.Log;

import com.example.schoolmanagystclient.Web.RestServiceInterface;
import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.entities.Student;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Logic implements LogicInterface
{
    private static final String TAG = "Logic";
    private List<Student> _students;
    private List<Promotion> _promotions;
    private RestServiceInterface _restServiceInterface;

    public Logic(RestServiceInterface restServiceInterface)
    {
        setPromotions(new ArrayList<>());
        setRestServiceInterface(restServiceInterface);
    }

    @Override
    public List<Student> getStudents()
    {
        actualizeStudents();
        return _students;
    }

    @Override
    public List<Student> getStudents(String promotionAcronym)
    {
        return getStudents();
    }

    @Override
    public void setStudents(List<Student> students)
    {
        _students = students;
    }

    @Override
    public void addStudent(Student student)
    {
        getRestServiceInterface().addStudent(student);
    }

    @Override
    public List<Promotion> getPromotions()
    {
        actualizePromotions();
        return _promotions;
    }

    @Override
    public void setPromotions(List<Promotion> promotions)
    {
        _promotions = promotions;
    }

    @Override
    public void addPromotion(Promotion promotion)
    {
        getRestServiceInterface().addPromotion(promotion);
    }

    private RestServiceInterface getRestServiceInterface()
    {
        return _restServiceInterface;
    }

    private void setRestServiceInterface(RestServiceInterface restServiceInterface)
    {
        _restServiceInterface = restServiceInterface;
    }

    public void actualizePromotions()
    {
        getRestServiceInterface().getPromotions().enqueue(new Callback<List<Promotion>>()
        {
            @Override
            public void onResponse(Call<List<Promotion>> call, Response<List<Promotion>> response)
            {
                Log.i(TAG, response.body().toString());
                setPromotions(response.body());
            }
            @Override
            public void onFailure(Call<List<Promotion>> call, Throwable t)
            {
                Log.e(TAG,"getPromotions");
                setPromotions(new ArrayList<>());
            }
        });
    }

    public void actualizeStudents()
    {
        actualizeStudents("");
    }

    public void actualizeStudents(String promotionAcronym)
    {
        getRestServiceInterface().getStudents(promotionAcronym).enqueue(new Callback<List<Student>>()
        {
            @Override
            public void onResponse(Call<List<Student>> call, Response<List<Student>> response)
            {
                Log.i(TAG, response.body().toString());
                setStudents(response.body());
            }
            @Override
            public void onFailure(Call<List<Student>> call, Throwable t)
            {
                Log.e(TAG,"getStudents");
                setPromotions(new ArrayList<>());
            }
        });
    }
}