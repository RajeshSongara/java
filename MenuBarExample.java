import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuBarExample implements ActionListener {

    JMenuBar myBar;
    JMenu file, help;   
    JMenuItem open, exit, about, helpContent; 
    JFrame f;

    MenuBarExample() {
        f = new JFrame("My Application");

        myBar = new JMenuBar();

        file = new JMenu("File");
        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");

        file.add(open);
        file.addSeparator();
        file.add(exit);


        help = new JMenu("Help");
        helpContent = new JMenuItem("Help Contents");
        about = new JMenuItem("About");

        help.add(helpContent);
        help.addSeparator();
        help.add(about);


        myBar.add(file);
        myBar.add(help);

        open.addActionListener(this);
        exit.addActionListener(this);
        helpContent.addActionListener(this);
        about.addActionListener(this);

        f.setJMenuBar(myBar);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == open) {
            JOptionPane.showMessageDialog(f, "Open your file");
        } 
        else if (e.getSource() == exit) {
            System.exit(0);
        }
        else if (e.getSource() == helpContent) {
            JOptionPane.showMessageDialog(f, "This is help content.\nUse File menu to open files.");
        }
        else if (e.getSource() == about) {
            JOptionPane.showMessageDialog(f, "My Application v1.0\nDeveloped in Java Swing");
        }
    }

    public static void main(String[] args) {
        new MenuBarExample();
    }
}