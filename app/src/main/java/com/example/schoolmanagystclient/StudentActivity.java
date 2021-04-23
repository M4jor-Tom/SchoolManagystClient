package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentActivity extends AppCompatActivity
{
    ListView _studentsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        setStudentsListView((ListView)findViewById(R.id.studentsListView));
    }

    public ListView getStudentsListView()
    {
        return _studentsListView;
    }

    public void setStudentsListView(ListView studentsListView)
    {
        _studentsListView = studentsListView;
    }
}