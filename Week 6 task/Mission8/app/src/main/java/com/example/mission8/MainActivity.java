package com.example.mission8;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.idEditText);
        password = findViewById(R.id.passwordEditText);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast toast =  Toast.makeText(getApplicationContext(),"아이디와 비밀번호를 입력해주세요!",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                    intent.putExtra("id",id.getText().toString());
                    intent.putExtra("password",password.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}