package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainLamActivity extends AppCompatActivity {
    private ImageView a1,a2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lam);
        a1 = (ImageView)findViewById(R.id.lam1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainLamActivity.this, MainLam1Activity.class);
                startActivity(i);
            }
        });
        a2 = (ImageView)findViewById(R.id.lam2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainLamActivity.this, MainLam2Activity.class);
                startActivity(i);
            }
        });
    }
}
