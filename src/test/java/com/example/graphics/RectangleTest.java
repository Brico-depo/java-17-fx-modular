package com.example.graphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(4,2,6,7);
    @Test
    void computeArea() {
        assertEquals(rectangle.computeArea(), 8,0.01);
    }

    @Test
    void computeCirumference() {
        assertEquals(rectangle.computeCirumference(), 12,0.01);

    }
}