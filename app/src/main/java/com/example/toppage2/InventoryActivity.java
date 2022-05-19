package com.example.toppage2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        setTitle("box内情報");
    }
}