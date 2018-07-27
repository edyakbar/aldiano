package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
    private ImageView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        a1 = (ImageView)findViewById(R.id.nunmati);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainNunmatiActivity.class);
                startActivity(i);
            }
        });
        a2 = (ImageView)findViewById(R.id.mimmati);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Main4Activity.this, MainMimmatiActivity.class);
                startActivity(i);
            }
        });
        a3 = (ImageView)findViewById(R.id.idgom);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainIdgomActivity.class);
                startActivity(i);
            }
        });
        a4 = (ImageView)findViewById(R.id.mad);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainMadActivity.class);
                startActivity(i);
            }
        });
        a5 = (ImageView)findViewById(R.id.ra);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainRaActivity.class);
                startActivity(i);
            }
        });
        a6 = (ImageView)findViewById(R.id.lam);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainLamActivity.class);
                startActivity(i);
            }
        });
        a7 = (ImageView)findViewById(R.id.tasdid);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainTasdidActivity.class);
                startActivity(i);
            }
        });
        a8 = (ImageView)findViewById(R.id.qolqolah);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainQolqolahActivity.class);
                startActivity(i);
            }
        });
        a9 = (ImageView)findViewById(R.id.waqaf);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainWakafActivity.class);
                startActivity(i);
            }
        });
        a10 = (ImageView)findViewById(R.id.khusus);
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main4Activity.this, MainKhususActivity.class);
                startActivity(i);
            }
        });
    }
}
