package com.example.schoolmanagystclient;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student
{
    @PrimaryKey
    private long _id;

    @ColumnInfo(name="first_name")
    private String _firstName;

    @ColumnInfo(name="last_name")
    private String _lastName;

    public Student(long id, String firstName, String lastName)
    {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Student(String firstName, String lastName)
    {
        this(-1, firstName, lastName);
    }

    public Student()
    {
        setFirstName("");
        setLastName("");
    }

    public String toString()
    {
        return "Student::{firstName = " + getFirstName() + ",lastName = " + getLastName() + "}";
    }

    public long getId()
    {
        return _id;
    }

    public void setId(long id)
    {
        _id = id;
    }

    public String getFirstName()
    {
        return _firstName;
    }

    public void setFirstName(String firstName)
    {
        _firstName = firstName;
    }

    public String getLastName()
    {
        return _lastName;
    }

    public void setLastName(String lastName)
    {
        _lastName = lastName;
    }
}