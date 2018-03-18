/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Login extends JFrame{
    private JLabel user;
    private JLabel psswd;
    
    public JTextField _user;
    public JPasswordField _psswd;
    
    private JButton logIn;
    private JButton logOut;
    
    private JPanel pnl;
    private JPanel pnlicon;
    public Login(){
        setLayout(null);
        
        setTitle("LOGIN");
        Dimension dim = new Dimension(200, 50);
        Dimension dim2 = new Dimension(400, 50);
        
        user = new JLabel("Usuario");
        user.setSize(dim);
        user.setBounds(80,30,200,50);
      
        
        psswd = new JLabel("Contraseña");
        psswd.setSize(dim);
        psswd.setBounds(80,230,200,50);
        
        _user = new JTextField();
        _user.setSize(dim2);
        _user.setBounds(120,100,230,30);
        
        _psswd = new JPasswordField();
        _psswd.setSize(dim2);
        _psswd.setBounds(120,300, 230, 30);
        
        logIn = new JButton("Ingresar");
        logIn.setSize(dim);
        logIn.setBounds(130, 400, 100, 30);
        
        logOut = new JButton("Cancelar");
        logOut.setSize(dim);
        logOut.setBounds(300, 400, 100, 30);
        
        pnl = new JPanel();
        pnl.setSize(600, 600);
        pnl.setBounds(0,0,600,600);
        
        pnlicon=new JPanel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(400, 130, 150, 150);
        pnlicon.setBackground(Color.CYAN);
        
        add(user);
        add(psswd);
        add(_user);
        add(_psswd);
        add(logIn);
        add(logOut);
        add(pnlicon);
        
        setSize(600,600);
        setVisible(true);
    }
    
   /* private JTextField caja1;//se coloca un espacio de texto llamado TextField
    private JTextField caja2;
    private JTextField caja3;
    private JButton botonlogin;//son los botones a utilizar en el programa
    private JButton botonlogout;
    private JPanel panelog;
    
    public Login() {
        setLayout(null);
        botonlogin = new JButton(" Login ");
        botonlogin.setBounds(25,25,200,25);
        botonlogout=new JButton(" Logout ");
        botonlogout.setBounds(255,25,200,25);
        panelog= new JPanel();
        panelog.setBounds(0,0,400,50);
        panelog.add(botonlogin);
        panelog.add(botonlogout);
        add(panelog);
    }*/
    
}
