package com.example.schoolmanagystclient;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PromotionActivity extends AppCompatActivity
{
    private ListView _promotionsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);
        setPromotionsListView((ListView)findViewById(R.id.promotionsListView));
    }

    public ListView getPromotionsListView()
    {
        return _promotionsListView;
    }

    public void setPromotionsListView(ListView promotionsListView)
    {
        _promotionsListView = promotionsListView;
    }
}