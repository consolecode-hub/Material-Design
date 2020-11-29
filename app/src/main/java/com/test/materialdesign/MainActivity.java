package com.test.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);
    }

    public void launch1(View view) {
        Intent i = new Intent(this, launch1.class);
        startActivity(i);
    }

    public void launch2(View view) {
        Intent i = new Intent(this, launch2.class);
        startActivity(i);
    }

    public void launch3(View view) {
        Intent i = new Intent(this, launch3.class);
        startActivity(i);
    }

    public void launch4(View view) {
        Intent i = new Intent(this, launch4.class);
        startActivity(i);
    }
}