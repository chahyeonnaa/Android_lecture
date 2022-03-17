package com.example.hw2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rGroup1;
    RadioButton apple,android;
    ImageView img;
    Button button1;
    Button button2;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        rGroup1=(RadioGroup) findViewById(R.id.Group1);
        apple=(RadioButton) findViewById(R.id.apple);
        android=(RadioButton) findViewById(R.id.android);
        img=(ImageView) findViewById(R.id.imageicon);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        text=(EditText) findViewById(R.id.Edit1);


        button2.setBackgroundColor(Color.GRAY);
        // 홈페이지 열기
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Edit text 에서 받아오기
                Intent mIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(text.getText().toString()));
                startActivity(mIntent);
            }
        });

        // 글자 나타내기
        button1.setBackgroundColor(Color.GRAY);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 받아와야함
                Toast.makeText(getApplicationContext(),text.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });



        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.apple)
                    img.setImageResource(R.drawable.apple);
                else if(i==R.id.android)
                    img.setImageResource(R.drawable.android);
            }
        });

    }
}