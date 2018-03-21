/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Eliminar_usuarios extends JFrame{
    public JLabel id;
    public JLabel nombre;
    public JLabel apellido;
    public JLabel usuario;
    public JLabel rol;
    public JLabel contrasena;
    public JLabel confcontrasena;
    
    public JTextField text_id;
    public JTextField text_nombre;
    public JTextField text_apellido;
    public JTextField text_usuario;
    public JTextField text_rol;
    
    public JPasswordField pass_contrasena;
    public JPasswordField pass_confcontrasena;
    
    private JButton eliminar;
    private JButton cancel;
    private JButton buscar;
    public Eliminar_usuarios(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("MODIFICAR USUARIOS");
        Dimension dim = new Dimension(200, 50);
        
        id = new JLabel("ID: ");
        id.setSize(dim);
        id.setBounds(50,30,300,50);
        
        nombre = new JLabel("Nombre: ");
        nombre.setSize(dim);
        nombre.setBounds(50,80,300,50);
        
        apellido = new JLabel("Apellido: ");
        apellido.setSize(dim);
        apellido.setBounds(50,130,300,50);
        
        usuario = new JLabel("Usuario: ");
        usuario.setSize(dim);
        usuario.setBounds(50,180,300,50);
        
        rol = new JLabel("Rol: ");
        rol.setSize(dim);
        rol.setBounds(50,230,200,50);
        
        contrasena = new JLabel("Contraseña: ");
        contrasena.setSize(dim);
        contrasena.setBounds(50,280,300,50);
        
        confcontrasena = new JLabel("Confirmar Contraseña: ");
        confcontrasena.setSize(dim);
        confcontrasena.setBounds(50,330,300,50);
        
        text_id = new JTextField();
        text_id.setSize(dim);
        text_id.setBounds(130,40,300,25);
        
        text_nombre = new JTextField();
        text_nombre.setSize(dim);
        text_nombre.setBounds(130,90,300,25);
        text_nombre.setEnabled(false);
        
        text_apellido = new JTextField();
        text_apellido.setSize(dim);
        text_apellido.setBounds(130,140,300,25);
        text_apellido.setEnabled(false);
        
        text_usuario = new JTextField();
        text_usuario.setSize(dim);
        text_usuario.setBounds(130,190,300,25);
        text_usuario.setEnabled(false);
        
        text_rol = new JTextField();
        text_rol.setSize(dim);
        text_rol.setBounds(130,240,300,25);
        text_rol.setEnabled(false);
        
        pass_contrasena=new JPasswordField();
        pass_contrasena.setSize(dim);
        pass_contrasena.setBounds(130,290,300,25);
        pass_contrasena.setEnabled(false);
        
        pass_confcontrasena=new JPasswordField();
        pass_confcontrasena.setSize(dim);
        pass_confcontrasena.setBounds(190,340,240,25);
        pass_confcontrasena.setEnabled(false);
        
        eliminar = new JButton("Eliminar");
        eliminar.setSize(dim);
        eliminar.setBounds(130, 400, 100, 30);
        
        cancel = new JButton("Cancelar");
        cancel.setSize(dim);
        cancel.setBounds(300, 400, 100, 30);
        
        buscar = new JButton("Buscar");
        buscar.setSize(dim);
        buscar.setBounds(450,40,100,25);
        
        add(id);
        add(nombre);
        add(apellido);
        add(usuario);
        add(rol);
        add(contrasena);
        add(confcontrasena);
        add(text_id);
        add(text_nombre);
        add(text_apellido);
        add(text_usuario);
        add(text_rol);
        add(pass_contrasena);
        add(pass_confcontrasena);
        add(eliminar);
        add(cancel);
        add(buscar);
        
        Acciones manejo=new Acciones();
        buscar.addActionListener(manejo);
        eliminar.addActionListener(manejo);
        cancel.addActionListener(manejo);
        
        setSize(600,500);
        setVisible(true);
    }

    private class Acciones implements ActionListener{
        String obnomb,obap,obusu,obrol,obcon,obconf,obid;
        @Override
        public void actionPerformed(ActionEvent ae) {
            String arrayusuario[]=new String[10];
            String usuarios;
            boolean probar;
            boolean prueba2;
            int contador=0;
                obnomb=text_nombre.getText();
                obap=text_apellido.getText();
                obusu=text_usuario.getText();
                obrol=text_rol.getText();
                obcon=pass_contrasena.getText();
                obconf=pass_confcontrasena.getText();
                if(ae.getSource()==buscar){
                    for(int j=0;j<arrayusuario.length;j++){
                    usuarios=text_id.getText();
                    arrayusuario[j]=usuarios;
                    }
                    for(int i=0;i<10;i++){
                        if(((arrayusuario[i]).equals(Usuario.Lista7[i]))){
                            contador=i;
                            probar=true;
                        }
//                        else if((!(Usuario.Lista7[i].equals(arrayusuario[i])))){
//                        prueba2=true;
//                    }
                    }
                    if(probar=true){
                            obnomb=Usuario.Lista[contador];
                            text_nombre.setText(obnomb);
                            obap=Usuario.Lista2[contador];
                            text_apellido.setText(obap);
                            obusu=Usuario.Lista3[contador];
                            text_usuario.setText(obusu);
                            obrol=Usuario.Lista4[contador];
                            text_rol.setText(obrol);
                            obcon=Usuario.Lista5[contador];
                            pass_contrasena.setText(obcon);
                            obconf=Usuario.Lista6[contador];
                            pass_confcontrasena.setText(obconf);
                            obid=Usuario.Lista7[contador];
                            text_id.setText(obid);
                    }
//                    else if(prueba2=true){
//                        JOptionPane.showMessageDialog(null,"EL USUARIO NO EXISTE","ERROR",JOptionPane.WARNING_MESSAGE);
//                    }
                }
            if(ae.getSource()==eliminar){
                for(int i=0;i<Usuario.Lista.length;i++){
                    text_nombre.setText(null);
                    obnomb=text_nombre.getText();
                    Usuario.Lista[i]=obnomb;
                }
                for(int j=0; j<Usuario.Lista2.length;j++){
                    
                    obap=text_apellido.getText();
                     Usuario.Lista2[j]=obap;
                }
                for(int k=0; k<Usuario.Lista3.length;k++){
                    obusu=text_usuario.getText();
                    Usuario.Lista3[k]=obusu;
                }
                for(int l=0; l<Usuario.Lista4.length;l++){
                    obrol=text_rol.getText();
                    Usuario.Lista4[l]=obrol;
                }
                for(int o=0; o<Usuario.Lista7.length;o++){
                    obid=text_id.getText();
                    Usuario.Lista7[o]=obid;
                }
                for(int m=0; m<Usuario.Lista5.length;m++){
                    obcon=pass_contrasena.getText();
                    Usuario.Lista5[m]=obcon;
                }
                for(int n=0; n<Usuario.Lista6.length;n++){
                    obconf=pass_confcontrasena.getText();
                    Usuario.Lista6[n]=obconf;
                }
                 if((pass_contrasena.getText()).equals(pass_confcontrasena.getText())){
                }else{
                    JOptionPane.showMessageDialog(Eliminar_usuarios.this,"CONTRASEÑAS NO COINCIDEN","ERROR",JOptionPane.WARNING_MESSAGE); 
                }
                 dispose();
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        }
        }
    }

