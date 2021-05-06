package com.example.schoolmanagystclient;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PromotionDao
{
    @Query("SELECT * FROM PromotionRoomEntity")
    public List<PersistantPromotion> getAllPromotions();

    @Query("SELECT * FROM PromotionRoomEntity WHERE promotionId = :promotionId")
    public PersistantPromotion getPromotionRoomEntityById(long promotionId);

    @Query("SELECT * FROM PromotionRoomEntity WHERE promotionId = :promotionId")
    public PersistantPromotion getPromotionById(long promotionId);

    @Insert
    void insertAll(PromotionRoomEntity... promotions);
    @Insert
    void insertAll(List<PromotionRoomEntity> promotions);

    @Delete
    void delete(PromotionRoomEntity promotion);
}