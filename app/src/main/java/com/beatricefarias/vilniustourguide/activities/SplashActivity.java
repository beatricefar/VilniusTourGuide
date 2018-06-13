package com.beatricefarias.vilniustourguide.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.beatricefarias.vilniustourguide.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loadMainActivity = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(loadMainActivity);
                finish();
            }
        }, 1500);

    }
}
