package sbt.homework.design;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class RectangleTest {
    @Test
    public void shouldShowOneIfAllIsOne() {
        Shape rectanqle = new Rectangle(1,1);
        assertEquals(rectanqle.getArea(), 1.0);
    }
}