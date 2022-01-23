package com.example.imageview_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test=(ImageView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "제롱동이 제롱부리는중", Toast.LENGTH_SHORT).show();

                //getApplicationContext(): 본인(MainActivity의 context를 의미합니다.)
                //여기서 질문 왜 this를 쓰면 안될까? 알아보자!!!
            }
       });

    }
}