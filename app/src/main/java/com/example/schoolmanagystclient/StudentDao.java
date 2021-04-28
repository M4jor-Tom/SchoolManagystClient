package com.example.schoolmanagystclient;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao
{
    @Query("SELECT * FROM student")
    public List<Student> getAllStudents();

    //@Query("SELECT * FROM student WHERE promotionId = :promotionId")
    //public Promotion getStudentByPromotionId(long promotionId);

    @Query("SELECT * FROM student WHERE _id = :studentId")
    public Promotion getStudentById(long studentId);

    @Insert
    void insertAll(Student... students);

    @Delete
    void delete(Student student);
}