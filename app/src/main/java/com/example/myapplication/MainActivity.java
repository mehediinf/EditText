package com.example.myapplication;

import android.app.SearchManager;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1Id);
        button2 = findViewById(R.id.button2Id);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button1Id){

            Toast.makeText(MainActivity.this,"Hi Button One",Toast.LENGTH_SHORT).show();


        }if (view.getId() == R.id.button2Id){

            Toast.makeText(MainActivity.this,"Hi Button Two",Toast.LENGTH_SHORT).show();


        }


    }
}