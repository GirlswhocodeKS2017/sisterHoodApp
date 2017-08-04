package com.gwc.denise.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView sisters = (TextView) findViewById(R.id.sistertext);
        sisters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sisterIntent = new Intent(MainActivity.this, SistersActivity.class);

                startActivity(sisterIntent);

            }
        });


        final TextView learner = (TextView) findViewById(R.id.learner);
        learner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learnerIntent = new Intent(MainActivity.this, LearnerProfileActivity.class);

                startActivity(learnerIntent);

            }
        });


        TextView question = (TextView) findViewById(R.id.questions);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent questionIntent = new Intent(MainActivity.this, EssentialActivity.class);

                startActivity(questionIntent);

            }
        });


        TextView gwc = (TextView) findViewById(R.id.gwc);
        gwc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gwcIntent = new Intent(MainActivity.this, GWCActivity.class);

                startActivity(gwcIntent);

            }
        });

    }
}
