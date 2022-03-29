package com.thoughtworks.square;

public class Square {

    private final double side;
    private final int perimeterValue;

    {
        perimeterValue = 4;
    }

    public Square(double side) {

        this.side = side;
    }

    public double area() {

        if( side <= 0 )
            return 0;
        return side * side;
    }

    public double perimeter() {

        if( side <= 0 )
            return 0;
        return  perimeterValue * side;
    }

}
