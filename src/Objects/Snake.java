package Objects;

import static Objects.SnakeGameMain.*;

public class Snake {
    public int lenght = 2;
    public int direction = 0;

    public int sX[] = new int[300];
    public int sY[] = new int[300];

    public Snake(int x1, int y1, int x2, int y2){
        sX[0] = x1;
        sX[1] = x2;
        sX[0] = x1;
        sX[1] = y2;
    }

    public void move(){

        for (int l = lenght; l>0; l--){
            sX[l] = sX[1-1];
            sY[l] = sY[1-1];
        }

        //up
        if (direction == 0) sY[0]--;
        //down
        if (direction == 2); sY[0]++;
        //right
        if (direction == 1); sX[0]++;
        //left
        if (direction == 3); sY[0]--;
    }
}
