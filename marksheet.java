import java.awt.*;
import java.awt.event.*;

public class marksheet {

    Frame f;
    TextField t1, t2, t3, t4, t5, tTotal, tPer, tGrade;
    Label l1, l2, l3, l4, l5, l6, l7, l8;
    Button btn;

    marksheet() {
        f = new Frame("Marksheet");

        // Labels
        l1 = new Label("Sub 1");
        l2 = new Label("Sub 2");
        l3 = new Label("Sub 3");
        l4 = new Label("Sub 4");
        l5 = new Label("Marks");
        l6 = new Label("Total");
        l7 = new Label("Percentage");
        l8 = new Label("Grade");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField(); // marks
        tTotal = new TextField();
        tPer = new TextField();
        tGrade = new TextField();

        // Button
        btn = new Button("Show");

        // setBounds(x, y, width, height)
        l1.setBounds(50, 50, 60, 20);
        t1.setBounds(120, 50, 80, 20);

        l2.setBounds(50, 80, 60, 20);
        t2.setBounds(120, 80, 80, 20);

        l3.setBounds(50, 110, 60, 20);
        t3.setBounds(120, 110, 80, 20);

        l4.setBounds(50, 140, 60, 20);
        t4.setBounds(120, 140, 80, 20);

        l5.setBounds(50, 170, 60, 20);
        t5.setBounds(120, 170, 80, 20);

        btn.setBounds(100, 210, 80, 30);

        l6.setBounds(50, 260, 60, 20);
        tTotal.setBounds(120, 260, 80, 20);

        l7.setBounds(50, 290, 70, 20);
        tPer.setBounds(120, 290, 80, 20);

        l8.setBounds(50, 320, 60, 20);
        tGrade.setBounds(120, 320, 80, 20);

        // Add components
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(l5); f.add(t5);
        f.add(btn);
        f.add(l6); f.add(tTotal);
        f.add(l7); f.add(tPer);
        f.add(l8); f.add(tGrade);

        // Window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new marksheet();
    }
}
