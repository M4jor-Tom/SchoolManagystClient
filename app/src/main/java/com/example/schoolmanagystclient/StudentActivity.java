package com.example.schoolmanagystclient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        //Finding interactive elements
        setStudentFormButton((MaterialButton)findViewById(R.id.studentFormButton));
        setStudentsListView((ListView)findViewById(R.id.studentsListView));

        //Assigning adapter
        getStudentsListView().setAdapter(
                new StudentsAdapter(
                        this,
                        MainActivity.getLogicInterface().getStudents()
                )
        );

        //Setting of interactive elements' OnClickListeners
        getStudentFormButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(StudentActivity.this, StudentFormActivity.class);
                        startActivity(intent);
                    }
                }
        );
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