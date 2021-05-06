package com.example.schoolmanagystclient;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class PromotionRoomEntity
{
    @PrimaryKey
    @ColumnInfo(name = "promotionId")
    private long _id;

    @ColumnInfo(name = "entitled")
    private String _entitled;

    @ColumnInfo(name = "acronym")
    private String _acronym;

    public PromotionRoomEntity(long id, String entitled, String acronym)
    {
        setId(id);
        setEntitled(entitled);
        setAcronym(acronym);
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
}