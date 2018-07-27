package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro3dActivity extends AppCompatActivity {
    private ImageView btn1;
    private ImageView btn2;
    private ImageView btn3;
    private MediaPlayer player;
    private ImageView ic61,ic62,ic63,ic64,ic65,ic66,ic67,ic68,ic69,ic70,ic71,ic72,ic73,ic74,ic75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro3d);
        btn1 = (ImageView)findViewById(R.id.back);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro3dActivity.this, Iqro3cActivity.class);
                startActivity(intent);
            }
        });
        btn2 = (ImageView)findViewById(R.id.home);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro3dActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn3 = (ImageView)findViewById(R.id.next);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro3dActivity.this, Iqro3eActivity.class);
                startActivity(intent);
            }
        });
        ic61 = (ImageView) this.findViewById(R.id.ic61);
        ic61.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        ic62 = (ImageView) this.findViewById(R.id.ic62);
        ic62.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        ic63  = (ImageView) this.findViewById(R.id.ic63 );
        ic63 .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        ic64 = (ImageView) this.findViewById(R.id.ic64);
        ic64.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);
            }
        });
        ic65  = (ImageView) this.findViewById(R.id.ic65 );
        ic65.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        ic66 = (ImageView) this.findViewById(R.id.ic66);
        ic66.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });
        ic67 = (ImageView) this.findViewById(R.id.ic67);
        ic67.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);
            }
        });
        ic68 = (ImageView) this.findViewById(R.id.ic53 );
        ic68.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);
            }
        });
        ic69  = (ImageView) this.findViewById(R.id.ic69 );
        ic69.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);
            }
        });
        ic70 = (ImageView) this.findViewById(R.id.ic70);
        ic70.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);
            }
        });
        ic71 = (ImageView) this.findViewById(R.id.ic71);
        ic71.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(11);
            }
        });
        ic72 = (ImageView) this.findViewById(R.id.ic72);
        ic72.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(12);
            }
        });
        ic73 = (ImageView) this.findViewById(R.id.ic73);
        ic73.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(13);
            }
        });
        ic74 = (ImageView) this.findViewById(R.id.ic74);
        ic74.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(14);
            }
        });
        ic75 = (ImageView) this.findViewById(R.id.ic75);
        ic75.setOnClickListener(new View.OnClickListener() {

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
            player = MediaPlayer.create(this, R.raw.ic61);

        }else if (arg == 2){
//            Toast.makeText(this, isPlaying+" Frogs", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic62);
        }else if (arg == 3){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic63);
        }else if (arg == 4){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic64);
        }else if (arg == 5){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic65);
        }else if (arg == 6){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic66);
        }else if (arg == 7){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic67);
        }else if (arg == 8){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic68);
        }else if (arg == 9){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic69);
        }else if (arg == 10){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic70);
        }else if (arg == 11){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic71);
        }else if (arg == 12){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic72);
        }else if (arg == 13){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic73);
        }else if (arg == 14){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic74);
        }else if (arg == 15){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic75);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}
