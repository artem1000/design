package designpatterns.gof.structural.flyweight;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Client extends JFrame {
    private static final long serialVersionUID = -134098474789983992L;
    private static final Random RANDOM = new Random();
    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeFactory.ShapeType[] shapes = {ShapeFactory.ShapeType.Line, ShapeFactory.ShapeType.OVAL_NOFIILL, ShapeFactory.ShapeType.OVAL_NOFIILL};
    private static final Color[] colors = {Color.GREEN, Color.RED, Color.BLACK, Color.BLUE, Color.CYAN};

    public Client(int WIDTH, int HEIGHT) throws HeadlessException {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        Container container = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        container.add(panel, BorderLayout.CENTER);
        container.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 100; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), gerRandomHeight(), getRandomColor());

                }
            }
        });
    }

    private Color getRandomColor() {
        return colors[ThreadLocalRandom.current().nextInt(0, colors.length)];
    }

    private int gerRandomHeight() {
        return (int)(HEIGHT/10 * Math.random());
    }

    private int getRandomWidth() {
        return (int)(WIDTH/10 * Math.random());
    }

    private int getRandomY() {
        return (int)(HEIGHT * Math.random());
    }

    private int getRandomX() {
        return (int)(WIDTH * Math.random());
    }

    private ShapeFactory.ShapeType getRandomShape(){
        return shapes[ThreadLocalRandom.current().nextInt(0, shapes.length)];
    }

    public static void main(String[] args) {
        Client drawing = new Client(500, 600);
    }

}
