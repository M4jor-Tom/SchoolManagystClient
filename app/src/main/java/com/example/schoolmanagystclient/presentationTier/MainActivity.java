package com.example.schoolmanagystclient.presentationTier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolmanagystclient.Logic;
import com.example.schoolmanagystclient.LogicInterface;
import com.example.schoolmanagystclient.R;
import com.example.schoolmanagystclient.Web.RestService;
import com.google.android.material.button.MaterialButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    private static LogicInterface _logicInterface;

    private MaterialButton _promotionsButton;
    private MaterialButton _studentsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //N-tier architecture
        setLogicInterface(new Logic(RestService.getInstance()));

        //Finding interactive elements
        setPromotionsButton((MaterialButton)findViewById(R.id.promotionsButton));
        setStudentsButton((MaterialButton)findViewById(R.id.studentsButton));

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
        getStudentsButton().setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public static LogicInterface getLogicInterface()
    {
        return _logicInterface;
    }

    public static void setLogicInterface(LogicInterface logicInterface)
    {
        _logicInterface = logicInterface;
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
}