
import javax.swing.*;
import javax.swing.tree.*;

public class tree_node {

    JFrame j;

    public tree_node() {
        j = new JFrame("My collage");
        DefaultMutableTreeNode d = new DefaultMutableTreeNode("Department");
        DefaultMutableTreeNode ce = new DefaultMutableTreeNode("Computer Engineering");
        DefaultMutableTreeNode cs = new DefaultMutableTreeNode("Computer Science");
        DefaultMutableTreeNode mt = new DefaultMutableTreeNode("Mechanical Engineering");
        DefaultMutableTreeNode bt = new DefaultMutableTreeNode("Biotechnology");
        DefaultMutableTreeNode mca = new DefaultMutableTreeNode("MCA");
        DefaultMutableTreeNode bca = new DefaultMutableTreeNode("BCA");
        DefaultMutableTreeNode bsc = new DefaultMutableTreeNode("BSC");
        d.add(ce);
        d.add(cs);
        d.add(mt);
        d.add(bt);
        ce.add(mca);
        ce.add(bca);
        ce.add(bsc);
        
        JTree jt=new JTree(d);
        JScrollPane sp=new JScrollPane(jt);
        j.add(sp);
        j.setSize(400, 400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setLayout(null);
    }

    public static void main(String[] args) {
        new tree_node();
    }
}
