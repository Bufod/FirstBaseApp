package com.example.firstbaseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RandomString[] randomStrings = RandomString.values();
    TextView tw;
    Button btText, btColorBack;
    ConstraintLayout constraintLayout;
    int clickCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (ConstraintLayout) findViewById(R.id.CLayout);
        tw = (TextView) findViewById(R.id.textW);
//        btText = (Button) findViewById(R.id.buttonText);
//        btText.setOnClickListener(btTextClick());
//        btColorBack = (Button) findViewById(R.id.buttonBack);
//        btColorBack.setOnClickListener(btColorBackClick());
    }

    // получить случайную строку


    // получить случайный цвет


    // кнопка генерации текста


    // кнопка генерации цвета

}
