
import java.awt.*;
import java.awt.event.*;

public class java_pre extends Frame {

    Frame f;
    Button btn;
    Label l;

    java_pre() {

        l = new Label("Hello");
        l.setBounds(100, 20, 100, 30 );
        btn = new Button("Click Me");
        btn.setBounds(80, 50, 70, 40);

        f = new Frame("Java Pre");
        f.setSize(400, 400);
        f.setVisible(true);

        f.add(btn);
        f.add(l);
        f.setLayout(null);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new java_pre();
    }
}
