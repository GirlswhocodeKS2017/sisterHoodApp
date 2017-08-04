package com.gwc.denise.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import android.widget.ArrayAdapter;

public class LearnerProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnerprofile);

        ArrayList<String> traits = new ArrayList<String>();

        traits.add("Brave and Resilient");
        traits.add("Socially Just");
        traits.add("Emotionally Intelligent");
        traits.add("Intellectually Curious");

        ArrayAdapter<String> traitsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, traits);
        ListView listView = (ListView) findViewById(R.id.lp_list);
        listView.setAdapter(traitsAdapter);



    }
}
