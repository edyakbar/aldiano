package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private ImageView btn4;
    private ImageView btn5;
    private ImageView btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = (ImageView)findViewById(R.id.fathah);
        btn2 = (ImageView)findViewById(R.id.ft);
        btn3 = (ImageView)findViewById(R.id.kasroh);
        btn4 = (ImageView)findViewById(R.id.kt);
        btn5 = (ImageView)findViewById(R.id.domah);
        btn6 = (ImageView)findViewById(R.id.dt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, FathahActivity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, FtActivity.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, KasrohActivity.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, KtActivity.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DomahActivity.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DtActivity.class);
                startActivity(i);
            }
        });

    }
}
