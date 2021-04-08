
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class FirstGUI {

    public static void main(String[] args) {

        //three steps for designing GUI
        
        //step-1    (create a container)
            Frame f=new Frame();
            f.setVisible(true);
            f.setSize(600, 500);
            
            
        //step-2    (create components)
            Label l1=new Label("Name");
            Label l2=new Label("Age");
            TextField t1=new TextField(10);
            TextField t2=new TextField(10);
            Button b1=new Button("Save");
        
        //step-3    (add components on container)
            f.setLayout(new FlowLayout());
            f.add(l1); f.add(t1); f.add(l2); f.add(t2);   f.add(b1);
        
    }
}
    