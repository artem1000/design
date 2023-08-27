package designpatterns.gof.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape{
    private boolean fill;               //intrinsic property

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.printf("Creating Oval object with fill=%s%n", fill);
        //adding time delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
