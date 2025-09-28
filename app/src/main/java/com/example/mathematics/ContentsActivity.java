package com.example.mathematics;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ContentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contents);
        // Removed the setOnApplyWindowInsetsListener using R.id.main, because
        // activity_contents.xml does not define a view with id "main".
        // If insets handling is needed later, add android:id="@+id/main"
        // to the root view in activity_contents.xml and reattach the listener.
    }
}
