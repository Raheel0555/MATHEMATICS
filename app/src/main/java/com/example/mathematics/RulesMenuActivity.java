package com.example.mathematics;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class RulesMenuActivity extends AppCompatActivity {

    private LinearLayout btnGameRules;
    private LinearLayout btnSafetyRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules_menu);

        btnGameRules   = findViewById(R.id.btnGameRules);
        btnSafetyRules = findViewById(R.id.btnSafetyRules);

        // Open Game Rules & Guidelines screen
        btnGameRules.setOnClickListener(v ->
                startActivity(new Intent(RulesMenuActivity.this, GameRulesActivity.class)));

        // Open Safety & Usage Rules screen
        btnSafetyRules.setOnClickListener(v ->
                startActivity(new Intent(RulesMenuActivity.this, SafetyRulesActivity.class)));
    }
}
