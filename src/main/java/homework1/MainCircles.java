package homework_jb;

import homework1.Ball;
import homework1.GameCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainCircles extends JFrame {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private Ball[] sprites = new Ball[10];

    public void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    public void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
    public void onDrawCanvas(GameCanvas c, Graphics g, float deltaTime) {
        homework_jb.Background.setBackgroundColor(c, deltaTime);
        update(c, deltaTime);
        render(c, g);
    }

    void addBall() {
        Ball[] newSprites = new Ball[sprites.length + 1];
        System.arraycopy(sprites, 0, newSprites, 0, sprites.length);
        sprites = newSprites;
        sprites[sprites.length - 1] = new Ball();
    }

    void deleteBall() {
        Ball[] newSprites = new Ball[sprites.length - 1];
        System.arraycopy(sprites, 1, newSprites, 0, newSprites.length);
        sprites = newSprites;
    }

    private void initApplication() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");
        GameCanvas canvas = new GameCanvas(this);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    addBall();
                }
                if (e.getButton() == 3) {
                    deleteBall();
                }
                canvas.repaint();
            }
        });
        add(canvas);
        initApplication();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainCircles();
    }
}
