package com.codeschool.greg.lesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = DetailActivity.this.getIntent();
        String candyName = intent.getStringExtra("candy_name");

        TextView textView = (TextView)this.findViewById(R.id.text_view_name);
        textView.setText(candyName);
    }
}
