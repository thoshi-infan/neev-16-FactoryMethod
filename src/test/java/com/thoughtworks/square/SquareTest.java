package com.thoughtworks.square;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class SquareTest {

    @Test
    public void shouldReturnAreaWhenSideIsGiven(){

        Square square = new Square(2);

        int result = square.area();

        assertThat(result, is(4));
    }


    @Test
    public void shouldReturnAreaIsZeroWhenSideIsGivenAsZero(){

        Square square = new Square(0);

        int result = square.area();

        assertThat(result, is(0));
    }

    @Test
    public void shouldReturnAreaAsZeroWhenSideIsGivenAsNegative(){

        Square square = new Square(-5);

        int result = square.area();

        assertThat(result, is(0));
    }





}
