package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class StudentActivity extends AppCompatActivity
{
    private ListView _studentsListView;
    private MaterialButton _studentFormButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        setStudentsListView((ListView)findViewById(R.id.studentsListView));
        setStudentFormButton((MaterialButton)findViewById(R.id.studentFormButton));
    }

    public ListView getStudentsListView()
    {
        return _studentsListView;
    }

    public void setStudentsListView(ListView studentsListView)
    {
        _studentsListView = studentsListView;
    }

    public MaterialButton getStudentFormButton()
    {
        return _studentFormButton;
    }

    public void setStudentFormButton(MaterialButton studentFormButton)
    {
        _studentFormButton = studentFormButton;
    }
}