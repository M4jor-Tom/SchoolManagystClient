package com.example.schoolmanagystclient;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Promotion.class, Student.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract PromotionDao promotionDao();
    public abstract StudentDao studentDao();
}