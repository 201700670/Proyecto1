/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Usuarionormal extends JFrame{
    private JLabel user;
    private JLabel psswd;

    private JTextArea noticias;
    
    private JButton logIn;
    private JButton logOut;
    private JButton registrarse;
    
    private ImageIcon imagen;
    private ImageIcon imagen2;

    private JLabel pnlicon;
    private JLabel logo;
    public Usuarionormal(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("LOGIN");
        Dimension dim = new Dimension(200, 50);
        Dimension dim2 = new Dimension(400, 50);
        
        user = new JLabel("Logo");
        user.setSize(dim);
        user.setBounds(20,30,200,50);
      
        psswd = new JLabel("Usuario");
        psswd.setSize(dim);
        psswd.setBounds(400,30,200,50);
        
        logIn = new JButton("Biblioteca Virtual");
        logIn.setSize(dim);
        logIn.setBounds(20, 250, 300, 30);
        
        logOut = new JButton("LOGOUT");
        logOut.setSize(dim);
        logOut.setBounds(20, 350, 300, 30);
        
        registrarse = new JButton("Préstamos de Libros");
        registrarse.setSize(dim);
        registrarse.setBounds(20,300, 300, 30);
        
        imagen = new ImageIcon(getClass().getResource("persona.jpg"));
        imagen2 = new ImageIcon(getClass().getResource("usac.png"));
        
        pnlicon=new JLabel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(400, 70, 150, 150);
        pnlicon.setIcon(imagen);
        
        logo=new JLabel();
        logo.setSize(50,50);
        logo.setBounds(20, 70, 350, 127);
        logo.setIcon(imagen2);
        
        noticias=new JTextArea("NOTICIAS");
        noticias.setSize(200,100);
        noticias.setBounds(350, 250, 200, 150);
        noticias.setEditable(false);
        noticias.setLineWrap(true);
        noticias.setText("                     NOTICIAS\n"+"Como pantalla principal se sugiere la siguiente interfaz gráfica. No es obligatorio que sea igual a la que se muestra en la imagen, pero es necesario que se cuente como mínimo con los siguientes botones: ");
        
        add(noticias);
        add(user);
        add(psswd);
        add(logIn);
        add(logOut);
        add(registrarse);
        add(pnlicon);
        add(logo);
        
        Evaluar manejo=new Evaluar();
        logIn.addActionListener(manejo);
        logOut.addActionListener(manejo);
        registrarse.addActionListener(manejo);
        
        setSize(600,550);
        setVisible(true);
    }
    private class Evaluar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==logIn){
                Biblioteca_virtual obj=new Biblioteca_virtual();
                obj.setVisible(true);
            }
            if(ae.getSource()==logOut){
                Principal obj=new Principal();
                obj.setVisible(true);
                
            }
            if(ae.getSource()==registrarse){
                Prestamosgeneral obj=new Prestamosgeneral();
                obj.setVisible(true);
            }
        }
    }
}
