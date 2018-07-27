package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainRaActivity extends AppCompatActivity {
    private ImageView a1,a2,a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ra);
        a1 = (ImageView)findViewById(R.id.ra1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainRaActivity.this, MainRa1Activity.class);
                startActivity(i);
            }
        });
        a2 = (ImageView)findViewById(R.id.ra2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainRaActivity.this, MainRa2Activity.class);
                startActivity(i);
            }
        });
        a3 = (ImageView)findViewById(R.id.ra3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainRaActivity.this, MainRa3Activity.class);
                startActivity(i);
            }
        });
    }
}
