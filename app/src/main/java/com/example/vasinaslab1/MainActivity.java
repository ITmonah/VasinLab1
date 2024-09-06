package com.example.vasinaslab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textGroup = findViewById(R.id.textGroup);
    }

    public void btnClick1(View view) {
        if (textView.getVisibility() == View.VISIBLE) {
            textView.setVisibility(View.INVISIBLE);
            textGroup.setVisibility(View.INVISIBLE);
        } else {
            textView.setVisibility(View.VISIBLE);
            textGroup.setVisibility(View.VISIBLE);
        }
    }
}