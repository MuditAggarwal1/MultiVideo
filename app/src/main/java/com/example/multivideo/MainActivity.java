package com.example.multivideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
VideoView vv,vv1,vv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     vv = findViewById(R.id.vv);
//     vv1 = findViewById(R.id.vv1);
     vv2 = findViewById(R.id.vv2);
     vv.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.song);
        MediaController md = new MediaController(this);
        vv.setMediaController(md);
        md.setAnchorView(vv);
        vv.pause();

        vv2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        MediaController md2 = new MediaController(this);
        vv2.setMediaController(md2);
        md2.setAnchorView(vv2);
        vv2.pause();
    }
}