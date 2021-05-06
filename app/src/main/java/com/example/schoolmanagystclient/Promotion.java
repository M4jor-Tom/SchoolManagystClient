package com.example.schoolmanagystclient;

import java.util.ArrayList;
import java.util.List;

abstract public class Promotion
{
    public Promotion(String entitled, String acronym, List<Student> students)
    {
        setEntitled(entitled);
        setAcronym(acronym);
        setStudents(new ArrayList<>());
        setStudents(students);
    }

    public Promotion(String entitled, String acronym)
    {
        this(entitled, acronym, new ArrayList<>());
    }

    public Promotion()
    {
        this("", "", new ArrayList<>());
    }

    public String toString()
    {
        String _toString = "Promotion::\n{\n\tentitled = " + getEntitled() + "\n\tacronym = " + getAcronym();
        for(Student student: getStudents())
            _toString += "\n\t" + student;

        return _toString + "\n}";
    }

    public boolean ownsStudent(Student student)
    {
        for(Student studentChecked: getStudents())
            if(student.equalsStudent(studentChecked))
                return true;

            return false;
    }

    public boolean isNull()
    {
        return getEntitled() == "" && getAcronym() == "";
    }

    abstract public long getId();

    abstract public String getEntitled();

    abstract public void setEntitled(String entitled);

    abstract public String getAcronym();

    abstract public void setAcronym(String acronym);

    abstract public List<Student> getStudents();

    abstract public void setStudents(List<Student> students);
}