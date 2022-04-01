package com.example.week4mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    Button up,down;
    ImageView img1,img2;
    ScrollView s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        up=(Button) findViewById(R.id.button1);
        down=(Button) findViewById(R.id.button2);
        img1=(ImageView) findViewById(R.id.image1);
        img2=(ImageView) findViewById(R.id.image2);

        s1=(ScrollView) findViewById(R.id.scrollView);
        s2=(ScrollView) findViewById(R.id.scrollView2);

        s1.setHorizontalScrollBarEnabled(true);
        s2.setHorizontalScrollBarEnabled(true);

        img1.setImageResource(R.drawable.top1);
        img2.setImageResource(R.drawable.top1);

        img2.setVisibility(View.INVISIBLE);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setVisibility(View.INVISIBLE);
                img1.setVisibility(View.VISIBLE);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.VISIBLE);
            }
        });
    }
}