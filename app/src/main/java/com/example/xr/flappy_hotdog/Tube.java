package com.example.xr.flappy_hotdog;

import java.util.Random;

public class Tube {
    private int tubeX, topTubeOffsetY; // x-coordinate of tube and bottom position of top tube
    private Random random;
    public Tube(int tubeX, int topTubeOffsetY) {
        this.tubeX = tubeX;
        this.topTubeOffsetY = topTubeOffsetY;
        random = new Random();
    }

    //get top tube offset Y
    public int getTopTubeOffsetY() {
        return topTubeOffsetY;
    }

    //get tube x
    public int getTubeX() {
        return tubeX;
    }

    public int getTopTubeY() {
        return topTubeOffsetY - AppConstants.getBitmapBank().getTubeHeight();
    }

    public int getBottomTubeY() {
        return topTubeOffsetY + AppConstants.gap_between_tubes;
    }

    public void setTubeX(int tubeX) {
        this.tubeX = tubeX;
    }

    public void setTopTubeOffsetY(int topTubeOffsetY) {
        this.topTubeOffsetY = topTubeOffsetY;
    }
}
