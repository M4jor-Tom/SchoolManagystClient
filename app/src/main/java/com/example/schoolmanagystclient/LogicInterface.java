package com.example.schoolmanagystclient;

import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.entities.Student;

import java.util.List;

public interface LogicInterface
{
    public void addPromotion(Promotion promotion);

    public List<Student> getStudents();
    public List<Promotion> getPromotions();

    public List<Student> getStudents(long promotionId);
    public List<Student> getStudents(String promotionAcronym);
}