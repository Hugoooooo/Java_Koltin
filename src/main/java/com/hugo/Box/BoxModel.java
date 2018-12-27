package com.hugo.Box;

public class BoxModel {
    float length;
    float width;
    float height;

    public boolean validate(float inputLength, float inputWidth, float inputHeight) {
        if (inputLength > this.length || inputWidth > this.width || inputHeight > this.height)
            return false;
        else
            return true;
    }


//    public abstract boolean validate(float length, float width, float height);

}
