package com.example.PolaFigur;

import com.example.PolaFigur.Rectangle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RectangleTest {

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double width = rectangle.getWidth();
        Assertions.assertEquals(5.0,width);
    }

    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double height = rectangle.getHeight();
        Assertions.assertEquals(3.0,height);
    }

    @Test
    public void testCalculateArea(){
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        double calculateArea = rectangle.calculateArea();
        Assertions.assertEquals(15.0,calculateArea);
    }


}
