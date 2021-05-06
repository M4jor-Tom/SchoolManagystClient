package com.example.schoolmanagystclient;

public class UnPersistantStudent extends Student
{
    private String _firstName;
    private String _lastName;

    public UnPersistantStudent(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    public UnPersistantStudent()
    {
        super();
    }

    @Override
    public long getId()
    {
        return -1;
    }

    @Override
    public String getFirstName()
    {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName)
    {
        _firstName = firstName;
    }

    @Override
    public String getLastName()
    {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName)
    {
        _lastName = lastName;
    }
}