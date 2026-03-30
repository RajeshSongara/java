import javax.swing.*;

public class g_table {
    JFrame f;

   public  g_table()
    {
        f=new JFrame("My table..");
        String[][] data={{"101","ravi","mca"},
                        {"102","raz","bca"},
                        {"103","mukesh","bsc"}};
        String[] colum={"id","name","course"}; 
        JTable jt=new JTable(data,colum);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(400,400); 
        f.setVisible(true); 
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);              
    }
    public static void main(String []a)
    {
        new g_table();        
    }
}
