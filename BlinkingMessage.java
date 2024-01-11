import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

public class BlinkingMessage extends JFrame {
    private JLabel messageLabel;

    public BlinkingMessage() {
        // Set up the JFrame
        setTitle("Blinking Message");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create and configure the JLabel
        messageLabel = new JLabel("Blinking Message");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setForeground(Color.RED);

        // Add the JLabel to the JFrame
        add(messageLabel);

        // Set up a Timer to toggle the visibility of the message every 500 milliseconds
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new BlinkTask(), 0, 500);
    }

    private class BlinkTask extends TimerTask {
        private boolean isVisible = true;

        @Override
        public void run() {
            isVisible = !isVisible;
            messageLabel.setVisible(isVisible);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the BlinkingMessage class and make it visible
        BlinkingMessage blinkingMessage = new BlinkingMessage();
        blinkingMessage.setVisible(true);
    }
}
