package com.example.bingo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FACE2 extends AppCompatActivity {
MediaPlayer mp;
    Button b1,b3;
    ImageView i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_c_e2);
        b1=(Button) findViewById(R.id.b1);
        i2=(ImageView) findViewById(R.id.i2);
        i1=(ImageView)findViewById(R.id.i1);
        b3=(Button) findViewById(R.id.b3);
        mp=MediaPlayer.create(FACE2.this,R.raw.bog);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j;
                j = new Intent(getApplicationContext(),GAME.class);
                startActivity(j);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab=new AlertDialog.Builder(FACE2.this);
                ab.setMessage("ARE YOU SURE?").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                }).setNegativeButton("NO",null).setCancelable(false);
                AlertDialog al=ab.create();
                ab.show();

            }
        });
     //   MediaPlayer.create(FACE2.this,R.raw.bog);


    }
    public void volume(View v){
        mp.start();
        mp.setLooping(true);
    }
    public void mute(View v){
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.bog);
    }
  /*  @Override
    protected void onPause() {
        super.onPause();
        mp.release();
    }*/


}
