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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Modificar_usuarios extends JFrame{
    public JLabel id;
    public JLabel nombre;
    public JLabel apellido;
    public JLabel usuario;
    public JLabel rol;
    public JLabel contrasena;
    public JLabel confcontrasena;
    
    public static JTextField text_id;
    public static JTextField text_nombre;
    public static JTextField text_apellido;
    public static JTextField text_usuario;
    public static JTextField text_rol;
    
    public JPasswordField pass_contrasena;
    public JPasswordField pass_confcontrasena;
    
    private JButton modificar;
    private JButton cancel;
    private JButton buscar;
    
    public Modificar_usuarios(){
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
        
        text_apellido = new JTextField();
        text_apellido.setSize(dim);
        text_apellido.setBounds(130,140,300,25);
        
        text_usuario = new JTextField();
        text_usuario.setSize(dim);
        text_usuario.setBounds(130,190,300,25);
        
        text_rol = new JTextField();
        text_rol.setSize(dim);
        text_rol.setBounds(130,240,300,25);
        
        pass_contrasena=new JPasswordField();
        pass_contrasena.setSize(dim);
        pass_contrasena.setBounds(130,290,300,25);
        
        pass_confcontrasena=new JPasswordField();
        pass_confcontrasena.setSize(dim);
        pass_confcontrasena.setBounds(190,340,240,25);
        
        modificar = new JButton("Modificar");
        modificar.setSize(dim);
        modificar.setBounds(130, 400, 100, 30);
        
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
        add(modificar);
        add(cancel);
        add(buscar);
        
        Modificar manejo=new Modificar();
        buscar.addActionListener(manejo);
        modificar.addActionListener(manejo);
        cancel.addActionListener(manejo);
        
        setSize(600,500);
        setVisible(true);
    }

    private class Modificar implements ActionListener {
        private String obnomb,obap,obusu,obrol,obcon,obconf,obid;
        private int contador;
        @Override
        public void actionPerformed(ActionEvent ae) {
            String usuarios;
            boolean probar=true;
            boolean prueba2;
            
//                obnomb=text_nombre.getText();
//                obap=text_apellido.getText();
//                obusu=text_usuario.getText();
//                obrol=text_rol.getText();
//                obcon=pass_contrasena.getText();
//                obconf=pass_confcontrasena.getText();
                if(ae.getSource()==buscar){
                    contador=0;
                    usuarios=text_id.getText();
                    for (int i=1;i<Administrador.personas1;i++){
                        
                        if(usuarios.equals(Administrador.usuarios1[i].id)){
                            contador=contador+i;
                            System.out.println(contador);
                            obnomb=Administrador.usuarios1[contador].nombre;
                            text_nombre.setText(obnomb);
                            obap=Administrador.usuarios1[contador].apellido;
                            text_apellido.setText(obap);
                            obusu=Administrador.usuarios1[contador].usuario;
                            text_usuario.setText(obusu);
                            obrol=Administrador.usuarios1[contador].rol;
                            text_rol.setText(obrol);
                            obcon=Administrador.usuarios1[contador].contrasena;
                            pass_contrasena.setText(obcon);
                            obconf=Administrador.usuarios1[contador].contrasena;
                            pass_confcontrasena.setText(obconf);
                            probar=false;
                            i=Administrador.personas1;
                        }
                    }
                    
                    if(probar){
                        JOptionPane.showMessageDialog(null,"EL USUARIO NO EXISTE","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                }
            if(ae.getSource()==modificar){
                if((pass_contrasena.getText()).equals(pass_confcontrasena.getText())){
                    obnomb=text_nombre.getText();
                    Administrador.usuarios1[contador].nombre=obnomb;
                    obap=text_apellido.getText();
                     Administrador.usuarios1[contador].apellido=obap;
                    obusu=text_usuario.getText();
                    Administrador.usuarios1[contador].usuario=obusu;
                    obrol=text_rol.getText();
                    Administrador.usuarios1[contador].rol=obrol;
                    obid=text_id.getText();
                    Administrador.usuarios1[contador].id=obid;
                    obcon=pass_contrasena.getText();
                    Administrador.usuarios1[contador].contrasena=obcon;
                    obconf=pass_confcontrasena.getText();
                    Administrador.usuarios1[contador].contrasena=obconf;
                
                    
                 
                }else{
                    JOptionPane.showMessageDialog(Modificar_usuarios.this,"CONTRASEÑAS NO COINCIDEN","ERROR",JOptionPane.WARNING_MESSAGE); 
                }
                text_nombre.setText(null);
                    text_apellido.setText(null);
                    text_id.setText(null);
                    text_usuario.setText(null);
                    text_rol.setText(null);
                    pass_confcontrasena.setText(null);
                    pass_contrasena.setText(null);
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        
    }
    
}
}
