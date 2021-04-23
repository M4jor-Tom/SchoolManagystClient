package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class PromotionFormActivity extends AppCompatActivity
{
    private EditText _promotionAcronymEditText;
    private EditText _promotionEntitledEditText;

    private MaterialButton _createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_form);
    }

    public EditText getPromotionAcronymEditText()
    {
        return _promotionAcronymEditText;
    }

    public void setPromotionAcronymEditText(EditText promotionAcronymEditText)
    {
        _promotionAcronymEditText = promotionAcronymEditText;
    }

    public EditText getPromotionEntitledEditText()
    {
        return _promotionEntitledEditText;
    }

    public void setPromotionEntitledEditText(EditText promotionEntitledEditText)
    {
        _promotionEntitledEditText = promotionEntitledEditText;
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