package com.example.schoolmanagystclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity
{
    MaterialButton _promotionsButton;
    MaterialButton _studentsButton;
    ListView _promotionsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding interactive elements
        setPromotionsButton((MaterialButton)findViewById(R.id.promotionsButton));
        setStudentsButton((MaterialButton)findViewById(R.id.studentsButton));
        setPromotionsListView((ListView)findViewById(R.id.promotionsListView));

        //Setting of interactive elements' OnClickListeners
        getPromotionsButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(MainActivity.this, PromotionActivity.class);
                        startActivity(intent);
                    }
                }
        );
        /*getStudentsButton().setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getPromotionsButton().equals(v)) {
                            Intent intent = new Intent(MainActivity.this, PromotionActivity.class);
                            startActivity(intent);
                        }
                    }
                }
                );*/
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