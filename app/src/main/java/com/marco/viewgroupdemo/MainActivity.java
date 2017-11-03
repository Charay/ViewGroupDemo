package com.marco.viewgroupdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MyLinearLayout mMyLinearLayout;
    private MyButton mMyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyLinearLayout = (MyLinearLayout) findViewById(R.id.my_linearlayout);
        mMyButton = (MyButton) findViewById(R.id.my_button);

        mMyLinearLayout.requestDisallowInterceptTouchEvent(true);
        mMyLinearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--MyLinearLayout--onTouch---ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG,"--MyLinearLayout--onTouch---ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--MyLinearLayout--onTouch---ACTION_UP");
                        break;
                }


                return false;
            }
        });
        mMyButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG,"--mMyButton--onTouch---ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG,"--mMyButton--onTouch---ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG,"--mMyButton--onTouch---ACTION_UP");
                        break;
                }
                return false;
            }
        });


    }
}
