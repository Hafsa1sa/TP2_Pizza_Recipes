package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class SplashActivity extends AppCompatActivity {
    private TextView textView6, textView, textView4;
    private ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        this.textView6 = findViewById(R.id.textView6);
        this.textView = findViewById(R.id.textView);
        this.textView4 = findViewById(R.id.textView4);
        this.imageView2=findViewById(R.id.imageView2);
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(11000);
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();


    }
}