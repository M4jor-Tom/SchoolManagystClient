package com.example.schoolmanagystclient;

import java.util.ArrayList;
import java.util.List;

public interface LogicInterface
{
    public void addStudent(StudentRoomEntity studentRoomEntity);
    public void addPromotion(PromotionRoomEntity promotionRoomEntity);

    public List<PersistantStudent> getStudents();
    public List<PersistantPromotion> getPromotions();

    public List<PersistantStudent> getStudents(long promotionId);
    public List<PersistantStudent> getStudents(String promotionAcronym);
}