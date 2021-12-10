package com.example.graphics;

abstract class Shape {
    double x;
    double y;

    public Shape(){

    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double computeArea();

    public abstract double computeCirumference();


}
