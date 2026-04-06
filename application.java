import java.awt.*;
import javax.swing.*;

public class application {
    
    JFrame f;
    Button login ,enquiry,registation,submit,reset;
    MenuBar mb;
    Label user,password;
    TextField t1,t2;
    application()
    {
        f=new JFrame("University Information System");
        //mb=new MenuBar("File");
        login= new Button("Login");
        enquiry=new Button("Enquiry");
        registation = new Button("Registation");
        t1=new TextField("Username");
        t2=new TextField("Password");
        t2.setEchoChar('*'); 
        submit = new Button("Submit");
        reset = new Button("Reset");
        login.setBounds(100, 100, 80, 30);
        enquiry.setBounds(100, 150, 80, 30);
        registation.setBounds(100, 200, 80, 30);
        t1.setBounds(200, 100, 100, 30);
        t2.setBounds(200, 150, 100, 30);
        submit.setBounds(100, 250, 80, 30);
        reset.setBounds(100, 300, 80, 30);
        f.add(login);
        f.add(enquiry);
        f.add(registation);
        f.add(t1);
        f.add(t2);
        f.add(submit);
        f.add(reset);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }

    public static void main(String a[])
    {
        new application();
    }
}
