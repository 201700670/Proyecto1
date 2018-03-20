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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private JButton registrarse;
    
    private ImageIcon imagen;
    
    private JPanel pnl;
    private JLabel pnlicon;
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
        
        registrarse = new JButton("Registrarse");
        registrarse.setSize(dim);
        registrarse.setBounds(200, 450, 130, 30);
        
        pnl = new JPanel();
        pnl.setSize(600, 600);
        pnl.setBounds(0,0,600,600);
        
        imagen = new ImageIcon(getClass().getResource("persona.jpg"));
        
        pnlicon=new JLabel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(400, 130, 150, 150);
        pnlicon.setIcon(imagen);
        
        add(user);
        add(psswd);
        add(_user);
        add(_psswd);
        add(logIn);
        add(logOut);
        add(registrarse);
        add(pnlicon);
        
        setSize(600,600);
        setVisible(true);
        Acciones manejo=new Acciones();
        logIn.addActionListener(manejo);
        logOut.addActionListener(manejo);
        registrarse.addActionListener(manejo);
    }
    private class Acciones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String tener;
            if(ae.getSource()==registrarse){
                    Usuario obj1=new Usuario();
                    obj1.setVisible(true);
                }
                if(ae.getSource()==logOut){
                    System.exit(0);
                }
            if(ae.getSource()==logIn){
                for(int i=0;i<1;i++){
                    if(((_user.getText()).equals(Usuario.Lista7[i]))&&((_psswd.getText())).equals(Usuario.Lista5[i])){
                        System.out.println("hola mundo");
                    }
                    else if(!((_user.getText()).equals(Usuario.Lista7[i]))&&!((_psswd.getText()).equals(Usuario.Lista5[i]))){
                        JOptionPane.showMessageDialog(Login.this,"EL USUARIO NO EXISTE, PONERSE EN CONTACTO\n"
                                + "CON EL ADMINISTRADOR PARA SOLICITAR UN REGISTRO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }else if((!(_user.getText()).equals(Usuario.Lista7[i]))||(!(_psswd.getText()).equals(Usuario.Lista5[i]))){
                        JOptionPane.showMessageDialog(Login.this,"EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
                                + "FAVOR REVISE SUS DATOS","ERROR",JOptionPane.WARNING_MESSAGE);
                        }
                }
            }
                
        }
    }
}
