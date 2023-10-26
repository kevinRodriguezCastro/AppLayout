package com.cifpceuta.applayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class ActivityFrame extends AppCompatActivity {
    private VideoView video;
    private ImageButton btnPlay;
    private ImageButton btnVolver;
    private ImageButton btnPause;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        video = (VideoView) findViewById(R.id.videoView);
        video.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pajaro));

        btnPlay = (ImageButton) findViewById(R.id.btn_Play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideo(v);
            }
        });

        btnPause = (ImageButton) findViewById(R.id.btn_Pause);
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseVideo(v);
            }
        });

        btnVolver = (ImageButton) findViewById(R.id.btn_frame_volver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volver(v);
            }
        });

    }
    private void playVideo(View v){
        // Si esta activo se pausa
        if(video.isPlaying()){
            video.pause();
            //video.resume(); //Vuelve en marcha
        }else {
            video.start();
            btnPlay.setVisibility(View.INVISIBLE);
            btnPause.setVisibility(View.VISIBLE);
        }
    }
    private void pauseVideo(View v){
        if (video.isPlaying()){
            video.pause();
            btnPlay.setVisibility(View.VISIBLE);
            btnPause.setVisibility(View.INVISIBLE);
        }else {
            btnPlay.setVisibility(View.VISIBLE);
            btnPause.setVisibility(View.INVISIBLE);
        }
    }
    private void volver(View v){
        Intent i = new Intent(this, ActivityRelative.class);
        startActivity(i);
    }

}