package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class StudentFormActivity extends AppCompatActivity
{
    private final static String TAG = "StudentFormActivity";

    private EditText _studentFirstNameEditText;
    private EditText _studentLastNameEditText;
    private Spinner _promotionSpinner;
    private MaterialButton _createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);

        //Finding interactive elements
        setStudentFirstNameEditText((EditText)findViewById(R.id.studentFirstNameEditText));
        setStudentLastNameEditText((EditText)findViewById(R.id.studentLastNameEditText));
        setPromotionSpinner((Spinner)findViewById(R.id.promotionSpinner));
        setCreateButton((MaterialButton)findViewById(R.id.studentCreateButton));

        //FullFilling promotions
        getPromotionSpinner().setAdapter(new PromotionAdapter(
                this,
                MainActivity.getLogicInterface().getPromotions()
            )
        );

        //If promotionIndex is set, use it to locate the spinner default position
        if(getIntent().hasExtra("promotionId"))
        {
            boolean searching = true;
            long promotionId = getIntent().getLongExtra("promotionId", 0);
            int promotionIndex = 0;

            //Calculating promotion index from promotionId and promotions list
            for(Promotion promotion: MainActivity.getLogicInterface().getPromotions())
                if(promotion.getId() == promotionId)
                    searching = false;
                else if(searching)
                    promotionIndex++;

            getPromotionSpinner().setSelection(promotionIndex);
        }

        //Setting onclick to button
        getCreateButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Student student = new Student(
                                getStudentFirstNameEditText().getText().toString(),
                                getStudentLastNameEditText().getText().toString()
                        );
                        Log.i(TAG, student + " shall be created now");
                        MainActivity.getLogicInterface().addStudent(student);
                    }
                }
        );
    }

    public EditText getStudentFirstNameEditText()
    {
        return _studentFirstNameEditText;
    }

    public void setStudentFirstNameEditText(EditText studentFirstNameEditText)
    {
        _studentFirstNameEditText = studentFirstNameEditText;
    }

    public EditText getStudentLastNameEditText()
    {
        return _studentLastNameEditText;
    }

    public void setStudentLastNameEditText(EditText studentLastNameEditText)
    {
        _studentLastNameEditText = studentLastNameEditText;
    }

    public Spinner getPromotionSpinner()
    {
        return _promotionSpinner;
    }

    public void setPromotionSpinner(Spinner promotionSpinner)
    {
        _promotionSpinner = promotionSpinner;
    }

    public MaterialButton getCreateButton()
    {
        return _createButton;
    }

    public void setCreateButton(MaterialButton createButton)
    {
        _createButton = createButton;
    }
}