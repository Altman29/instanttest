package com.altman29.banjarabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textView = (TextView) findViewById(R.id.text_details);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

    }
}
