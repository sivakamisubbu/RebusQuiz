package com.example.sivakami.rebus;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView home;
    Button monowordbtn,phrasesbtn;
    Boolean isPressed=true;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        home=(TextView)findViewById(R.id.textView);
        monowordbtn=(Button)findViewById(R.id.button);
        phrasesbtn=(Button)findViewById(R.id.button2);
        imgbtn=(ImageButton)findViewById(R.id.imageButton);
        //imgbtn.setOnClickListener();

        Typeface font=Typeface.createFromAsset(getAssets(),"fonts/dance.ttf");

        home.setTypeface(font);
        monowordbtn.setTypeface(font);
        phrasesbtn.setTypeface(font);


    }
    public void monoword(View view)
    {
        Intent firstmonoword=new Intent(this,FirstMonoword.class);
        startActivity(firstmonoword);
    }
    public void phrases(View view)
    {
        Intent firstphrase=new Intent(this,FirstPhrase.class);
        startActivity(firstphrase);
    }
    public void musicbutton(View view)
    {
        Intent firstphrase=new Intent(this,FirstPhrase.class);
        startActivity(firstphrase);
    }
}
