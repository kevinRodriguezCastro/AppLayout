package com.cifpceuta.applayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityRelative extends AppCompatActivity {
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        lista = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.layout_lista,getResources().getStringArray(R.array.contenido_lista));
        lista.setAdapter(adapter);
    }
    public void volver(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}