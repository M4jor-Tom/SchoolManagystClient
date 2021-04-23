package com.example.schoolmanagystclient;

import java.util.ArrayList;

public class Promotion
{
    private long _id;
    private String
            _entitled,
            _acronym;
    private ArrayList<Student> _students;


    public Promotion(String entitled, String acronym, ArrayList<Student> studients)
    {
        setEntitled(entitled);
        setAcronym(acronym);
        setStudents(new ArrayList<>());
        setStudents(studients);
    }

    public Promotion(String entitled, String acronym)
    {
        setEntitled(entitled);
        setAcronym(acronym);
        setStudents(new ArrayList<>());
    }

    public Promotion()
    {
        setEntitled("");
        setAcronym("");
        setStudents(new ArrayList<>());
    }

    public void addStudent(Student student)
    {
        getStudents().add(student);
    }

    public String toString()
    {
        String _toString = "Promotion::\n{\n\tentitled = " + getEntitled() + "\n\tacronym = " + getAcronym();
        for(int i = 0; i < _students.size(); i++)
            _toString += "\n\t" + getStudents().get(i);

        return _toString + "\n}";
    }

    public boolean isNull()
    {
        return _entitled == "" && _acronym == "";
    }

    public long getId()
    {
        return _id;
    }

    public void setId(long id)
    {
        _id = id;
    }

    public String getEntitled()
    {
        return _entitled;
    }

    public void setEntitled(String entitled)
    {
        _entitled = entitled;
    }

    public String getAcronym()
    {
        return _acronym;
    }

    public void setAcronym(String acronym)
    {
        _acronym = acronym;
    }

    public ArrayList<Student> getStudents()
    {
        return _students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        _students = students;
    }
}