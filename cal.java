import java.awt.*;
import java.awt.event.*;

public class cal implements ActionListener {

    Frame f;
    TextField t1, t2, t3;
    Button add, sub, mul, div, clr;

    cal() {
        f = new Frame("Calculator");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        clr = new Button("Clear");

        t1.setBounds(50, 50, 150, 30);
        t2.setBounds(50, 90, 150, 30);
        t3.setBounds(50, 130, 150, 30);

        add.setBounds(220, 50, 50, 30);
        sub.setBounds(280, 50, 50, 30);
        mul.setBounds(220, 90, 50, 30);
        div.setBounds(280, 90, 50, 30);
        clr.setBounds(220, 130, 110, 30);

        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(div); f.add(clr);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clr.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == add)
                result = a + b;
            else if (e.getSource() == sub)
                result = a - b;
            else if (e.getSource() == mul)
                result = a * b;
            else if (e.getSource() == div)
                result = a / b;
            else if (e.getSource() == clr) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                return;
            }

            t3.setText(String.valueOf(result));
        } catch (Exception ex) {
            t3.setText("Error");
        }
    }

    public static void main(String[] args) {
        new cal();
    }
}
