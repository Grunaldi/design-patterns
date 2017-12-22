package com.github.xenteros.designpatterns.facade;

import com.github.xenteros.designpatterns.facade.shapes.ShapeFacade;
import org.junit.Assert;
import org.junit.Test;

public class ShapeFacadeTest {

    @Test
    public void shouldReturnCircle() {
        ShapeFacade shapeFacade = new ShapeFacade();
        Assert.assertEquals("Circle draw", shapeFacade.drawCircle());
    }

    @Test
    public void shouldReturnRectangle() {
        ShapeFacade shapeFacade = new ShapeFacade();
        Assert.assertEquals("Rectangle draw", shapeFacade.drawRectangle());
    }

    @Test
    public void shouldReturnTriangle() {
        ShapeFacade shapeFacade = new ShapeFacade();
        Assert.assertEquals("Triangle draw", shapeFacade.drawCircle());
    }
}
