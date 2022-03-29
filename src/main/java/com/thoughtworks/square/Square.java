package com.thoughtworks.square;

public class Square {

    private final double side;
    public Square(double side) {
        this.side = side;
    }

    public double area() {
        if(side <= 0) return 0;
        return side * side;
    }
}
