package com.example.hellotoasttablet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount =(TextView)findViewById(R.id.btnCount);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,"Hello Toast!",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        ++count;
        if (showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }
}
