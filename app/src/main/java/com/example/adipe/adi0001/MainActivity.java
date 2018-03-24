package com.example.adipe.adi0001;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout p;
    Button l,j;
    RadioButton r, t, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = (RadioButton) findViewById(R.id.radioButton);
        t = (RadioButton) findViewById(R.id.radioButton2);
        s = (RadioButton) findViewById(R.id.radioButton3);
        l = (Button) findViewById(R.id.button);
        j = (Button) findViewById(R.id.button2);
        p = (LinearLayout) findViewById(R.id.c);
    }

    public void ll(View view) {
        if(r.isChecked()) p.setBackgroundColor(Color.RED);
        if(t.isChecked()) p.setBackgroundColor(Color.GREEN);
        if(s.isChecked()) p.setBackgroundColor(Color.BLUE);
    }

    public void dd(View view) {
        p.setBackgroundColor(Color.WHITE);
    }
}
