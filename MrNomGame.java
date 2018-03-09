package com.example.mrnomestefania;

/**
 * Created by elopez87 on 5/4/17.
 */
public class MrNomGame extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}
