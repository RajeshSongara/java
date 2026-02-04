import java.awt.*;
import java.awt.event.*;

public class Aw implements ActionListener {

    Frame f;
    Button btn;
    TextArea t;

    public Aw() {
        f = new Frame("Loop");
        btn = new Button("Show");
        t = new TextArea();

        btn.setBounds(50, 70, 70, 50);
        t.setBounds(150, 70, 200, 150);

        f.add(btn);
        f.add(t);

        btn.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                t.setText(t.getText() + j);
            }
            t.setText(t.getText() + "\n");
        }
    }

    public static void main(String[] args) {
        new Aw();
    }
}
