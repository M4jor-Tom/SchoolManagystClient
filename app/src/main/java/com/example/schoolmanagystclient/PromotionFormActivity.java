package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class PromotionFormActivity extends AppCompatActivity
{
    private final static String TAG = "PromotionFormActivity";

    private EditText _promotionAcronymEditText;
    private EditText _promotionEntitledEditText;

    private MaterialButton _createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_form);

        //Finding interactive elements
        setPromotionAcronymEditText((EditText)findViewById(R.id.promotionAcronymEditText));
        setPromotionEntitledEditText((EditText)findViewById(R.id.promotionEntitledEditText));
        setCreateButton((MaterialButton)findViewById(R.id.promotionCreateButton));

        //Setting onclick to button
        getCreateButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Promotion promotion = new Promotion(
                                getPromotionEntitledEditText().getText().toString(),
                                getPromotionAcronymEditText().getText().toString()
                        );
                        Log.i(TAG, promotion + " shall be created now");
                        MainActivity.getLogicInterface().addPromotion(promotion);
                    }
                }
        );
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