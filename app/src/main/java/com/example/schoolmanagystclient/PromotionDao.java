package com.example.schoolmanagystclient;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PromotionDao
{
    @Query("SELECT * FROM promotion")
    public List<Promotion> getAllPromotions();

    @Query("SELECT * FROM promotion WHERE _id = :promotionId")
    public Promotion getPromotionById(long promotionId);

    @Insert
    void insertAll(Promotion... promotions);

    @Delete
    void delete(Promotion promotion);
}