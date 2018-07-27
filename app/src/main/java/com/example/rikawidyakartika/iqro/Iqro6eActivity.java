package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro6eActivity extends AppCompatActivity {
    private ImageView b1,b2;
    private MediaPlayer player;
    private ImageView if17,if18,if19,if20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro6e);
        b1 = (ImageView)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro6eActivity.this, Iqro6dActivity.class);
                startActivity(intent);
            }
        });
        b2 = (ImageView)findViewById(R.id.home);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro6eActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        if17 = (ImageView)findViewById(R.id.ie12);
        if17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });
        if18 = (ImageView)findViewById(R.id.ie13);
        if18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        if19 = (ImageView)findViewById(R.id.ie14);
        if19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
        if20 = (ImageView)findViewById(R.id.ie15);
        if20.setOnClickListener(new View.OnClickListener() {
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