package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton =(Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText= (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText= (EditText) findViewById(R.id.secondNumEditText);
                TextView  textView=(TextView) findViewById(R.id.textView);

                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result= num1+num2;
                textView.setText(result+ " ");
            }
        });


    }
}
