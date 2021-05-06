package com.example.schoolmanagystclient;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentsAdapter extends MyAdapter<PersistantStudent>
{
    private static final String TAG = "StudentsAdapter";

    public StudentsAdapter(Context context, List<PersistantStudent> students)
    {
        super(context, students);

    }

    @Override
    public long getItemId(int position)
    {
        return getEntities().get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Loading view
        View view = selectView(convertView, R.layout.layout_student_option);

        //Getting student
        Student student = getEntities().get(position);

        //Getting TextViews in layout
        TextView firstName = (TextView)view.findViewById(R.id.studentFirstNameTextViewOption);
        TextView lastName = (TextView)view.findViewById(R.id.studentLastNameTextViewOption);

        //Filling layout
        firstName.setText(student.getFirstName());
        lastName.setText(student.getLastName());

        //Printing selection
        Log.i(TAG, student + " selected");

        return view;
    }
}