package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AboutUs(View view) {
        Intent intent = new Intent(MainActivity.this, AboutUs.class);
        startActivity(intent);

    }

    public void Creator(View view) {
        Intent intent = new Intent(MainActivity.this, Creator.class);
        startActivity(intent);

    }
    public void CallTheCreator(View view) {
        Intent intent = new Intent(MainActivity.this, CallTheCreator.class);
        startActivity(intent);

    }
    public void Web(View view) {
        Intent intent = new Intent(MainActivity.this, Web.class);
        startActivity(intent);

    }

}