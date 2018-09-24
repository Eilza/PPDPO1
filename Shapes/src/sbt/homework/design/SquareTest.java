package sbt.homework.design;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void shouldReturnOneWhenRadiusIsOne() {
        Shape square = new Square(1);
        assertEquals(square.getArea(), 1);

    }
}