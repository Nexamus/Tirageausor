package com.gritlab.tirageausore.front.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.gritlab.tirageausore.R;

public class WelcomePageActivity extends AppCompatActivity {

    Button buttonToSaisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonToSaisie = (Button) findViewById(R.id.buttonToSaisie);

        setupListeners();
    }

    private void setupListeners() {
        buttonToSaisie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomePageActivity.this, SaisieActivity.class);
                startActivity(intent);
            }
        });
    }

}
