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
        btText = (Button) findViewById(R.id.buttonText);
        btText.setOnClickListener(btTextClick());
        btColorBack = (Button) findViewById(R.id.buttonBack);
        btColorBack.setOnClickListener(btColorBackClick());
    }

    RandomString getRandomString(){
        int n = (int) (Math.random()*randomStrings.length);
        return randomStrings[n];
    }

    int getRandomColor(){
        int a = (int) (Math.random()*256);
        int r = (int) (Math.random()*256);
        int g = (int) (Math.random()*256);
        int b = (int) (Math.random()*256);
        return Color.argb(a,r,g,b);
    }

    View.OnClickListener btTextClick(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RandomString rs = getRandomString();
                tw.setText(rs.getText());
                tw.setTextSize(rs.getSize());
                tw.setMaxWidth(800);
                btColorBack.setEnabled(true);
                btText.setEnabled(false);
            }
        };
    }

    View.OnClickListener btColorBackClick(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tw.setTextColor(getRandomColor());
                constraintLayout.setBackgroundColor(getRandomColor());
                clickCount++;
                if (clickCount == 5){
                    btText.setEnabled(true);
                    clickCount = 0;
                }
            }
        };
    }


}
