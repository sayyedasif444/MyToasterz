package com.example.mytoasterz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mytoasterzlibrary.Toasterzz;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toasterzz.simpleToasterzz(this, "Test Message");
    }
}