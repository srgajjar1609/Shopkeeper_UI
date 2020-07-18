package com.example.shopkeeper_userinterface;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class additems extends AppCompatActivity implements View.OnClickListener{
    Button button_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additems);

        button_add = findViewById(R.id.btnadd);
        button_add.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Items");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.btnadd:
        startActivity(new Intent(additems.this, MainActivity.class));
        break;
    }
    }
}