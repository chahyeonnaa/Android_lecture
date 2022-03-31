package com.example.a44_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch switch1;
    RadioGroup rGroup1;
    RadioButton version1,version2,version3;
    Button button1,button2;
    ImageView imgandroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView) findViewById(R.id.Text1); // 선택시작?
        text2=(TextView) findViewById(R.id.Text2); // 좋아하는 버전은?
        switch1=(Switch) findViewById(R.id.switch1);
        rGroup1=(RadioGroup) findViewById(R.id.group1);
        version1=(RadioButton) findViewById(R.id.version1);
        version2=(RadioButton) findViewById(R.id.version2);
        version3=(RadioButton) findViewById(R.id.version3);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        imgandroid=(ImageView) findViewById(R.id.image);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()==true)
                {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgandroid.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgandroid.setVisibility(View.INVISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                }
            }
        });
        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.version1)
                {
                    imgandroid.setImageResource(R.drawable.ten);
                }
                else if(i==R.id.version2)
                {
                    imgandroid.setImageResource(R.drawable.eleven);
                }
                else if(i==R.id.version3)
                {
                    imgandroid.setImageResource(R.drawable.twelve);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() { // 종료 버튼 클릭 시 프로그램 종료
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // 처음으로 버튼 클릭 시, 현재 세팅 초기화
            @Override
            public void onClick(View view) {
                switch1.setChecked(false);
                version1.setChecked(false);
                version2.setChecked(false);
                version3.setChecked(false);
                imgandroid.setImageResource(0);
            }
        });
    }
}