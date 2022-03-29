package com.thoughtworks.square;

public class Square {

    private final int side;
    public Square(int side) {
        this.side = side;
    }

    public int area() {
        if(side <= 0) return 0;
        return side * side;
    }
}
