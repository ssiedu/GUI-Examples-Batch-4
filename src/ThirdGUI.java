
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


public class ThirdGUI extends Frame implements ActionListener, TextListener, ItemListener, FocusListener, KeyListener {
    
    TextField t1,t2;
    Button b1,b2, b3;
    Choice ch;
    
    public ThirdGUI(){
        initComponents();
    }
    public void initComponents(){
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("MP");
        ch.add("MH");
        ch.add("RJ");
        ch.add("UP");
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        b3=new Button("Close");
        add(ch);add(t1); add(t2); 
        add(b1); add(b2);add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addTextListener(this);
        ch.addItemListener(this);
        //b3.setEnabled(false);
        b2.addFocusListener(this);
        t1.addKeyListener(this);
    }
    public static void main(String[] args) {
        ThirdGUI ob=new ThirdGUI();
        ob.setSize(400,400);
        ob.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //you can identify the event source by calling a method called getSource() on ActionEvent object
        if(e.getSource()==b1){
            String s=t1.getText();
            t2.setText(s);
        }else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }else if(e.getSource()==b3){
            System.exit(0);
        }
        
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        t2.setText(s);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //we need to identify which item is selected.
        String capital="";
        String item=ch.getSelectedItem();
        switch(item){
            case "MP":
                capital="Bhopal";
            break;
            case "MH":
                capital="Mumbai";
            break;
            case "RJ":
                capital="Jaipur";
            break;
            case "UP":
                capital="Lucknow";
            break;
        }
        
        setTitle(capital);
    }

    @Override
    public void focusGained(FocusEvent e) {
       b3.setEnabled(true);
    }

    @Override
    public void focusLost(FocusEvent e) {
       b3.setEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //which key is pressed?
        
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){
            //changing text of t1 to capital case
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
/*
    1) extends the Frame class.
    2) all the components are declared in class (not inside a method)
    3) now to create the components netbeans generates a initComponents method
    4) creates a constructor and invokes the initComponents insize it.
*/