package com.example.practice10_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnResult;
    ImageView image[] = new ImageView[9];
    Integer imageId[] = {R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6, R.id.img7, R.id.img8, R.id.img9};
    String imgName[] = {"독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르앙", "잠자는 소녀", "테라스의 두 자매" , "피아노 레슨", "피아노 앞의 소녀들", "해변에서"};
    int voteCount[] = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("명화 선호도 투표");
        for(int i = 0; i<image.length; i++)
            image[i] = findViewById(imageId[i]);
        for(int i = 0; i<9; i++)
            voteCount[i] = 0;
        btnResult = (Button) findViewById(R.id.btnResult);

        for(int i = 0; i<imageId.length; i++)
        {
            final int index; // 반드시 있어야 한다.
            index = i;
            image[index] = (ImageView) findViewById(imageId[index]); image[index].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                voteCount[index]++;
                Toast.makeText(getApplicationContext(),
                        imgName[index] + ": 총" +voteCount[index] + "표", Toast.LENGTH_SHORT).show();
            }
        });
        }

        btnResult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("VoteCount", voteCount);
                intent.putExtra("ImageName",imgName);
                startActivity(intent);
            }
        });
    }
}