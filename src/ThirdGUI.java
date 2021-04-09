
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;


public class ThirdGUI extends Frame {
    
    TextField t1,t2;
    Button b1,b2;
    
    public ThirdGUI(){
        initComponents();
    }
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        add(t1); add(t2); 
        add(b1); add(b2);
    }
    public static void main(String[] args) {
        ThirdGUI ob=new ThirdGUI();
        ob.setSize(400,400);
        ob.setVisible(true);
    }
}
/*
    1) extends the Frame class.
    2) all the components are declared in class (not inside a method)
    3) now to create the components netbeans generates a initComponents method
    4) creates a constructor and invokes the initComponents insize it.
*/