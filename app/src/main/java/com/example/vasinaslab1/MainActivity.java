package com.example.vasinaslab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textGroup;
    private ImageView imageCenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textGroup = findViewById(R.id.textGroup);
        imageCenter = findViewById(R.id.imageCenter);
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

    public void btnChangePic(View view) {
        if (imageCenter.getVisibility() == View.VISIBLE) {
            imageCenter.setVisibility(View.INVISIBLE);
        } else {
            imageCenter.setVisibility(View.VISIBLE);
        }
    }
}