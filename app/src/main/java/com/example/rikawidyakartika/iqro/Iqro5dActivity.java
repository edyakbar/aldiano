package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro5dActivity extends AppCompatActivity {
    private ImageView b1,b2,b3;
    private MediaPlayer player;
    private ImageView ie22,ie23,ie24,ie25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro5d);
        b1 = (ImageView)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro5dActivity.this,Iqro5cActivity.class);
                startActivity(intent);
            }
        });
        b2 = (ImageView)findViewById(R.id.home);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro5dActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        b3 = (ImageView)findViewById(R.id.next);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro5dActivity.this, Iqro5eActivity.class);
                startActivity(intent);
            }
        });
        ie22 = (ImageView)findViewById(R.id.ie22);
        ie22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });
        ie23 = (ImageView)findViewById(R.id.ie23);
        ie23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        ie24 = (ImageView)findViewById(R.id.ie24);
        ie24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
        ie25 = (ImageView)findViewById(R.id.ie25);
        ie25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(4);
            }
        });
    }
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg) {
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }
        catch(Exception e){
//            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){

//            Toast.makeText(this, isPlaying+" Bird", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f1);
        }else if (arg == 2){
//            Toast.makeText(this, isPlaying+" Frogs", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f2);
        }else if (arg == 3){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 4){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }
        player.setLooping(false); // Set looping
        player.start();

    }
}