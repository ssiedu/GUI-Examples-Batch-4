
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class SecondGUI {

    public static void main(String[] args) {

        //three steps for designing GUI
        //step-1    (create a container)
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(600, 500);

        //step-2    (create components)
        Label l1 = new Label("Name");
        Label l2 = new Label("Age");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button b1 = new Button("Save");

        //step-3    (add components on container)
        //working without LayoutManagers
        f.setLayout(null);
        //setting size and location of each components
        l1.setSize(60, 30);
        l1.setLocation(150, 100);
        t1.setSize(100, 30);
        t1.setLocation(280, 100);
        l2.setBounds(150, 180, 60, 30);
        t2.setBounds(280, 180, 100, 30);
        b1.setBounds(200, 250, 60, 30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);

    }
}
