package com.example.schoolmanagystclient;

import android.util.Log;

import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Logic implements LogicInterface
{
    private static final String TAG = "Logic";
    private List<Promotion> _promotions;

    public Logic()
    {
        setPromotions(new ArrayList<>());
    }

    @Override
    public void addPromotion(Promotion promotion)
    {
        getPromotions().add(promotion);
    }

    @Override
    public List<Promotion> getPromotions()
    {
        return _promotions;
    }

    private Promotion getPromotion(long promotionId)
    {
        for(Promotion promotion: getPromotions())
            if(promotion.getId() == promotionId)
            {
                return promotion;
            }

        Log.i(TAG, "Promotion no." + promotionId + " not found");
        return new Promotion();
    }

    private Promotion getPromotion(String promotionAcronym)
    {
        for(Promotion promotion: getPromotions())
            if(promotion.getAcronym() == promotionAcronym)
            {
                return promotion;
            }

        Log.i(TAG, "Promotion [" + promotionAcronym + "] not found");
        return new Promotion();
    }

    public void setPromotions(List<Promotion> promotions)
    {
        _promotions = promotions;
    }

    @Override
    public List<Student> getStudents()
    {
        List<Student> students = new ArrayList<>();

        for(Promotion promotion: getPromotions())
            students.addAll(promotion.getStudents());

        return students;
    }

    @Override
    public List<Student> getStudents(long promotionId)
    {
        return getPromotion(promotionId).getStudents();
    }

    @Override
    public List<Student> getStudents(String promotionAcronym)
    {
        return getPromotion(promotionAcronym).getStudents();
    }

    public void setStudents(List<Student> students, long promotionId)
    {
        getPromotion(promotionId).getStudents().addAll(students);
    }

    public void setStudents(List<Student> students, String promotionAcronym)
    {
        getPromotion(promotionAcronym).getStudents().addAll(students);
    }
}