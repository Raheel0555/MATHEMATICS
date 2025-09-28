package com.example.mathematics;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView cardContents, cardRules, cardLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CardViews
        cardContents = findViewById(R.id.cardContents);
        cardRules    = findViewById(R.id.cardRules);
        cardLearn    = findViewById(R.id.cardLearn);

        // Contents → open the Contents screen
        cardContents.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ContentsActivity.class))
        );

        // Rules → open the Rules menu
        cardRules.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, RulesMenuActivity.class))
        );

        // What you'll learn → open the learning screen
        cardLearn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, WhatYoullLearnActivity.class))
        );
    }
}
