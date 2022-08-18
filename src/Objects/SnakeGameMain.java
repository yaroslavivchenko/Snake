package Objects;

import javax.swing.*;
import java.awt.*;

public class SnakeGameMain extends JPanel {
    static JFrame jFrame;
    private static final int SCALE = 30;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    Snake snake = new Snake(5, 5, 5, 6);

    public void SnakeGameMain() {

    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.gray);
        graphics.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);

        for (int x = 0; x < WIDTH * SCALE; x += SCALE) {
            graphics.setColor(Color.white);
            graphics.drawLine(x, 0, x, HEIGHT * SCALE);
        }
        for (int y = 0; y < HEIGHT * SCALE; y += SCALE) {
            graphics.setColor(Color.white);
            graphics.drawLine(0, y, WIDTH * SCALE, y);
        }
        for (int l = 0; l < snake.length; l++) {
            graphics.setColor(Color.green);
            graphics.fillRect(snake.snakeX[1] * SCALE, snake.snakeY[1] * SCALE, SCALE, SCALE);
        }
    }

    public static void main(String[] args) {
        jFrame = new JFrame("Snake");
        jFrame.setSize(WIDTH * SCALE + 16, HEIGHT * SCALE + 8);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(new SnakeGameMain());
    }
}
