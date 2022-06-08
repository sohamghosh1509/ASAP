package com.example.asap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DriverCustomerActivity extends AppCompatActivity {
    private Button driver,customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_customer);

        driver = (Button) findViewById(R.id.driverbtn);
        customer = (Button) findViewById(R.id.customerbtn);

        driver.setOnClickListener(view -> {
            Intent in = new Intent(this, DriverRegistrationActivity.class);
            startActivity(in);
        });
        customer.setOnClickListener(view -> {
            Intent in = new Intent(this, CustomerRegistrationActivity.class);
            startActivity(in);
        });
    }
}