package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro2Activity extends AppCompatActivity {
    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private MediaPlayer player;
    private ImageView ib1, ib2, ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro2);
        btn1 = (ImageView)findViewById(R.id.back1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iqro2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn2 = (ImageView)findViewById(R.id.home1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iqro2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn3 = (ImageView)findViewById(R.id.next1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iqro2Activity.this,Iqro2aActivity.class);
                startActivity(i);
            }
        });
        ib1 = (ImageView) this.findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        ib2 = (ImageView) this.findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        ib3 = (ImageView) this.findViewById(R.id.ib3);
        ib3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        ib4 = (ImageView) this.findViewById(R.id.ib4);
        ib4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });
        ib5 = (ImageView) this.findViewById(R.id.ib5);
        ib5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        ib6 = (ImageView) this.findViewById(R.id.ib6);
        ib6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);
            }
        });
        ib7 = (ImageView) this.findViewById(R.id.ib7);
        ib7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);
            }
        });
        ib8 = (ImageView) this.findViewById(R.id.ib8);
        ib8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);
            }
        });
        ib9 = (ImageView) this.findViewById(R.id.ib9);
        ib9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);
            }
        });
        ib10 = (ImageView) this.findViewById(R.id.ib10);
        ib10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);
            }
        });
        ib11 = (ImageView) this.findViewById(R.id.ib11);
        ib11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(11);
            }
        });
        ib12 = (ImageView) this.findViewById(R.id.ib12);
        ib12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(12);
            }
        });
        ib13 = (ImageView) this.findViewById(R.id.ib13);
        ib13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(13);
            }
        });
        ib14 = (ImageView) this.findViewById(R.id.ib14);
        ib14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(14);
            }
        });
        ib15 = (ImageView) this.findViewById(R.id.ib15);
        ib15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(15);
            }
        });

    }

    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
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
            player = MediaPlayer.create(this, R.raw.ib1);

        }else if (arg == 2){
//            Toast.makeText(this, isPlaying+" Frogs", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib2);
        }else if (arg == 3){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib3);
        }else if (arg == 4){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib4);
        }else if (arg == 5){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib5);
        }else if (arg == 6){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib6);
        }else if (arg == 7){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib7);
        }else if (arg == 8){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib8);
        }else if (arg == 9){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib9);
        }else if (arg == 10){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib10);
        }else if (arg == 11){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib11);
        }else if (arg == 12){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib12);
        }else if (arg == 13){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib13);
        }else if (arg == 14){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib14);
        }else if (arg == 15){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ib15);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}
