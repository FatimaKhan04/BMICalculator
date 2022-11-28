package com.example.bmicalculator;

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

        TextView result;
        EditText edheight,edweight;
        Button submit;

        result=findViewById(R.id.result);
        edheight=findViewById(R.id.edheight);
        edweight=findViewById(R.id.edweight);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int height=Integer.parseInt(String.valueOf(edheight.getText()));
                int weight=Integer.parseInt(String.valueOf(edweight.getText()));
                float meter= (float) (height/3.281);
                float BMI= (weight/(meter*meter));
                if (BMI>25){
                    result.setText("You are overwight");
                }
                else if(BMI<18){
                    result.setText("You are underweight");
                }
                else{
                    result.setText("You are healthy");
                }
            }
        });
    }
}