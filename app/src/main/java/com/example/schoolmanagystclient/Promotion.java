package com.example.schoolmanagystclient;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.ArrayList;

@Entity
public class Promotion
{
    @PrimaryKey
    private long _id;

    @ColumnInfo(name="entitled")
    private String _entitled;

    @ColumnInfo(name="acronym")
    private String _acronym;

    @Relation(
            parentColumn = "promotionId",
            entityColumn = "promotionId"
    )
    private ArrayList<Student> _students;


    public Promotion(long id, String entitled, String acronym, ArrayList<Student> students)
    {
        setId(id);
        setEntitled(entitled);
        setAcronym(acronym);
        setStudents(new ArrayList<>());
        setStudents(students);
    }

    public Promotion(String entitled, String acronym, ArrayList<Student> students)
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

    public ArrayList<Student> getStudents()
    {
        return _students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        _students = students;
    }
}