
import java.awt.*;
import javax.swing.*;

public class grid extends JFrame {

    grid() {
        GridBagConstraints g = new GridBagConstraints();
        Panel p = new Panel(new GridBagLayout());
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        g.gridx = 0;
        g.gridy = 0;
        p.add(new Button("1"), g);
        g.gridx = 0;
        g.gridy = 1;
        p.add(new Button("2"), g);
        g.gridx = 0;
        g.gridy = 2;
        p.add(new Button("3"), g);
        g.gridx = 1;
        g.gridy = 0;
        p.add(new Button("4"), g);
        g.gridx = 1;
        g.gridy = 1;
        p.add(new Button("5"), g);
        g.gridx = 1;
        g.gridy = 2;
        p.add(new Button("6"), g);

        add(p);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String arg[]) {
        new grid();
    }
}
