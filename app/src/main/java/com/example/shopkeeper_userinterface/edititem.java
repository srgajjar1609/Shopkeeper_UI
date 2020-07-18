package com.example.shopkeeper_userinterface;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class edititem extends AppCompatActivity implements View.OnClickListener {
    Button button_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edititem);

        button_edit = findViewById(R.id.btnedit);
        button_edit.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Edit Shop");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnedit:
                startActivity(new Intent(edititem.this, MainActivity.class));
                break;
        }

    }
}