package layout;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grid extends JFrame {
    JPanel pain = new JPanel();
    JLabel usu = new JLabel("usuario");
    JTextField cmp = new JTextField();
    JLabel sen = new JLabel("senha");
    JTextField cmp2 = new JTextField();
    JButton botao = new JButton("entar");
    JButton botao2 = new JButton("sair");
    
    public Grid(){
        setSize(300, 400);
        setTitle("tela flow");
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(5,1,80,0));
        add(usu);
        add(cmp);
        add(sen);
        add(cmp2);
        //add(botao);
        //add(botao2);
        add(pain);
        
        pain.setLayout(new GridLayout(1,2));
        pain.add(botao);
        pain.add(botao2);
        
    }
    
    public static void main(String[] args) {
        new Grid().setVisible(true);
    }
    
}
