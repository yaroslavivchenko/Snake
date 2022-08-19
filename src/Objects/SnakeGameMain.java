package Objects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeGameMain extends JPanel implements ActionListener {
    static JFrame jFrame;
    static final int SCALE = 32;
    static final int WIDTH = 20;
    static final int HEIGHT = 20;
    private static final int speed = 10;
    Snake snake = new Snake(5, 6, 5, 5);
    Timer timer = new Timer(1000/speed,this);

    public SnakeGameMain() {
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);

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
            graphics.fillRect(snake.snakeX[1] * SCALE+2, snake.snakeY[1] * SCALE+2, SCALE-2, SCALE-2);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        snake.move();
        repaint();
    }

    class KeyBoard extends KeyAdapter{
        public void keyPressed(KeyEvent event){
            int key = event.getKeyCode();

            if ((key == KeyEvent.VK_UP) &&(snake.direction!=2)) snake.direction = 0;
            if ((key == KeyEvent.VK_DOWN) &&(snake.direction!=0)) snake.direction = 2;
            if ((key == KeyEvent.VK_LEFT) &&(snake.direction!=3)) snake.direction = 1;
            if ((key == KeyEvent.VK_RIGHT) &&(snake.direction!=1)) snake.direction = 3;
        }
    }
}
