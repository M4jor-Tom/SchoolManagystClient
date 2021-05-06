package com.example.schoolmanagystclient;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao
{
    @Query("SELECT * FROM StudentRoomEntity")
    public List<PersistantStudent> getAllStudents();

    @Query("SELECT * FROM StudentRoomEntity WHERE promotionId = :promotionId")
    public List<PersistantStudent> getStudentByPromotionId(long promotionId);

    @Query("SELECT * FROM StudentRoomEntity JOIN PromotionRoomEntity ON StudentRoomEntity.promotionId = PromotionRoomEntity.promotionId WHERE acronym = :promotionAcronym")
    public List<PersistantStudent> getStudentByPromotionAcronym(String promotionAcronym);

    @Query("SELECT * FROM StudentRoomEntity WHERE studentId = :studentId")
    public PersistantStudent getStudentById(long studentId);

    @Insert
    void insertAll(StudentRoomEntity... students);
    @Insert
    void insertAll(List<StudentRoomEntity> students);

    @Delete
    void delete(StudentRoomEntity student);
}