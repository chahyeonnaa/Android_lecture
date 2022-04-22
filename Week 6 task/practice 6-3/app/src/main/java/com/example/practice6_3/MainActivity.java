package com.example.practice6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;
import android.app.TabActivity;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabdog=tabHost.newTabSpec("dog").setIndicator("강아지");
        tabdog.setContent(R.id.강아지);
        tabHost.addTab(tabdog);

        TabHost.TabSpec tabSpeccat=tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpeccat.setContent(R.id.고양이);
        tabHost.addTab(tabSpeccat);

        TabHost.TabSpec tabSpecrab=tabHost.newTabSpec("rab").setIndicator("토끼");
        tabSpecrab.setContent(R.id.토끼);
        tabHost.addTab(tabSpecrab);

        TabHost.TabSpec tabSpechorse=tabHost.newTabSpec("horse").setIndicator("말");
        tabSpechorse.setContent(R.id.말);
        tabHost.addTab(tabSpechorse);

        tabHost.setCurrentTab(0);
    }

}