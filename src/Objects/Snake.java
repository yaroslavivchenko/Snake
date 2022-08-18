package Objects;

class Snake {
    int length = 2;
    int direction = 0;
    int[] snakeX = new int[300];
    int[] snakeY = new int[300];

    Snake(int x1, int y1, int x2, int y2) {
        snakeX[0] = x1;
        snakeX[1] = x2;
        snakeY[0] = y1;
        snakeY[1] = y2;
    }

    public void move() {

        for (int l = length; l > 0; l--) {
            snakeX[l] = snakeX[l - 1];
            snakeY[l] = snakeY[l - 1];
        }

        //up
        if (direction == 0) {
            snakeY[0]--;
        }
        //down
        if (direction == 2) {
            snakeY[0]++;
        }
        //right
        if (direction == 1) {
            snakeX[0]++;
        }
        //left
        if (direction == 3) {
            snakeY[0]--;
        }
    }
}
