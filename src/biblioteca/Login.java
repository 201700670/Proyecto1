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
    private JButton principal;
    
    private ImageIcon imagen;
    
    private JPanel pnl;
    private JLabel pnlicon;
    public Login(){
        setLayout(null);
        setLocationRelativeTo(null);
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
        
        principal = new JButton("Principal");
        principal.setSize(dim);
        principal.setBounds(200, 450, 130, 30);
        
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
        add(principal);
        add(pnlicon);
        
        setSize(600,550);
        setVisible(true);
        Acciones manejo=new Acciones();
        logIn.addActionListener(manejo);
        logOut.addActionListener(manejo);
        principal.addActionListener(manejo);
    }
    private class Acciones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String arrayusuario[]=new String[10];
            String arraypsswd[]=new String[10];
            String usuarios12;
            String pasword;
            boolean prueba;
            boolean prueba2;
            boolean prueba3;
            if(ae.getSource()==principal){
                    Principal obj1=new Principal();
                    obj1.setVisible(true);
                    dispose();
                }
                if(ae.getSource()==logOut){
                    _user.setText(null);
                    _psswd.setText(null);
                }
           if(ae.getSource()==logIn){
               usuarios12=_user.getText();
               pasword=_psswd.getText();
                              System.out.println(usuarios12);
                              System.out.println(pasword);
                               Administrador.usuarios1[0]=new Datosusuario("admin","admin", "admin", "admin","admin", "admin");
               if(usuarios12.equals(Administrador.usuarios1[0].id)&& pasword.equals(Administrador.usuarios1[0].contrasena)){
                   AdministradorJF obj= new AdministradorJF();
                   obj.setVisible(true);
                   dispose();
               }else{
               
               
                for(int i=1;i<Administrador.personas1;i++){
                    
                    while((usuarios12.equals(Administrador.usuarios1[i].id)) && (pasword.equals(Administrador.usuarios1[i].contrasena))){
                        JOptionPane.showMessageDialog(Login.this,"BIENVENIDO","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                        Biblioteca.usuarioactual=Administrador.usuarios1[i].id;
                        System.out.println(Biblioteca.usuarioactual);
                        Usuarionormal obj= new Usuarionormal();
                        obj.setVisible(true);
                        dispose();
                        return;
                    }
                }
               for(int i=1;i<Administrador.personas1;i++){
                    while((!usuarios12.equals(Administrador.usuarios1[i].id)) || (!pasword.equals(Administrador.usuarios1[i].contrasena))){
                        JOptionPane.showMessageDialog(Login.this,"EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
                                + "FAVOR REVISE SUS DATOS","ERROR",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
               for(int i=0;i<Administrador.personas1;i++){
                    while((!usuarios12.equals(Administrador.usuarios1[i].id)) && (!pasword.equals(Administrador.usuarios1[i].contrasena))){
                        JOptionPane.showMessageDialog(Login.this,"EL USUARIO NO EXISTE, PONERSE EN CONTACTO\n"
                                + "CON EL ADMINISTRADOR PARA SOLICITAR UN REGISTRO","ERROR",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
           }    
        }
    }
}
