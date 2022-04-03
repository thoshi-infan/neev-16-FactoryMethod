package com.thoughtworks.Shape;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.Shape.Shape.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ShapeTest {

    @Test
    void should_return_area_of_rectangle_when_length_and_breadth_is_given() {

        Shape rectangle = createRectangle(4, 3);

        int area = rectangle.area();

        assertThat(area, is(12));
    }

    @Test
    void should_return_area_of_square_when_side_is_given() {

        Shape square = createSquare(4);

        int area = square.area();

        assertThat(area, is(16));
    }
}
