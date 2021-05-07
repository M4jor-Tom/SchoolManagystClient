package com.example.schoolmanagystclient;

import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.entities.Student;

import java.util.ArrayList;
import java.util.List;

public interface LogicInterface
{
    public List<Promotion> getPromotions();
    public void setPromotions(List<Promotion> promotions);
    public void addPromotion(Promotion promotion);

    public List<Student> getStudents();
    public List<Student> getStudents(String promotionAcronym);
    public void setStudents(List<Student> students);
    public void addStudent(Student student);
}