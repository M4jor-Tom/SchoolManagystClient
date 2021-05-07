package com.example.schoolmanagystclient.presentationTier;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schoolmanagystclient.R;
import com.example.schoolmanagystclient.entities.Promotion;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PromotionActivity extends AppCompatActivity
{
    private static final String TAG = "PromotionActivity";
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

        getPromotionsListView().setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(PromotionActivity.this, StudentActivity.class);

                String promotionAcronym = MainActivity.getLogicInterface().getPromotions().get(position).getAcronym();

                intent.putExtra("promotionAcronym", promotionAcronym);
                startActivity(intent);
            }
        });

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