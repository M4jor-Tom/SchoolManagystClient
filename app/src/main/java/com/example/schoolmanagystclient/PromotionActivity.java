package com.example.schoolmanagystclient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class PromotionActivity extends AppCompatActivity
{
    private ListView _promotionsListView;
    private MaterialButton _promotionFormButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);

        //Finding interactive elements
        setPromotionFormButton((MaterialButton)findViewById(R.id.promotionFormButton));
        setPromotionsListView((ListView)findViewById(R.id.promotionsListView));


        //Assigning adapter
        getPromotionsListView().setAdapter(
                new PromotionAdapter(
                        this,
                        MainActivity.getLogicInterface().getPromotions()
                )
        );

        //Setting of interactive elements' OnClickListeners
        getPromotionFormButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(PromotionActivity.this, PromotionFormActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public ListView getPromotionsListView()
    {
        return _promotionsListView;
    }

    public void setPromotionsListView(ListView promotionsListView)
    {
        _promotionsListView = promotionsListView;
    }

    public MaterialButton getPromotionFormButton()
    {
        return _promotionFormButton;
    }

    public void setPromotionFormButton(MaterialButton promotionFormButton)
    {
        _promotionFormButton = promotionFormButton;
    }
}