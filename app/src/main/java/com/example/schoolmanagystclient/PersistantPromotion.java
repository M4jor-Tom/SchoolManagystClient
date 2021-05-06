package com.example.schoolmanagystclient;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.ArrayList;
import java.util.List;

public class PersistantPromotion extends Promotion
{
    @Embedded
    public PromotionRoomEntity _promotionRoomEntity;

    @Relation(
            parentColumn = "studentId",
            entityColumn = "promotionId"
    )
    public List<Student> _students;

    public PersistantPromotion(long id, String entitled, String acronym, List<Student> students)
    {
        super(entitled, acronym, students);
        setId(id);
    }

    public PersistantPromotion(String entitled, String acronym, List<Student> students)
    {
        this(-1, entitled, acronym, students);
    }

    public PersistantPromotion()
    {
        this("", "", new ArrayList<>());
    }

    @Override
    public long getId()
    {
        return _promotionRoomEntity.getId();
    }

    public void setId(long id)
    {
        _promotionRoomEntity.setId(id);
    }

    @Override
    public String getEntitled()
    {
        return _promotionRoomEntity.getEntitled();
    }

    @Override
    public void setEntitled(String entitled)
    {
        _promotionRoomEntity.setEntitled(entitled);
    }

    @Override
    public String getAcronym()
    {
        return _promotionRoomEntity.getAcronym();
    }

    @Override
    public void setAcronym(String acronym)
    {
        _promotionRoomEntity.setAcronym(acronym);
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