package com.example.codetube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView globe=findViewById(R.id.globe);

        globe.setVideoPath("android.resource://" + getPackageName()+ "/" + R.raw.omg);
        MediaController media=new MediaController(this);
        globe.setMediaController(media);
        media.setAnchorView(globe);


        globe.start();
    }
}