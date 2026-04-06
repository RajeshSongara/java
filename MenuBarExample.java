import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuBarExample implements ActionListener {

    JMenuBar myBar;
    JMenu file, help, home;   
    JMenuItem open, exit, about, helpContent,cut,copy,paste; 
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

        home = new JMenu("Home");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        home.add(cut);
        home.add(copy);
        home.add(paste);
        myBar.add(home);


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
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        

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
        else if (e.getSource()==cut)
        {
            JOptionPane.showMessageDialog(f,"Cut action performed.\nUse Ctrl+X to cut.");
        }
        else if (e.getSource()==copy)
        {
            JOptionPane.showMessageDialog(f,"Copy action performed.\nUse Ctrl+C to copy.");
        }
        else if (e.getSource()==paste)
        {
            JOptionPane.showMessageDialog(f,"Paste action performed.\nUse Ctrl+V to paste.");
        }
    }

    public static void main(String[] args) {
        new MenuBarExample();
    }
}