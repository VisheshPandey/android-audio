package com.example.android_audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void playMusic(View view){
            player = MediaPlayer.create(this , R.raw.song); // creating media player to play song which is in Resources -> raw folder
            player.start();
            Toast.makeText(this , "Song is playing" , Toast.LENGTH_SHORT).show();
    }

    public void pauseMusic(View view){
        // pause is possible only when a media is already playing
        if(player != null){
            Toast.makeText(this , "Song has been paused" , Toast.LENGTH_SHORT).show();
        }
    }




}