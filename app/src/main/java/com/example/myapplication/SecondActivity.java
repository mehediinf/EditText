package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        button = findViewById(R.id.secondButtonId);
        textView = findViewById(R.id.textViewId);


        Handler handler = new Handler();

        button.setOnClickListener(handler);




    }
    class Handler implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            if (view.getId()==R.id.secondButtonId) {
                textView.setText("Login Button is Click...");
            }

        }
    }
}

