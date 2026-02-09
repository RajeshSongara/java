import java.awt.*;
import java.awt.event.*;

public class marksheet {

    Frame f;
    TextField t1, t2, t3, t4, tTotal, tPer, tGrade;
    Label l1, l2, l3, l4, l6, l7, l8;
    Button btn;

    marksheet() {

        f = new Frame("Marksheet");

        // Labels
        l1 = new Label("Sub 1");
        l2 = new Label("Sub 2");
        l3 = new Label("Sub 3");
        l4 = new Label("Sub 4");
        l6 = new Label("Obtained");   // <-- total hata ke obtained
        l7 = new Label("Percentage");
        l8 = new Label("Grade");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        tTotal = new TextField();
        tPer = new TextField();
        tGrade = new TextField();

        // Button
        btn = new Button("Show");

        // Set Bounds
        l1.setBounds(50, 50, 80, 20);
        t1.setBounds(150, 50, 80, 20);

        l2.setBounds(50, 80, 80, 20);
        t2.setBounds(150, 80, 80, 20);

        l3.setBounds(50, 110, 80, 20);
        t3.setBounds(150, 110, 80, 20);

        l4.setBounds(50, 140, 80, 20);
        t4.setBounds(150, 140, 80, 20);

        btn.setBounds(150, 180, 80, 30);

        l6.setBounds(50, 230, 80, 20);
        tTotal.setBounds(150, 230, 80, 20);

        l7.setBounds(50, 260, 80, 20);
        tPer.setBounds(150, 260, 80, 20);

        l8.setBounds(50, 290, 80, 20);
        tGrade.setBounds(150, 290, 80, 20);

        // Add Components
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(btn);
        f.add(l6); f.add(tTotal);
        f.add(l7); f.add(tPer);
        f.add(l8); f.add(tGrade);

        // Obtained marks field read-only
        tTotal.setEditable(false);
        tPer.setEditable(false);
        tGrade.setEditable(false);

        // Button Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());
                int d = Integer.parseInt(t4.getText());

                int obtained = a + b + c + d;
                tTotal.setText(String.valueOf(obtained)); // <-- kitne number aaye

                double percentage = (obtained / 400.0) * 100;
                tPer.setText(String.format("%.2f", percentage));

                String grade;
                if (percentage >= 90)
                    grade = "A";
                else if (percentage >= 80)
                    grade = "B";
                else if (percentage >= 70)
                    grade = "C";
                else if (percentage >= 60)
                    grade = "D";
                else
                    grade = "F";

                tGrade.setText(grade);
            }
        });

        // Window Close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(420, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new marksheet();
    }
}
