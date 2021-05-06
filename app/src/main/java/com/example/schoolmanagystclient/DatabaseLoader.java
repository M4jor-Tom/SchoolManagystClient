package com.example.schoolmanagystclient;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;
import androidx.room.Room;

public class DatabaseLoader extends AsyncTaskLoader<AppDatabase>
{
    public DatabaseLoader(@NonNull Context context)
    {
        super(context);
    }

    @Nullable
    @Override
    public AppDatabase loadInBackground()
    {
        return Room.databaseBuilder(
                getContext(),
                AppDatabase.class, "schoolmanagyst-db"
        ).build();
    }
}