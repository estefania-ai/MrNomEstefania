package com.example.mrnomestefania;

/**
 * Created by elopez87 on 5/4/17.
 */
public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public Graphics.PixmapFormat getFormat();

    public void dispose();
}
