import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class carrd extends JFrame implements ActionListener {

    CardLayout c;
    Panel p;
    Button b1, b2, b3;

    carrd() {
        c = new CardLayout();
        p = new Panel();
        p.setLayout(c);

        // Buttons with colors
        b1 = new Button("Card 1");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);

        b2 = new Button("Card 2");
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLACK);

        b3 = new Button("Card 3");
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);

        p.add(b1, "1");
        p.add(b2, "2");
        p.add(b3, "3");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(p);

        // Optional: background color of panel
        p.setBackground(Color.LIGHT_GRAY);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            c.show(p, "2");
        } else if (e.getSource() == b2) {
            c.show(p, "3");
        } else if (e.getSource() == b3) {
            c.show(p, "1");
        }
    }

    public static void main(String[] args) {
        new carrd();
    }
}