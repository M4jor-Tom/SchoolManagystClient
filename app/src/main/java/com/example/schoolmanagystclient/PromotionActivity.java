package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PromotionActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);
        ListView promotionsList = (ListView)findViewById(R.id.promotionsList);
        ListView studentsList = (ListView)findViewById(R.id.studentsList);
    }
}