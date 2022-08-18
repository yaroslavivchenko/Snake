package Objects;

import javax.swing.*;
import java.awt.*;

public class SnakeGameMain extends JPanel {

    public static JFrame jFrame;
    public static final  int SCALE = 30;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    Snake s = new Snake(5, 6, 5, 5);

    public void SnakeGameMain(){

    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,WIDTH*SCALE, HEIGHT*SCALE);

        for(int x = 0; x < WIDTH*SCALE; x+=SCALE){
            g.setColor(Color.white);
            g.drawLine(x,0, x,HEIGHT*SCALE);
        }
        for(int y = 0; y<HEIGHT*SCALE; y+=SCALE ){
            g.setColor(Color.white);
            g.drawLine(0,y, WIDTH*SCALE,y);
        }
        for(int l = 0; l < s.lenght ; l++){
            g.setColor(Color.green);
           // g.fillRect(s.sX[1]*SCALE+1, s.sY[1]*SCALE+1, SCALE-1,SCALE-2);
        }

    }

    public static void main(String[] args) {
        jFrame = new JFrame("Snake");
        jFrame.setSize(WIDTH*SCALE+16,HEIGHT*SCALE+8);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(new SnakeGameMain());
    }
}
