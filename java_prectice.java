import java.awt.*;

public class java_prectice extends Frame {

    java_prectice() {
       
        Label l = new Label("Use");
        Button b= new Button("Button");
         setSize(400,300);
        l.setBounds(100,80,100,20);
        b.setBounds(180,80,60,20);
        add (b);
        add(l);
       
        setVisible(true);

       
    }
    public static void main(String[] args) {
        new java_prectice();
    }
}
