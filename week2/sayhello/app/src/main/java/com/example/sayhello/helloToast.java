package com.example.sayhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class helloToast extends AppCompatActivity {
    private TextView mCount;
    private TextView mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);

        Intent inte = getIntent();
        String countValue = inte.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message = "HELLO!";

        mCount = findViewById(R.id.txtViewCountValue);
        mMessage = findViewById(R.id.txtViewMessage);

        mCount.setText(countValue);
        mMessage.setText(message);

    }
}
