package homework_jb;

import homework1.GameCanvas;

import java.awt.*;
import java.util.Random;

public class Background {

    private static float startTime = 0;
    private static float speed = 0.1f;

    static void setBackgroundColor(GameCanvas canvas, float time) {
        startTime += time*speed;
        if (startTime > 1) {
            startTime = 0;
        }
        canvas.setBackground(Color.getHSBColor(startTime, 1, 1));
    }
}
