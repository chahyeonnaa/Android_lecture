package com.example.mission8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Button custom;
    Button sales;
    Button mdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        custom = findViewById(R.id.customButton);
        sales = findViewById(R.id.salesButton);
        mdButton = findViewById(R.id.mdButton);


        Intent intent = new Intent();
        intent = getIntent();
        String id = intent.getStringExtra("id");
        String password = intent.getStringExtra("password");

        if(id != null)
        {
            Toast toast =
                    Toast.makeText(getApplicationContext(),"ID : "+id +" Password : "+password +" 으로 로그인!",Toast.LENGTH_LONG);
            toast.show();
        }


        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SalesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MoneyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}