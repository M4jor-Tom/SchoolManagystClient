package com.example.schoolmanagystclient;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.List;

public class StudentActivity extends AppCompatActivity
{
    private static final String TAG = "StudentActivity";
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

        //If promotionId is not set, all students are to be shown
        List<Student> students = MainActivity.getLogicInterface().getStudents();

        //If promotionId is set, promotion's students are to be shown
        if(getIntent().hasExtra("promotionPosition"))
        {
            int promotionPosition = (int)getIntent().getLongExtra("promotionPosition", 0);

            Log.i(TAG, "promotionPosition: " + promotionPosition);

            students = MainActivity.getLogicInterface().getStudents(
                    MainActivity.getLogicInterface().getPromotions().get(promotionPosition).getAcronym()
            );
        }


        //Assigning adapter
        getStudentsListView().setAdapter(
                new StudentsAdapter(this, students)
        );

        //Setting of interactive elements' OnClickListeners
        getStudentFormButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(StudentActivity.this, StudentFormActivity.class);
                        intent.putExtras(getIntent());
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