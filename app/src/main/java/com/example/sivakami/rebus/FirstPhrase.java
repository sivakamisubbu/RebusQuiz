package com.example.sivakami.rebus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;

public class FirstPhrase extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13,ed14,ed15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_phrase);

        ed1=(EditText)findViewById(R.id.edt1);
        ed2=(EditText)findViewById(R.id.edt2);
        ed3=(EditText)findViewById(R.id.edt3);
        ed4=(EditText)findViewById(R.id.edt4);
        ed5=(EditText)findViewById(R.id.edt5);
        ed6=(EditText)findViewById(R.id.edt6);
        ed7=(EditText)findViewById(R.id.edt7);
        ed8=(EditText)findViewById(R.id.edt8);
        ed9=(EditText)findViewById(R.id.edt9);
        ed10=(EditText)findViewById(R.id.edt10);
        ed11=(EditText)findViewById(R.id.edt11);
        ed12=(EditText)findViewById(R.id.edt12);
        ed13=(EditText)findViewById(R.id.edt13);
        ed14=(EditText)findViewById(R.id.edt14);
        ed15=(EditText)findViewById(R.id.edt15);

    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();

            inflater.inflate(R.menu.main_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }


}
