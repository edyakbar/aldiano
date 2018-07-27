package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro6dActivity extends AppCompatActivity {
    private ImageView b1,b2,b3;
    private MediaPlayer player;
    private ImageView if13,if14,if15,if16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro6d);
        b1 = (ImageView)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro6dActivity.this, Iqro6cActivity.class);
                startActivity(intent);
            }
        });
        b2 = (ImageView)findViewById(R.id.home);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro6dActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        b3 = (ImageView)findViewById(R.id.next);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro6dActivity.this, Iqro6eActivity.class);
                startActivity(intent);
            }
        });
        if13 = (ImageView)findViewById(R.id.ie12);
        if13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });
        if14 = (ImageView)findViewById(R.id.ie13);
        if14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        if15 = (ImageView)findViewById(R.id.ie14);
        if15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
        if16 = (ImageView)findViewById(R.id.ie15);
        if16.setOnClickListener(new View.OnClickListener() {
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
