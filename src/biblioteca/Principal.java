/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private JPanel pnlicon;
    private JPanel usac;
    
    private JTextArea noticias;
    
    public Principal(){
            setLayout(null);
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
        
        pnlicon=new JPanel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(80, 50, 80, 80);
        pnlicon.setBackground(Color.CYAN);
        
        usac=new JPanel();
        usac.setSize(50,50);
        usac.setBounds(80, 160, 300, 200);
        usac.setBackground(Color.CYAN);
        
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
    
}
    
}
