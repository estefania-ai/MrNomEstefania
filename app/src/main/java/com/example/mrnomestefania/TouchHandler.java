package com.example.mrnomestefania;

import android.view.View;

import java.util.List;

/**
 * Created by elopez87 on 5/4/17.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
