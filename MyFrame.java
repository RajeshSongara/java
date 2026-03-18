import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame("Drawing Example");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(20, 30, 250, 30);
                g.drawOval(20, 80, 150, 80);
                g.setColor(Color.BLUE);
                g.fillRoundRect(100, 150, 100, 50, 20, 20);
            }
        };

        f.add(panel);
        f.setVisible(true);
    }
}
