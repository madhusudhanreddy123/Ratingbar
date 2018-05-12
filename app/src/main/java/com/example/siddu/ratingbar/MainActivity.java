package com.example.siddu.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar =(RatingnBar)findVewById(R.id.ratingBar);
        txtstatus (textView)=(textView) findViewById(R.id.txtstatus);
    }

