package com.example.schoolmanagystclient;

import android.util.Log;

import java.util.ArrayList;

public class Logic implements LogicInterface
{
    private static final String TAG = "Logic";
    private ArrayList<Promotion> _promotions;

    public Logic()
    {
        setPromotions(new ArrayList<>());
    }

    @Override
    public void addStudent(Student student)
    {
        getStudents().add(student);
    }

    @Override
    public void addPromotion(Promotion promotion)
    {
        getPromotions().add(promotion);
    }

    @Override
    public ArrayList<Promotion> getPromotions()
    {
        return _promotions;
    }

    public void setPromotions(ArrayList<Promotion> promotions)
    {
        _promotions = promotions;
    }

    @Override
    public ArrayList<Student> getStudents()
    {
        ArrayList<Student> students = new ArrayList<>();

        for(Promotion promotion: getPromotions())
            students.addAll(promotion.getStudents());

        return students;
    }

    public void setStudents(ArrayList<Student> students, long promotionId)
    {
        boolean set = false;
        for(Promotion promotion: getPromotions())
            if(promotion.getId() == promotionId)
            {
                promotion.setStudents(students);
                set = true;
            }

        if(!set)
            Log.i(TAG, "Promotion of id " + promotionId + " unfounded");
    }

    public void setStudents(ArrayList<Student> students, String promotionAcronym)
    {
        boolean set = false;
        for(Promotion promotion: getPromotions())
            if(promotion.getAcronym() == promotionAcronym)
            {
                promotion.setStudents(students);
                set = true;
            }

        if(!set)
            Log.i(TAG, "Promotion of id " + promotionAcronym + " unfounded");
    }
}