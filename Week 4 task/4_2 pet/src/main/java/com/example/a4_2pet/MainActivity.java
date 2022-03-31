package com.example.a4_2pet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton Dog,Cat,Rabbit;
    Button btnOk;
    ImageView imgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=(TextView) findViewById(R.id.Text1); // 선택 시작
        text2=(TextView) findViewById(R.id.Text2); // 좋아하는 애완동물은?

        chkAgree=(CheckBox) findViewById(R.id.ChkAgree); // 선택 시작 체크박스
        rGroup1=(RadioGroup) findViewById(R.id.RGroup1);
        Dog=(RadioButton) findViewById(R.id.RdoDog);
        Cat=(RadioButton) findViewById(R.id.RdoCat);
        Rabbit=(RadioButton) findViewById(R.id.RdoRabbit);
        btnOk=(Button) findViewById(R.id.BtnOk); // 선택 완료 버튼
        imgPet=(ImageView) findViewById(R.id.Imgpet);

        text1.setTextColor(Color.BLACK);
        text1.setTextSize(20);
        text2.setTextColor(Color.BLACK);
        text2.setTextSize(20);

        chkAgree.setTextSize(15);
        Dog.setTextSize(15);
        Cat.setTextSize(15);
        Rabbit.setTextSize(15);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked()==true) // 체크박스가 체크되면
                {
                    text2.setVisibility(View.VISIBLE); // 좋아하는 애완동물은?
                    rGroup1.setVisibility(View.VISIBLE); // 그룹에 속한 버튼보이게하기
                    btnOk.setVisibility(View.VISIBLE); // 선택완료 버튼
                    imgPet.setVisibility(View.VISIBLE); // 이미지
                }
                else
                {
                    text2.setVisibility(View.INVISIBLE); // 좋아하는 애완동물은?
                    rGroup1.setVisibility(View.INVISIBLE); // 그룹에 속한 버튼보이게하기
                    btnOk.setVisibility(View.INVISIBLE); // 선택완료 버튼
                    imgPet.setVisibility(View.INVISIBLE); // 이미지
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}