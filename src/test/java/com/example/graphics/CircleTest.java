package com.example.graphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle circle = new Circle(4);
    @Test
    void computeCirumference() {
        assertEquals(circle.computeCirumference(),8*Math.PI,0.01);
    }

    @Test
    void computeArea() {
        assertEquals(circle.computeArea(),32*Math.PI,0.01);
    }
}