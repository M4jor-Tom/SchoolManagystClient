package com.example.schoolmanagystclient;

import java.util.ArrayList;

public interface LogicInterface
{
    public void addStudent(Student student);
    public void addPromotion(Promotion promotion);

    public ArrayList<Student> getStudents();
    public ArrayList<Promotion> getPromotions();
}