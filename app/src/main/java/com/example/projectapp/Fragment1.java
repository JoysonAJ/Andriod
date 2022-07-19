package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragment1 extends AppCompatActivity {

    Button homeButton,tutorialVd,practiceSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);

        homeButton = findViewById(R.id.BackLogin);
        tutorialVd = findViewById(R.id.YtCOntent);
        practiceSite = findViewById(R.id.HackerSite);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fragment1.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}