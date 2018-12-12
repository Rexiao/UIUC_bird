package com.example.xr.flappy_hotdog;

public class Bird {

    private int birdX, birdY, currentFrame, velocity;
    public static int maxFrame;

    public Bird() {
        birdX = AppConstants.SCREEN_WIDTH / 2 - AppConstants.getBitmapBank().getBirdWidth() / 2;
        birdY = AppConstants.SCREEN_HEIGHT / 2 - AppConstants.getBitmapBank().getBirdHeight() / 2;
        currentFrame = 0;
        maxFrame = 1;
        velocity = 0;
    }

    //get velocity

    public int getVelocity() {
        return velocity;
    }

    //set velocity

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    //get current frame
    public int getCurrentFrame() {
        return currentFrame;
    }

    //set current frame
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    //get birdX
    public int getBirdX() {
        return birdX;
    }

    //get birdY
    public int getBirdY() {
        return birdY;
    }

    //set birdX
    public void setBirdX(int birdX) {
        this.birdX = birdX;
    }

    //set birdY
    public void setBirdY(int birdY) {
        this.birdY = birdY;
    }
}
