package com.example.schoolmanagystclient;

import androidx.room.Embedded;

public class PersistantStudent extends Student
{
    @Embedded
    public StudentRoomEntity _studentRoomEntity;

    public PersistantStudent(long id, long promotionId, String firstName, String lastName)
    {
        super(firstName, lastName);
        setId(id);
    }

    public PersistantStudent(long promotionId, String firstName, String lastName)
    {
        this(-1, promotionId, firstName, lastName);
    }

    public PersistantStudent()
    {
        this(0, "", "");
    }

    @Override
    public long getId()
    {
        return _studentRoomEntity.getId();
    }

    public void setId(long id)
    {
        _studentRoomEntity.setId(id);
    }

    @Override
    public String getFirstName()
    {
        return _studentRoomEntity.getFirstName();
    }

    @Override
    public void setFirstName(String firstName)
    {
        _studentRoomEntity.setFirstName(firstName);
    }

    @Override
    public String getLastName()
    {
        return _studentRoomEntity.getLastName();
    }

    @Override
    public void setLastName(String lastName)
    {
        _studentRoomEntity.setLastName(lastName);
    }
}