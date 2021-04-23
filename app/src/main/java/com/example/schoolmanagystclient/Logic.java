package com.example.schoolmanagystclient;

import java.util.ArrayList;

public class Logic implements LogicInterface
{
    private ArrayList<Promotion> _promotions;
    private ArrayList<Student> _students;

    public Logic()
    {
        setPromotions(new ArrayList<>());
        setStudents(new ArrayList<>());
    }

    public ArrayList<Promotion> getPromotions()
    {
        return _promotions;
    }

    public void setPromotions(ArrayList<Promotion> promotions)
    {
        _promotions = promotions;
    }

    public ArrayList<Student> getStudents()
    {
        return _students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        _students = students;
    }
}