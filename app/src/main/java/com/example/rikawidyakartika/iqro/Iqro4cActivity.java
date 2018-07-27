package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro4cActivity extends AppCompatActivity {
    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private MediaPlayer player;
    private ImageView id31,id32, id33,id34,id35,id36,id37,id38,id39,id40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro4c);
        btn1 = (ImageView)findViewById(R.id.back);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro4cActivity.this, Iqro4bActivity.class);
                startActivity(intent);
            }
        });
        btn2 = (ImageView)findViewById(R.id.home);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro4cActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn3 = (ImageView)findViewById(R.id.next);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro4cActivity.this, Iqro4dActivity.class);
                startActivity(intent);
            }
        });
        id31 = (ImageView) this.findViewById(R.id.id31);
        id31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        id32 = (ImageView) this.findViewById(R.id.id32);
        id32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        id33  = (ImageView) this.findViewById(R.id.id33 );
        id33 .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        id34 = (ImageView) this.findViewById(R.id.id34);
        id34.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);
            }
        });
        id35  = (ImageView) this.findViewById(R.id.id35 );
        id35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        id36 = (ImageView) this.findViewById(R.id.id36);
        id36.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });
        id37 = (ImageView) this.findViewById(R.id.id37);
        id37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);
            }
        });
        id38 = (ImageView) this.findViewById(R.id.id38 );
        id38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);
            }
        });
        id39  = (ImageView) this.findViewById(R.id.id39 );
        id39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);
            }
        });
        id40 = (ImageView) this.findViewById(R.id.id40);
        id40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);
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
        }else if (arg == 5){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 6){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 7){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 8){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 9){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }else if (arg == 10){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.f3);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

