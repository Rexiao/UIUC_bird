package com.example.xr.flappy_bird;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class AppConstants {

    static BitmapBank bitmapBank; // Bitmap object reference
    static GameEngine gameEngine; // GameEngine object reference
    static int SCREEN_WIDTH, SCREEN_HEIGHT;
    static int gravity;
    static int velocity_when_jumped;
    static int gap_between_tubes;
    static int numberOfTubes;
    static int tubeVelocity;
    static int minTubeOffsetY;
    static int maxTubeOffsetY;
    static int distanceBetweenTubes;

    public static void initialization(Context context){
        setScreenSize(context);
        bitmapBank = new BitmapBank(context.getResources());
        setGameConstants();
        gameEngine = new GameEngine();
    }

    public static void setGameConstants() {
        AppConstants.gravity = 3;
        AppConstants.velocity_when_jumped = -40;
        AppConstants.gap_between_tubes = 600;
        AppConstants.numberOfTubes = 2;
        AppConstants.tubeVelocity = 12;
        AppConstants.minTubeOffsetY = (int) (AppConstants.gap_between_tubes / 2.0);
        AppConstants.maxTubeOffsetY = AppConstants.SCREEN_HEIGHT - AppConstants.minTubeOffsetY -
                AppConstants.gap_between_tubes;
        AppConstants.distanceBetweenTubes = AppConstants.SCREEN_WIDTH * 3 / 4;
    }

    // Return BitmapBank instance
    public static BitmapBank getBitmapBank(){
        return bitmapBank;
    }

    // Return GameEngine instance
    public static GameEngine getGameEngine(){
        return gameEngine;
    }

    private static void setScreenSize(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        AppConstants.SCREEN_WIDTH = width;
        AppConstants.SCREEN_HEIGHT = height;
    }

}
