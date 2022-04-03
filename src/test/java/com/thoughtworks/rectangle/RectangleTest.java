package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.rectangle.Rectangle.createShape;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RectangleTest {

    @Test
    public void shouldIncreaseAreaWhenLengthAndBreadthIsMade(){

        Rectangle square = createShape(3.14);

        double result = square.area();

        assertThat(result, closeTo(8.38, 0.1));
    }

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven(){

        Rectangle rectangle = createShape(5,10);

        double result = rectangle.area();

        assertThat(result, closeTo(50.0, 0.1));
    }


    @Test
    public void shouldNotReturnAreaWhenLengthAndBreadthIsGivenAsO(){

        Rectangle rectangle = new Rectangle(0.0,0.0);

        double result = rectangle.area();

        assertThat(result, closeTo(0.0, 0.1));

    }

    @Test
    public void shouldIncreasePerimeterWhenLengthAndBreadthIsMade(){

        Rectangle rectangle = new Rectangle(5,10);

        double result = rectangle.perimeter();

        assertThat(result, closeTo(30, 0.1));
    }

    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){

        Rectangle rectangle = new Rectangle(5.0,5.0);

        double result = rectangle.perimeter();

        assertThat(result, closeTo(20.0, 0.1));
    }


    @Test
    public void shouldNotReturnPerimeterWhenLengthAndBreadthIsGivenAsO(){

        Rectangle rectangle = new Rectangle(0.0,0.0);

        double result = rectangle.perimeter();

        assertThat(result, closeTo(0.0, 0.1));
    }
}
