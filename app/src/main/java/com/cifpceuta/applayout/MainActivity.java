package com.cifpceuta.applayout;

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
    public void linear(View v){
        Intent i = new Intent(this,ActivityLinear.class);
        startActivity(i);
    }
    public void frame(View v){
        Intent i = new Intent(this,ActivityFrame.class);
        startActivity(i);
    }
}