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
        return _students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        _students = students;
    }
}