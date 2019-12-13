package layout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Null extends JFrame {
    
    JButton botao = new JButton("me aperte");
    
    public Null(){
        setSize(300,400);
        setLocationRelativeTo(this);
        setTitle("titulo");
        
        setLayout(null);
    
        add(botao);
        botao.setBounds(90,90,100,20);
    }
}
