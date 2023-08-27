package designpatterns.gof.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
    void draw(Graphics line, int x, int y, int width, int height, Color color);
}
