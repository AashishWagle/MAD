package com.example.helloToastHomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private TextView land_showCount;
    private Button btnReset;
    private Button btnResetL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.dis_count);
        land_showCount = (TextView) findViewById(R.id.disCount_land);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnResetL = (Button) findViewById(R.id.button);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            if(mCount % 2 == 0){
                btnReset.setBackgroundColor(getResources().getColor(R.color.evenColor));
            }else{
                btnReset.setBackgroundColor(getResources().getColor(R.color.oddColor));
            }
        }
    }

    public void showToastL(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUpL(View view) {
        ++mCount;
        if(land_showCount != null){
            land_showCount.setText(Integer.toString(mCount));
            if(mCount % 2 == 0){
                btnResetL.setBackgroundColor(getResources().getColor(R.color.evenColor));
            }else{
                btnResetL.setBackgroundColor(getResources().getColor(R.color.oddColor));
            }
        }
    }

    public void resetText(View view) {
        if(mShowCount != null){
            mCount = 0;
           mShowCount.setText("0");
            btnReset.setBackgroundColor(getResources().getColor(R.color.evenColor));
        }
    }

    public void resetText_land(View view) {
        if(land_showCount != null){
            mCount = 0;
            land_showCount.setText("0");
            btnResetL.setBackgroundColor(getResources().getColor(R.color.evenColor));
        }
    }
}
