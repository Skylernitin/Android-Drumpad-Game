package com.example.simpledrumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = soundPool.load(getApplicationContext(),R.raw.playsound1,1);
        sound2 = soundPool.load(getApplicationContext(),R.raw.playsound2,1);
        sound3 = soundPool.load(getApplicationContext(),R.raw.playsound3,1);
        sound4 = soundPool.load(getApplicationContext(),R.raw.playsound4,1);
        sound5 = soundPool.load(getApplicationContext(),R.raw.playsound5,1);
        sound6 = soundPool.load(getApplicationContext(),R.raw.playsound6,1);
        sound7 = soundPool.load(getApplicationContext(),R.raw.playsound7,1);
        sound8 = soundPool.load(getApplicationContext(),R.raw.playsound8,1);
        sound9 = soundPool.load(getApplicationContext(),R.raw.playsound9,1);
    }
    public void playsound1(View view){
        soundPool.play(sound1, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound2(View view){
        soundPool.play(sound2, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound3(View view){
        soundPool.play(sound3, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound4(View view){
        soundPool.play(sound4, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound5(View view){
        soundPool.play(sound5, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound6(View view){
        soundPool.play(sound6, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound7(View view){
        soundPool.play(sound7, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound8(View view){
        soundPool.play(sound8, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsound9(View view){
        soundPool.play(sound9, 1.0f, 1.0f, 0, 0, 10f);
    }
}