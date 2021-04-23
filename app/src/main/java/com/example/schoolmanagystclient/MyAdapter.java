package com.example.schoolmanagystclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;

import java.util.List;

abstract public class MyAdapter<Entity> extends BaseAdapter
{
    private Context _context;
    private List<Entity> _entities;

    public MyAdapter(Context context, List<Entity> entities)
    {
        setContext(context);
        setEntities(entities);
    }

    @Override
    public int getCount()
    {
        return getEntities().size();
    }

    @Override
    public Object getItem(int position)
    {
        return getEntities().get(position);
    }

    //Use this method in getView()
    protected View selectView(View convertView, int layoutId)
    {
        if(convertView == null)
            return getLayoutInflater().inflate(layoutId, null);

        return convertView;
    }

    public Context getContext()
    {
        return _context;
    }

    public void setContext(Context context)
    {
        _context = context;
    }

    public List<Entity> getEntities()
    {
        return _entities;
    }

    public void setEntities(List<Entity> entities)
    {
        _entities = entities;
    }

    public LayoutInflater getLayoutInflater()
    {
        return LayoutInflater.from(getContext());
    }
}