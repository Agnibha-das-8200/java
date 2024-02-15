import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlappyBird extends JFrame implements ActionListener, KeyListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int GROUND_HEIGHT = 50;

    private Timer timer;
    private int birdY;
    private int birdVelocity;
    private List<Rectangle> pipes;

    public FlappyBird() {
        setTitle("Flappy Bird");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setFocusable(true);
        addKeyListener(this);

        birdY = HEIGHT / 2;
        birdVelocity = 0;
        pipes = new ArrayList<>();

        timer = new Timer(20, this);
        timer.start();

        initializePipes();
    }

    private void initializePipes() {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int gapPosition = rand.nextInt(HEIGHT - GROUND_HEIGHT - 200) + 100;
            pipes.add(new Rectangle(WIDTH + i * 300, 0, 50, gapPosition - 50)); // Upper pipe
            pipes.add(new Rectangle(WIDTH + i * 300, gapPosition + 50, 50, HEIGHT - GROUND_HEIGHT - gapPosition)); // Lower pipe
        }
    }

    private void move() {
        birdVelocity += 2;
        birdY += birdVelocity;

        for (Rectangle pipe : pipes) {
            pipe.x -= 5;
        }

        if (birdY > HEIGHT - GROUND_HEIGHT - 30) {
            birdY = HEIGHT - GROUND_HEIGHT - 30;
            birdVelocity = 0;
        }

        List<Rectangle> pipesToRemove = new ArrayList<>();

        for (Rectangle pipe : pipes) {
            if (pipe.x + pipe.width < 0) {
                pipesToRemove.add(pipe);
            }
        }

        pipes.removeAll(pipesToRemove);

        checkCollisions();
    }

    private void checkCollisions() {
        Rectangle birdBounds = new Rectangle(WIDTH / 2 - 20, birdY, 40, 30);

        for (Rectangle pipe : pipes) {
            if (birdBounds.intersects(pipe)) {
                gameOver();
            }
        }

        if (birdY <= 0 || birdY >= HEIGHT - GROUND_HEIGHT - 30) {
            gameOver();
        }
    }

    private void gameOver() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game Over!");
        System.exit(0);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT - GROUND_HEIGHT, WIDTH, GROUND_HEIGHT);

        g.setColor(Color.green);
        for (Rectangle pipe : pipes) {
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
        }

        g.setColor(Color.red);
        g.fillRect(WIDTH / 2 - 20, birdY, 40, 30);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            birdVelocity = -15;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlappyBird flappyBird = new FlappyBird();
            flappyBird.setVisible(true);
        });
    }
}
