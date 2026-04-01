
import javax.swing.*;

public class g_tab_pan {

    JFrame f;

    g_tab_pan() {
        f = new JFrame("My App..");

        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel(); 

        JTextArea ta = new JTextArea(10, 20);
        p1.add(ta);

        JButton b = new JButton("Click me");
        JButton b1 = new JButton("Click me");
        JButton b2 = new JButton("Click me");

        p2.add(b);
        p2.add(b1);
        p2.add(b2);
        p1.add(new JLabel("Main Section"));
        p3.add(new JLabel("Help Section")); 
        tp.add("Main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);
        
        f.add(tp);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] a) {
        new g_tab_pan();
    }
}
