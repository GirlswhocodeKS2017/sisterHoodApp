package com.gwc.denise.listapp;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import android.app.Activity;

/**
 * Created by denise on 7/31/17.
 */

public class SisterAdaptor extends ArrayAdapter<Sisters> {

    public SisterAdaptor(Activity context, ArrayList<Sisters> sisters){
        super(context, 0, sisters);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Sisters currentSister = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);


        nameTextView.setText(currentSister.getName());


        TextView emailTextView = (TextView) listItemView.findViewById(R.id.email_text_view);

        emailTextView.setText(currentSister.getEmailAddress());


        return listItemView;
    }
}
