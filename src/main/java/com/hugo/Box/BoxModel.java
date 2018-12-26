package com.hugo.Box;

public class BoxModel {
    public float length;
    public float width;
    public float height;

    public BoxModel(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float inputLength, float inputWidth, float inputHeight) {
        if (inputLength > this.length || inputWidth > this.width || inputHeight > this.height)
            return false;
        else
            return true;
    }


//    public abstract boolean validate(float length, float width, float height);

}
