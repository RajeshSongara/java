import java.awt.event.*;
import java.awt.*;

class A {

    String name;

    void getname() {
        name = "Rajesh";
    }
}

class B extends A {

    String course, info;

    void s_course(String c) {
        course = c;
    }

    void show() {
        info = name + " " + course;
        System.out.println(info);
    }
}

class C extends B {

    Frame f;
    Label l;
    Choice c1;

    C() {
        f = new Frame("Inheritance Example");
        l = new Label("Select Course");

        f.setSize(400, 400);
        f.setLayout(null);

        l.setBounds(50, 50, 200, 30);
        f.add(l);

        c1 = new Choice();
        c1.add("MCA");
        c1.add("MBA");
        c1.add("BCA");
        c1.add("BBA");

        c1.setBounds(50, 100, 200, 30);
        f.add(c1);

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
}

public class inheri {

    public static void main(String[] ar) {

        C obj = new C();
        obj.getname();
        obj.s_course("MCA");
        obj.show();
    }
}
