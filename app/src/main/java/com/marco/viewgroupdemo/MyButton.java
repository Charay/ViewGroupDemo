package com.marco.viewgroupdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * @author Charay
 * @data 2017/10/31
 */

public class MyButton extends Button {
    private static final String TAG = MyButton.class.getSimpleName();

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"--MyButton--dispatchTouchEvent---ACTION_DOWN---");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"--MyButton--dispatchTouchEvent---ACTION_MOVE---");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"--MyButton--dispatchTouchEvent---ACTION_UP---");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"--MyButton--onTouchEvent---ACTION_DOWN---");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"--MyButton--onTouchEvent---ACTION_MOVE---");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"--MyButton--onTouchEvent---ACTION_UP---");
                break;
        }
        return  super.onTouchEvent(event);
    }


}
