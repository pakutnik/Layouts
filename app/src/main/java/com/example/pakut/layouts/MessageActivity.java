package com.example.pakut.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        TextView textView = findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().getString("message"));
    }
}
