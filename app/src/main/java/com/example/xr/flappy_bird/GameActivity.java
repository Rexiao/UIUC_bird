package com.example.xr.flappy_bird;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class GameActivity extends Activity {

    GameView gameView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppConstants.gameActivityContext = this;
        gameView = new GameView(this);
        setContentView(gameView);
    }
}
