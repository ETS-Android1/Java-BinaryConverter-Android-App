package com.ayaanle.binaryconverter_2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    int event;
    //instance labaad ayaad samaysay oo ka caawin doonta inad
    String ku_dar;
    //Button ka caawinaya inad dhalan-rogto qoralka una badashid binary iyo wixi la hal-maala
    Button rogid;
    Button decoder;
    EditText natiijo;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        input = findViewById(R.id.input);
        natiijo = findViewById(R.id.output);
        rogid = findViewById(R.id.submit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Binary");
        rogid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String qoral = input.getText().toString();
                String binary = ASCII2Binary.to_Binary(qoral);
                natiijo.setText(binary);


            }
        });



    }
}