package com.example.rikawidyakartika.iqro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iqro3eActivity extends AppCompatActivity {
    private ImageView btn1;
    private ImageView btn2;
    private MediaPlayer player;
    private ImageView ic76,ic77,ic78,ic79,ic80,ic81,ic82,ic83,ic84,ic85,ic86,ic87,ic88,ic89,ic90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqro3e);
        btn1 = (ImageView)findViewById(R.id.back);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro3eActivity.this, Iqro3dActivity.class);
                startActivity(intent);
            }
        });
        btn2 = (ImageView)findViewById(R.id.home);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Iqro3eActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ic76 = (ImageView) this.findViewById(R.id.ic76);
        ic76.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);

            }
        });
        ic77 = (ImageView) this.findViewById(R.id.ic77);
        ic77.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });
        ic78  = (ImageView) this.findViewById(R.id.ic78 );
        ic78 .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });
        ic79 = (ImageView) this.findViewById(R.id.ic79);
        ic79.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);
            }
        });
        ic80  = (ImageView) this.findViewById(R.id.ic80 );
        ic80.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        ic81 = (ImageView) this.findViewById(R.id.ic81);
        ic81.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });
        ic82 = (ImageView) this.findViewById(R.id.ic82);
        ic82.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);
            }
        });
        ic83 = (ImageView) this.findViewById(R.id.ic83 );
        ic83.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);
            }
        });
        ic84  = (ImageView) this.findViewById(R.id.ic84 );
        ic84.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);
            }
        });
        ic85 = (ImageView) this.findViewById(R.id.ic85);
        ic85.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);
            }
        });
        ic86 = (ImageView) this.findViewById(R.id.ic86);
        ic86.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(11);
            }
        });
        ic87 = (ImageView) this.findViewById(R.id.ic87);
        ic87.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(12);
            }
        });
        ic88 = (ImageView) this.findViewById(R.id.ic88);
        ic88.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(13);
            }
        });
        ic89 = (ImageView) this.findViewById(R.id.ic89);
        ic89.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(14);
            }
        });
        ic90 = (ImageView) this.findViewById(R.id.ic90);
        ic90.setOnClickListener(new View.OnClickListener() {

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
            player = MediaPlayer.create(this, R.raw.ic76);

        }else if (arg == 2){
//            Toast.makeText(this, isPlaying+" Frogs", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic77);
        }else if (arg == 3){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic78);
        }else if (arg == 4){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic79);
        }else if (arg == 5){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic96);
        }else if (arg == 6){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic81);
        }else if (arg == 7){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic82);
        }else if (arg == 8){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic83);
        }else if (arg == 9){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic84);
        }else if (arg == 10){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic85);
        }else if (arg == 11){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic86);
        }else if (arg == 12){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic87);
        }else if (arg == 13){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic88);
        }else if (arg == 14){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic89);
        }else if (arg == 15){
//            Toast.makeText(this, isPlaying+" Cat", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ic90);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}