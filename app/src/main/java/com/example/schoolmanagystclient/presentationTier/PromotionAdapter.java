package com.example.schoolmanagystclient.presentationTier;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.schoolmanagystclient.entities.Promotion;
import com.example.schoolmanagystclient.R;

import java.util.List;

public class PromotionAdapter extends MyAdapter<Promotion>
{
    private static final String TAG = "PromotionAdapter";

    public PromotionAdapter(Context context, List<Promotion> promotions)
    {
        super(context, promotions);
    }

    @Override
    public long getItemId(int position)
    {
        return getEntities().get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Loading view
        View view = selectView(convertView, R.layout.layout_promotion_option);

        //Getting student
        Promotion promotion = getEntities().get(position);

        //Getting TextViews in layout
        TextView acronym = (TextView)view.findViewById(R.id.promotionAcronymTextViewOption);
        TextView entitled = (TextView)view.findViewById(R.id.promotionEntitledTextViewOption);

        //Filling layout
        acronym.setText(promotion.getAcronym());
        entitled.setText(promotion.getEntitled());

        //Printing selection
        Log.i(TAG, promotion + " selected");

        return view;
    }
}