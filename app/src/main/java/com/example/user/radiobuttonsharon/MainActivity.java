package com.example.user.radiobuttonsharon;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton red;
RadioButton green;
RadioButton blue;
LinearLayout screen;
RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        red= (RadioButton) findViewById(R.id.red);
        green= (RadioButton) findViewById(R.id.green);
        blue= (RadioButton) findViewById(R.id.blue);
        screen= (LinearLayout) findViewById(R.id.screen);
        rg= (RadioGroup) findViewById(R.id.rg);
    }
    public void Changebackground (View view){
        if (red.isChecked()) {
            screen.setBackgroundColor(Color.RED);
        }
        if (green.isChecked()) {
            screen.setBackgroundColor(Color.GREEN);
        }
        if (blue.isChecked()) {
            screen.setBackgroundColor(Color.BLUE);
        }
        else{
            Toast.makeText(this, "Button wasn't pressed", Toast.LENGTH_SHORT).show();
        }

    }
    public void setBackgroundColor (View view){
        rg.clearCheck();
        screen.setBackgroundColor(Color.WHITE);

    }

}
