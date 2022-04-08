package com.example.practice5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout= new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,150,0));
        setContentView(baseLayout,params);

        Button btn=new Button(this); // 버튼 변수 생성
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn); // 버튼을 레이아웃에 출력

        text=new TextView(this);
        text.setText("2020039009 차현아");
        text.setTextSize(20);
        text.setTextColor(Color.BLACK);
        baseLayout.addView(text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"코드로 생성한 버튼입니다.",Toast.LENGTH_LONG).show();
            }
        });
    }
}