package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private ImageView btn4;
    private ImageView btn5;
    private ImageView btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1 = (ImageView)findViewById(R.id.iqro1);
        btn2 = (ImageView)findViewById(R.id.iqro2);
        btn3 = (ImageView)findViewById(R.id.iqro3);
        btn4 = (ImageView)findViewById(R.id.iqro4);
        btn5 = (ImageView)findViewById(R.id.iqro5);
        btn6 = (ImageView)findViewById(R.id.iqro6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro1Activity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro2Activity.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro3Activity.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro4Activity.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro5Activity.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Iqro6Activity.class);
                startActivity(i);
            }
        });
    }
}
