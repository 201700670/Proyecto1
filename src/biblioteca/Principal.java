/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Andrea Palomo
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Principal extends JFrame{
    private JLabel user;
    private JLabel psswd;
    
    private JButton logIn;
    private JButton logOut;
    private JButton about;
    
    private JPanel pnl;
    private JLabel pnlicon;
    private JLabel usac;
    
    private JTextArea noticias;
    
    private ImageIcon imagen;
    private ImageIcon imagen2;
    
    public Principal(){
            setLayout(null);
            setLocationRelativeTo(null);
        Dimension dim = new Dimension(200, 50);
        setTitle("IPC PROYECTO 1");
        logIn = new JButton("LogIn");
        logIn.setSize(dim);
        logIn.setBounds(400, 70, 100, 30);
        
        logOut = new JButton("LogOut");
        logOut.setSize(dim);
        logOut.setBounds(600, 70, 100, 30);
        
        about=new JButton("About");
        about.setSize(dim);
        about.setBounds(150, 400, 100, 30);
        
        pnl = new JPanel();
        pnl.setSize(600, 600);
        pnl.setBounds(0,0,600,600);
        
        imagen=new ImageIcon(getClass().getResource("persona.jpg"));
        
        pnlicon=new JLabel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(120, 20, 150, 150);
        pnlicon.setIcon(imagen);
        
        imagen2=new ImageIcon(getClass().getResource("usac.png"));
        
        usac=new JLabel();
        usac.setSize(50,50);
        usac.setBounds(80, 180, 350, 127);
        usac.setIcon(imagen2);
        
        noticias=new JTextArea("NOTICIAS");
        noticias.setSize(200,100);
        noticias.setBounds(450, 180, 300, 150);
        noticias.setEditable(false);
        noticias.setLineWrap(true);
        noticias.setText("\t         NOTICIAS\n"+"Como pantalla principal se sugiere la siguiente interfaz gráfica. No es obligatorio que sea igual a la que se muestra en la imagen, pero es necesario que se cuente como mínimo con los siguientes botones: ");
        
        add(logIn);
        add(logOut);
        add(about);
        add(pnlicon);
        add(usac);
        add(noticias);
        setSize(800,500);
        setVisible(true);
        
        Accionar manejo=new Accionar();
        logIn.addActionListener(manejo);
        logOut.addActionListener(manejo);
        about.addActionListener(manejo);
    
}

    private class Accionar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==logIn){
                Login obj=new Login();
                obj.setVisible(true);
                dispose();
            }if(ae.getSource()==about){
                JOptionPane.showMessageDialog(Principal.this,String.format("Esta es una Biblioteca virtual de la"
                        + " Universidad de San Carlos de Guatemala. \n"
                        + "Para poder ingresar debe tener una cuenta y un Usuario. "
                        + "Gracia por utilizar este medio.",ae.getActionCommand()));
            }if(ae.getSource()==logOut){
                System.exit(0);
            }
    }
    }
    
}
