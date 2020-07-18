package com.example.shopkeeper_userinterface;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button_orders,button_additems,button_edititems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_orders = findViewById(R.id.btnorders);
        button_orders.setOnClickListener(this);

        button_additems = findViewById(R.id.btnadditems);
        button_additems.setOnClickListener(this);

        button_edititems = findViewById(R.id.btnedititems);
        button_edititems.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Dashboard");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnorders:
                startActivity(new Intent(MainActivity.this, orders.class));
                break;
            case R.id.btnadditems:
                startActivity(new Intent(MainActivity.this, additems.class));
                break;
            case R.id.btnedititems:
                startActivity(new Intent(MainActivity.this, edititem.class));
                break;
        }
    }
}