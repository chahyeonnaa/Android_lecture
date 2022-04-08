package com.example.practice5_5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnadd,btnsub,btnmul,btndiv;
    TextView textresult;
    Integer result;
    String num1,num2;
    Button[] numButtons=new Button[10];
    Integer[] numBtnIDs={R.id.num0,R.id.num1,R.id.num2,R.id.num3,R.id.num4,R.id.num5,R.id.num6
            ,R.id.num7,R.id.num8,R.id.num9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블 레이아웃 계산기");

        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText) findViewById(R.id.Edit2);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        textresult=(TextView) findViewById(R.id.result);

        btnadd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= edit1.getText().toString();
                num2= edit1.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                textresult.setText("계산 결과: "+result.toString());
                return false;
            }
        });

        btnsub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= edit1.getText().toString();
                num2= edit1.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                textresult.setText("계산 결과: "+result.toString());
                return false;
            }
        });

        btnmul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= edit1.getText().toString();
                num2= edit1.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                textresult.setText("계산 결과: "+result.toString());
                return false;
            }
        });

        btndiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1= edit1.getText().toString();
                num2= edit1.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                textresult.setText("계산 결과: "+result.toString());
                return false;
            }
        });

        for(int i=0;i<numBtnIDs.length;i++)
        {
            numButtons[i]=(Button) findViewById(numBtnIDs[i]);
            numButtons[i].setBackgroundColor(Color.BLACK);
        }

        for(int i=0;i<numBtnIDs.length;i++)
        {
            final int index;
            index=i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(edit1.isFocused()==true) // edit1에 포커스 되어있으면,
                    {
                        num1=edit1.getText().toString()+numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }
                    else if(edit2.isFocused()==true) // edit2에 포커스 되어있으면,
                    {
                        num2=edit2.getText().toString()+numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }
                    else // 입력변수에 포커스를 넣고, 숫자 버튼들을 눌러야함
                    {
                        Toast.makeText(getApplicationContext(),"먼저 에디트 텍스트를 선택하세요",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

    }
}