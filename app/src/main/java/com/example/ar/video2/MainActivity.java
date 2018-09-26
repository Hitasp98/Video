package com.example.ar.video2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vi1;Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vi1=(VideoView)findViewById(R.id.vi1);
        bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String path="android.resource://com.example.ar.video/"+R.raw.vieo3;//نتخاب ویدیو
                vi1.setVideoURI(Uri.parse(path));
                vi1.start();
            }
        });

    }
}
