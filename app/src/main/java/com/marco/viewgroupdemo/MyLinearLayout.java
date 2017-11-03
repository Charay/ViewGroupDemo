package com.marco.viewgroupdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author Charay
 * @data 2017/10/31
 */

public class MyLinearLayout extends LinearLayout {
    private static final String TAG = MyLinearLayout.class.getSimpleName();

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"--MyLinearLayout--dispatchTouchEvent---ACTION_DOWN---");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"--MyLinearLayout--dispatchTouchEvent---ACTION_MOVE---");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"--MyLinearLayout--dispatchTouchEvent---ACTION_UP---");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"--MyLinearLayout--onInterceptTouchEvent---ACTION_DOWN---");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"--MyLinearLayout--onInterceptTouchEvent---ACTION_MOVE---");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"--MyLinearLayout--onInterceptTouchEvent---ACTION_UP---");
                break;
        }
//        return super.onInterceptTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"--MyLinearLayout--onTouchEvent---ACTION_DOWN---");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"--MyLinearLayout--onTouchEvent---ACTION_MOVE---");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"--MyLinearLayout--onTouchEvent---ACTION_UP---");
                break;
        }
        return  super.onTouchEvent(event);
    }
}
