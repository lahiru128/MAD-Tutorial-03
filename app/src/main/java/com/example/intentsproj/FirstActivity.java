package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.intentsproj";
    public static final String EXTRA_MESSAGE1 = "com.example.intentsproj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }


    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText number1 = (EditText) findViewById(R.id.editText3);
        EditText number2 = (EditText) findViewById(R.id.editText4) ;
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,num1);
        intent.putExtra(EXTRA_MESSAGE1,num2);
        startActivity(intent);
    }
}
