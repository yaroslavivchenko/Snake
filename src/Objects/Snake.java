package Objects;

class Snake {
    public int length = 2;
    public int direction = 2;
    public int[] snakeX = new int[300];
    public int[] snakeY = new int[300];

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
        if (direction == 3) {
            snakeX[0]--;
        }
        //left
        if (direction == 1) {
            snakeY[0]++;
        }
        if (snakeX[0] > SnakeGameMain.WIDTH - 1) snakeX[0] = 0;
        if (snakeX[0] < 0) snakeX[0] = SnakeGameMain.WIDTH - 1;
        if (snakeY[0] > SnakeGameMain.HEIGHT - 1) snakeY[0] = 0;
        if (snakeY[0] < 0) snakeY[0] = SnakeGameMain.HEIGHT - 1;
    }
}
