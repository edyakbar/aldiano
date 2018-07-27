package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainNunmatiActivity extends AppCompatActivity {
    private ImageView a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nunmati);
        a1 = (ImageView)findViewById(R.id.nunmati1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainNunmatiActivity.this, MainNunmati1Activity.class);
                startActivity(i);
            }
        });
        a2 = (ImageView)findViewById(R.id.nunmati2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainNunmatiActivity.this, MainNunmati2Activity.class);
                startActivity(i);
            }
        });
        a3 = (ImageView)findViewById(R.id.nunmati3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainNunmatiActivity.this, MainNunmati3Activity.class);
                startActivity(i);
            }
        });
        a4 = (ImageView)findViewById(R.id.nunmati4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainNunmatiActivity.this, MainNunmati4Activity.class);
                startActivity(i);
            }
        });
    }
}
