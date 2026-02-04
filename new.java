import java.awt.*;
import java.event.*;

public class new {

	Button btn =new Button("Show");
	Frame f=new Frame("Loop");
	TextArea t=new TextArea();
	

    WindowListener lister = new WindowAdapter() {

        public void windowClosing(WindowEvent e) {
            f.dispose();
        }
    };
}
