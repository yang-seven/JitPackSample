package com.seven.jitpacksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.seven.jitlibrary.CalUtils;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(CalUtils.add(1,2));
    }
}