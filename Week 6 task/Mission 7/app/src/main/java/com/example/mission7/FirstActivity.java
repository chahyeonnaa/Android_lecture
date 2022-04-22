package com.example.mission7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);

        Button customButton = findViewById(R.id.costomer);
        Button resultButton = findViewById(R.id.sales);
        Button mdButton = findViewById(R.id.product);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","고객 관리 메뉴 클릭됨!");

                setResult(RESULT_OK, intent);
                finish();
            }
        });

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","매출 관리 메뉴 클릭됨!");
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name","상품 관리 메뉴 클릭됨!");

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
