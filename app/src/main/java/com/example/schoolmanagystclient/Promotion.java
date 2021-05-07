package com.example.schoolmanagystclient;

import java.util.ArrayList;
import java.util.List;

public class Promotion
{
    private long _id;
    private String
            _entitled,
            _acronym;
    private List<Student> _students;


    public Promotion(long id, String entitled, String acronym, List<Student> students)
    {
        setId(id);
        setEntitled(entitled);
        setAcronym(acronym);
        setStudents(new ArrayList<>());
        setStudents(students);
    }

    public Promotion(String entitled, String acronym, List<Student> students)
    {
        this(-1, entitled, acronym, students);
    }

    public Promotion(String entitled, String acronym)
    {
        this(entitled, acronym, new ArrayList<>());
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

    public List<Student> getStudents()
    {
        return _students;
    }

    public void setStudents(List<Student> students)
    {
        _students = students;
    }
}