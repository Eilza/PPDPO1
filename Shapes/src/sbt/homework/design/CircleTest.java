package sbt.homework.design;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CircleTest {
    @Test
    public void shouldReturnPiWhenRadiusIsOne() {
        Shape circle = new Circle(1);
        assertEquals(circle.getArea(), Math.PI);
    }
}