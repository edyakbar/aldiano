package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMadActivity extends AppCompatActivity {
    private ImageView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mad);
        a1 = (ImageView)findViewById(R.id.mad1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad1Activity.class);
                startActivity(i);
            }
        });
        a2 = (ImageView)findViewById(R.id.mad2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad2Activity.class);
                startActivity(i);
            }
        });
        a3 = (ImageView)findViewById(R.id.mad3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad3Activity.class);
                startActivity(i);
            }
        });
        a4 = (ImageView)findViewById(R.id.mad4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad4Activity.class);
                startActivity(i);
            }
        });
        a5 = (ImageView)findViewById(R.id.mad5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad5Activity.class);
                startActivity(i);
            }
        });
        a6 = (ImageView)findViewById(R.id.mad6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad6Activity.class);
                startActivity(i);
            }
        });
        a7 = (ImageView)findViewById(R.id.mad7);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad7Activity.class);
                startActivity(i);
            }
        });
        a8 = (ImageView)findViewById(R.id.mad8);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad8Activity.class);
                startActivity(i);
            }
        });
        a9 = (ImageView)findViewById(R.id.mad9);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad9Activity.class);
                startActivity(i);
            }
        });
        a10 = (ImageView)findViewById(R.id.mad10);
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad10Activity.class);
                startActivity(i);
            }
        });
        a11 = (ImageView)findViewById(R.id.mad11);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad11Activity.class);
                startActivity(i);
            }
        });
        a12 = (ImageView)findViewById(R.id.mad12);
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad12Activity.class);
                startActivity(i);
            }
        });
        a13 = (ImageView)findViewById(R.id.mad13);
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad13Activity.class);
                startActivity(i);
            }
        });
        a14 = (ImageView)findViewById(R.id.mad14);
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad14Activity.class);
                startActivity(i);
            }
        });
        a15 = (ImageView)findViewById(R.id.mad15);
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMadActivity.this, MainMad15Activity.class);
                startActivity(i);
            }
        });
    }
}
