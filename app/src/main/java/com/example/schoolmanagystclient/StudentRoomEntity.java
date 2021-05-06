package com.example.schoolmanagystclient;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class StudentRoomEntity
{
    @PrimaryKey
    @ColumnInfo(name="studentId")
    private long _id;

    @ColumnInfo(name = "promotionId")
    private long _promotionId;

    @ColumnInfo(name="firstName")
    private String _firstName;

    @ColumnInfo(name="lastName")
    private String _lastName;

    public StudentRoomEntity(long id, long promotionId, String firstName, String lastName)
    {
        setId(id);
        setPromotionId(promotionId);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public long getId()
    {
        return _id;
    }

    public void setId(long id)
    {
        _id = id;
    }

    public long getPromotionId()
    {
        return _promotionId;
    }

    public void setPromotionId(long promotionId)
    {
        _promotionId = promotionId;
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