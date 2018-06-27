package com.example.sivakami.rebus;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent linktohome=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(linktohome);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
