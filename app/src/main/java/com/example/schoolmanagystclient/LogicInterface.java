package com.example.schoolmanagystclient;

import java.util.ArrayList;

public interface LogicInterface
{
    public void addStudent(Student student);
    public void addPromotion(Promotion promotion);

    public ArrayList<Student> getStudents();
    public ArrayList<Promotion> getPromotions();

    public ArrayList<Student> getStudents(long promotionId);
    public ArrayList<Student> getStudents(String promotionAcronym);
}