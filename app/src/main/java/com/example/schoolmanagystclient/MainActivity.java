package com.example.schoolmanagystclient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<AppDatabase>
{
    private static LogicInterface _logicInterface;

    private MaterialButton _promotionsButton;
    private MaterialButton _studentsButton;

    private static AppDatabase _appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Generic instructions
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //N-tier architecture
        //Database stuff
        getSupportLoaderManager().initLoader(0, null, MainActivity.this).forceLoad();
        setLogicInterface(new Logic(new DatabaseLoader(MainActivity.this)));

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

    public static AppDatabase getAppDatabase()
    {
        return _appDatabase;
    }

    private static void setAppDatabase(AppDatabase appDatabase)
    {
        _appDatabase = appDatabase;
    }

    @NonNull
    @Override
    public Loader<AppDatabase> onCreateLoader(int id, @Nullable Bundle args)
    {
        return new DatabaseLoader(MainActivity.this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<AppDatabase> loader, AppDatabase data)
    {
        setAppDatabase(data);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<AppDatabase> loader)
    {

    }
}