package com.example.shopkeeper_userinterface;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orders extends AppCompatActivity implements View.OnClickListener{
    Button button_orderview,buttton_orderview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        button_orderview = findViewById(R.id.btnvieworder);
        button_orderview.setOnClickListener(this);

        buttton_orderview1 = findViewById(R.id.btnvieworder2);
        buttton_orderview1.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Orders");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnvieworder:
                startActivity(new Intent(orders.this, order_details.class));
                break;
            case R.id.btnvieworder2:
                startActivity(new Intent(orders.this, order_details.class));
                break;

        }
    }
}