package com.example.schoolmanagystclient;

public class Student
{
    private long _id;
    private String
            _firstName,
            _lastName;

    public Student(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
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