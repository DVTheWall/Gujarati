package com.peacocktech.gujarati;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Typeface tf;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tf = (Typeface.createFromAsset(getAssets(), "fonts/lohit_gujarati.ttf"));

        textView =  findViewById(R.id.txt);
        textView.setTypeface(tf);
        textView.setText("ધવલ");
    }
}
