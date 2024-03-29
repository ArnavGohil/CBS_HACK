package com.example.cbshack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView pis = findViewById(R.id.pist);
        ImageView dr = findViewById(R.id.drop);
        pis.startAnimation(AnimationUtils.loadAnimation(this, R.anim.piston));
        dr.startAnimation(AnimationUtils.loadAnimation(this, R.anim.drop));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this , CameraActivity.class));
            }
        },1000);
    }
}
