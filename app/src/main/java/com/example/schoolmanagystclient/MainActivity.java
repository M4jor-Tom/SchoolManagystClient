package com.example.schoolmanagystclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    MaterialButton _promotionsButton;
    MaterialButton _studentsButton;
    ListView _promotionsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPromotionsButton((MaterialButton)findViewById(R.id.promotionsButton));
        setStudentsButton((MaterialButton)findViewById(R.id.studentsButton));
        setPromotionsListView((ListView)findViewById(R.id.promotionsListView));

        getPromotionsButton().setOnClickListener(this);
        getStudentsButton().setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

    }

    private MaterialButton getPromotionsButton()
    {
        return _promotionsButton;
    }

    private void setPromotionsButton(MaterialButton promotionsButton)
    {
        _promotionsButton = promotionsButton;
    }

    private MaterialButton getStudentsButton()
    {
        return _studentsButton;
    }

    private void setStudentsButton(MaterialButton studentsButton)
    {
        _studentsButton = studentsButton;
    }

    private ListView getPromotionListView()
    {
        return _promotionsListView;
    }

    private void setPromotionsListView(ListView promotionsListView)
    {
        _promotionsListView = promotionsListView;
    }
}