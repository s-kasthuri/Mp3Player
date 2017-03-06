package com.bignerdranch.android.mp3player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;/*time set for the splash screen*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable()
        {
           @Override
            public void run()
           {
               Intent i = new Intent(SplashScreen.this,Mp3_Player.class);
               startActivity(i);

               finish();
           }
        },SPLASH_TIME_OUT);
    }
}
