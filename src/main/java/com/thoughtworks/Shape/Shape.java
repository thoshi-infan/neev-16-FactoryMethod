package com.thoughtworks.Shape;

public class Shape {

    private final int length;
    private final int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Shape createRectangle(int length, int breadth) {
        return new Shape(length, breadth);
    }

    public static Shape createSquare(int side) {
        return new Shape(side, side);
    }

    public int area() {
        return length * breadth;
    }
}
