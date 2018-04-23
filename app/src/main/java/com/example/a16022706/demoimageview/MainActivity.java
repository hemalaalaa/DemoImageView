package com.example.a16022706.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay;
    ImageView ivDay2;
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDay = (ImageView) findViewById(R.id.imageView);

        ivDay.setImageResource(R.drawable.day1);

        ivDay2 = (ImageView) findViewById(R.id.imageView2);

        ivDay2.setImageResource(R.drawable.day2);

        ivDay3 = (ImageView) findViewById(R.id.imageView3);

        ivDay3.setImageResource(R.drawable.day3);

        ivDay4 = (ImageView) findViewById(R.id.imageView4);

        ivDay4.setImageResource(R.drawable.day4);

        ivDay5 = (ImageView) findViewById(R.id.imageView5);

        ivDay5.setImageResource(R.drawable.day5);




    }
}
