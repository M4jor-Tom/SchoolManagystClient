package com.example.schoolmanagystclient;

import android.util.Log;

import androidx.room.Database;

import java.util.ArrayList;
import java.util.List;

public class Logic implements LogicInterface
{
    private static final String TAG = "Logic";

    private DatabaseLoader _databaseLoader;

    public Logic(DatabaseLoader databaseLoader)
    {
        setDatabaseLoader(databaseLoader);
    }

    @Override
    public void addStudent(StudentRoomEntity studentRoomEntity)
    {
        getAppDatabase().studentDao().insertAll(studentRoomEntity);
    }

    @Override
    public void addPromotion(PromotionRoomEntity promotionRoomEntity)
    {
        getAppDatabase().promotionDao().insertAll(promotionRoomEntity);
    }

    @Override
    public List<PersistantPromotion> getPromotions()
    {
        return getAppDatabase().promotionDao().getAllPromotions();
    }

    private Promotion getPromotion(long promotionId)
    {
        for(Promotion promotionWithStudents: getPromotions())
            if(promotionWithStudents.getId() == promotionId)
            {
                return promotionWithStudents;
            }

        Log.i(TAG, "Promotion no." + promotionId + " not found");
        return new PersistantPromotion();
    }

    private Promotion getPromotionWithStudents(String promotionAcronym)
    {
        for(Promotion promotionWithStudents: getPromotions())
            if(promotionWithStudents.getAcronym() == promotionAcronym)
            {
                return promotionWithStudents;
            }

        Log.i(TAG, "Promotion [" + promotionAcronym + "] not found");
        return new PersistantPromotion();
    }

    public static AppDatabase getAppDatabase()
    {
        return MainActivity.getAppDatabase();
    }

    public DatabaseLoader getDatabaseLoader()
    {
        return _databaseLoader;
    }

    public void setDatabaseLoader(DatabaseLoader databaseLoader)
    {
        _databaseLoader = databaseLoader;
    }

    @Override
    public List<PersistantStudent> getStudents()
    {
        return getAppDatabase().studentDao().getAllStudents();
    }

    @Override
    public List<PersistantStudent> getStudents(long promotionId)
    {
        return getAppDatabase().studentDao().getStudentByPromotionId(promotionId);
    }

    @Override
    public List<PersistantStudent> getStudents(String promotionAcronym)
    {
        return getAppDatabase().studentDao().getStudentByPromotionAcronym(promotionAcronym);
    }
}