package com.example.schoolmanagystclient.Web;

import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.entities.Student;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface RestServiceInterface
{
    public static final String ENDPOINT = "http://10.0.2.2:90/ecole/";

    @GET("promotion")
    Call<List<Promotion>> getPromotions();
    @GET("promotion/{acronym}")
    Call<Promotion> getPromotion(@Path("acronym") String acronym);
    @POST("promotion")
    Call<Void> addPromotion(@Body Promotion promotion);

    @GET("etudiant")
    Call<List<Student>> getStudents();
    @GET("etudiant/{promotionAcronym}")
    Call<List<Student>> getStudents(String promotionAcronym);
    @POST("etudiant")
    Call<Void> addStudent(@Body Student student);
}