package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThridActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        button = findViewById(R.id.thirdButtonId);

    }

    public void messageOnClick(View view){

        if (view.getId()==R.id.thirdButtonId){
            Toast.makeText(ThridActivity.this, "Hi Third Activity .... ", Toast.LENGTH_SHORT).show();
        }



    }


}