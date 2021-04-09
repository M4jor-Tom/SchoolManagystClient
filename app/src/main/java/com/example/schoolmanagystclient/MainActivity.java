package com.example.schoolmanagystclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPromotionsButton((MaterialButton)findViewById(R.id.promotionsButton));
        setStudentsButton((MaterialButton)findViewById(R.id.studentsButton));
        setPromotionsListView((ListView)findViewById(R.id.promotionsListView));
    }

    @Override
    public void onClick(View v)
    {

    }
}