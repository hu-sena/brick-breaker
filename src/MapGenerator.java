package src;

import java.awt.*;

public class MapGenerator {

    public int map[][];
    public int bricksWidth;
    public int bricksHeight;

    public MapGenerator(int row, int col) {
        map = new int[row][col];

        for (int[] mapTemp : map) {
            for (int j = 0; j < map[0].length; j++) {
                mapTemp[j] = 1;
            }
        }

        bricksWidth = 540 / col;
        bricksHeight = 150 / row;
    }

    public void draw(Graphics2D brick) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {

                    brick.setColor(Color.red);
                    brick.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    brick.setStroke(new BasicStroke(3));
                    brick.setColor(Color.black);
                    brick.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                }
            }
        }
    }

    public void setBricksValue(int value, int row, int col) {
        map[row][col] = value;
    }
}


