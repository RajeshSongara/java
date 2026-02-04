
import java.awt.*;
import java.awt.event.*;

public class kkk {

    public static void main(String[] args) {

        Frame f = new Frame("Addition Program");

        Label l = new Label("No 1 = ");
        Label l1 = new Label("No 2 = ");

        TextField txno1 = new TextField();
        TextField txno2 = new TextField();

        Button btn = new Button("ADD");
        TextField show = new TextField();

        l.setBounds(50, 100, 50, 20);
        l1.setBounds(50, 150, 50, 20);

        txno1.setBounds(120, 100, 100, 20);
        txno2.setBounds(120, 150, 100, 20);

        btn.setBounds(120, 200, 60, 25);
        show.setBounds(120, 250, 100, 20);

        f.add(l);
        f.add(l1);
        f.add(txno1);
        f.add(txno2);
        f.add(btn);
        f.add(show);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(txno1.getText());
                int b = Integer.parseInt(txno2.getText());
                if (a > b) {
                    show.setText(String.valueOf(a) + " A is Gretar ");
                } else {
                    show.setText(String.valueOf(b) + " A is Not Gretar ");
                }
            }
        });

        WindowListener lister = new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        };

        f.addWindowListener(lister);
    }
}
