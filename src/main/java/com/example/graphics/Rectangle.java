package com.example.graphics;

public class Rectangle extends Shape{

    double width;
    double height;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle (double x, double y, double width, double height){
        super(4.0,2.0);

        this.width = width;
        this.height = height;

    }

    @Override
    public double computeArea() {
        return (this.width*this.height);
    }

    @Override
    public double computeCirumference() {
        return (2*this.width+2*this.height);
    }
}
