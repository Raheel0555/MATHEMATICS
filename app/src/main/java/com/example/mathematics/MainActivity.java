package com.example.mathematics;

import android.content.Intent;
import android.os.Bundle;
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
        cardRules    = findViewById(R.id.cardRules);
        cardLearn    = findViewById(R.id.cardLearn);

        // Contents (placeholder)
        cardContents.setOnClickListener(v ->
                        Toast.makeText(MainActivity.this, "Contents clicked!", Toast.LENGTH_SHORT).show()
                // When ready:
                // startActivity(new Intent(MainActivity.this, ContentsActivity.class));
        );

        // Rules → open the Rules menu (two buttons)
        cardRules.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, RulesMenuActivity.class))
        );

        // What you'll learn (placeholder)
        cardLearn.setOnClickListener(v ->
                        Toast.makeText(MainActivity.this, "What you'll learn clicked!", Toast.LENGTH_SHORT).show()
                // When ready:
                // startActivity(new Intent(MainActivity.this, LearnActivity.class));
        );
    }
}
