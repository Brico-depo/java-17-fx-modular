package com.example.graphics;

public class Circle extends Shape{
    double radius;

    public Circle (double radius){

        super(4.0,4.0);
        this.radius = radius;


    }

    @Override
    public double computeCirumference() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double computeArea() {
        return 2*Math.PI*Math.pow(this.radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
