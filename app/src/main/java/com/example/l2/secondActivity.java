package com.example.l2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         Intent i=getIntent();
         String s=i.getStringExtra("PersonName");
        TextView tv= findViewById(R.id.msg);
        tv.setText("Hello "+s+" !");

    }
}