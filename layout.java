
import java.awt.*;
import javax.swing.*;

public class layout extends JFrame {

    layout() {
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 40, 40);

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 1");
        JButton btn5 = new JButton("Button 2");
        JButton btn6 = new JButton("Button 3");

        setLayout(fl);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);

        setSize(400, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 👈 important
        setVisible(true);
    }

    public static void main(String a[]) {
        new layout();
    }
}
