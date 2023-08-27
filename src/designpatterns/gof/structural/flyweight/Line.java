package designpatterns.gof.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape{

    public Line() {
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}
