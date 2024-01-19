package com.example.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button) findViewById(R.id.btn1);
        Button button2=(Button) findViewById(R.id.btn2);
        Button button3=(Button) findViewById(R.id.btn);
        EditText txt1=(EditText) findViewById(R.id.edit1);
        EditText txt2=(EditText) findViewById(R.id.edit2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt1.getText().toString().isEmpty()||txt2.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Fill all the blocks",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"successfully login!!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}