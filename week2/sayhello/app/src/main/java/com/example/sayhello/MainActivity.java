package com.example.sayhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mshowCount;
    private int mcount = 0;
    public static final String EXTRA_MESSAGE = "com.example.android.sayhello.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount = findViewById(R.id.txtViewCountValue);
    }

    public void countValue(View view) {
    ++mcount;
    mshowCount.setText(Integer.toString(mcount));
    }

    public void callActivityNew(View view) {
    Intent intent = new Intent(this,helloToast.class);
    if(mshowCount == null){
        mshowCount.setText("0");
    }
    String message = mshowCount.getText().toString();
    intent.putExtra(EXTRA_MESSAGE,message);
    startActivity(intent);
    }
}
