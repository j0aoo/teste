package layout;

import com.sun.rmi.rmid.ExecOptionPermission;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame implements ActionListener{
    
    JButton botao = new JButton("teste");
    JButton botao2 = new JButton("teste2");
    JButton botao3 = new JButton("teste3");
    JButton botao4 = new JButton("teste4");
    JButton botao5 = new JButton("teste5");
    
    public Tela(){
        setSize(300,400);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("tela layout");
        
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,botao);
        add(BorderLayout.WEST,botao2);
        add(BorderLayout.EAST,botao3);
        add(BorderLayout.CENTER,botao4);
        add(BorderLayout.SOUTH,botao5);
        
        botao.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botao){
            JOptionPane.showMessageDialog(this,"botao1");
        }
        if(e.getSource()==botao2){
            JOptionPane.showMessageDialog(this,"botao 2");
        }
        if(e.getSource()==botao3){
            JOptionPane.showMessageDialog(this,"botao 3");
        }
        if(e.getSource()==botao4){
            JOptionPane.showMessageDialog(this,"botao 4");
        }
        if(e.getSource()==botao5){
            JOptionPane.showMessageDialog(this,"botao 5");
        }
    }
}
