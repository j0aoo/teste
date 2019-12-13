package layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Flow extends JFrame implements ActionListener {
    
    JButton botao =  new JButton("teste");
    JButton botao2 = new JButton("teste2");
           
    
    public Flow(){
        setTitle("tela Flow");
        setSize(300,400);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(botao);
        add(botao2);
        
        botao.addActionListener(this);
        botao2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botao){
            JOptionPane.showMessageDialog(null,"botao teste1");
        }
        if(e.getSource()==botao2){
            JOptionPane.showMessageDialog(null, "botao teste2");
        }
    }
}
