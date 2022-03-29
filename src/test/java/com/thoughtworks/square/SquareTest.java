package com.thoughtworks.square;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class SquareTest {

    @Test
    public void shouldReturnAreaWhenSideIsGiven(){

        Square square = new Square(2);

        double result = square.area();

        assertThat(result, closeTo(4, 0.1));
    }


    @Test
    public void shouldReturnAreaIsZeroWhenSideIsGivenAsZero(){

        Square square = new Square(0);

        double result = square.area();

        assertThat(result, closeTo(0, 0.1));
    }

    @Test
    public void shouldReturnAreaAsZeroWhenSideIsGivenAsNegative(){

        Square square = new Square(-5);

        double result = square.area();

        assertThat(result, closeTo(0, 0.1));

    }

    @Test
    public void shouldReturnAreaWhenSideIsGivenAsDecimal(){

        Square square = new Square(5.5);

        double result = square.area();

        assertThat(result, closeTo(30.25, 0.1));
    }





}
