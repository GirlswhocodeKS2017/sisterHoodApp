package com.gwc.denise.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EssentialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.essential_activity);


        ArrayList<String> questions = new ArrayList<String>();

        questions.add("Who are computer scientists?");
        questions.add("What is computer science?");
        questions.add("How and why do we use computer science to solve problems?");
        questions.add("In what ways can computer science impact your communities and society at large?");

        ArrayAdapter<String> questionsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
        ListView listView = (ListView) findViewById(R.id.questions_list);
        listView.setAdapter(questionsAdapter);



    }
}
