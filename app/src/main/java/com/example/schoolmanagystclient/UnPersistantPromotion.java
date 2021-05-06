package com.example.schoolmanagystclient;

import java.util.List;

public class UnPersistantPromotion extends Promotion
{
    private String _acronym;
    private String _entitled;
    List<Student> _students;

    public UnPersistantPromotion(String entitled, String acronym, List<Student> students)
    {
        super(entitled, acronym, students);
    }

    public UnPersistantPromotion()
    {
        super();
    }

    @Override
    public long getId()
    {
        return -1;
    }

    @Override
    public String getEntitled()
    {
        return _entitled;
    }

    @Override
    public void setEntitled(String entitled)
    {
        _entitled = entitled;
    }

    @Override
    public String getAcronym()
    {
        return _acronym;
    }

    @Override
    public void setAcronym(String acronym)
    {
        _acronym = acronym;
    }

    @Override
    public List<Student> getStudents()
    {
        return _students;
    }

    @Override
    public void setStudents(List<Student> students)
    {
        _students = students;
    }
}