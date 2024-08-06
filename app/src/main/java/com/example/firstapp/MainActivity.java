package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView textView;
    private RadioButton b1, b2, b3;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        b1 = findViewById(R.id.radioButton);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        group = findViewById(R.id.btnGroup);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSubmit.setEnabled(true);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSubmit.setEnabled(true);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSubmit.setEnabled(true);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int clickedBtnId = group.getCheckedRadioButtonId();
                textView.setText(String.format("You are %s",group.getChildAt(clickedBtnId).getTag().toString()));
            }
        });


    }
}