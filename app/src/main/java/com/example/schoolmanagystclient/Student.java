package com.example.schoolmanagystclient;

import androidx.annotation.Nullable;

abstract public class Student
{
    public Student(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Student()
    {
        this("", "");
    }

    public String toString()
    {
        return "Student::{firstName = " + getFirstName() + ",lastName = " + getLastName() + "}";
    }

    public boolean equalsStudent(Student student)
    {
        return student.getFirstName() == getFirstName() && student.getLastName() == getLastName();
    }

    abstract public long getId();

    abstract public String getFirstName();

    abstract public void setFirstName(String firstName);

    abstract public String getLastName();

    abstract public void setLastName(String lastName);
}