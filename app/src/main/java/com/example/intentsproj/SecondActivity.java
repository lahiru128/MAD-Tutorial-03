package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String num1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        String num2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);

        TextView textView11 = findViewById(R.id.textView11);
        TextView textView12 = findViewById(R.id.textView12);
        textView11.setText(num1);
        textView12.setText(num2);
    }
}
