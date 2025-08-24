package com.example.mathematics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
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
        cardRules = findViewById(R.id.cardRules);
        cardLearn = findViewById(R.id.cardLearn);

        // Set click listeners
        cardContents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show toast for now
                Toast.makeText(MainActivity.this, "Contents clicked!", Toast.LENGTH_SHORT).show();

                // Uncomment when you create ContentsActivity
                // Intent intent = new Intent(MainActivity.this, ContentsActivity.class);
                // startActivity(intent);
            }
        });

        cardRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show toast for now
                Toast.makeText(MainActivity.this, "Rules clicked!", Toast.LENGTH_SHORT).show();

                // Uncomment when you create RulesActivity
                // Intent intent = new Intent(MainActivity.this, RulesActivity.class);
                // startActivity(intent);
            }
        });

        cardLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show toast for now
                Toast.makeText(MainActivity.this, "What you'll learn clicked!", Toast.LENGTH_SHORT).show();

                // Uncomment when you create LearnActivity
                // Intent intent = new Intent(MainActivity.this, LearnActivity.class);
                // startActivity(intent);
            }
        });
    }
}
