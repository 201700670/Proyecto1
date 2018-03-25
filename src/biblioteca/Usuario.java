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
public class Usuario extends JFrame {
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
    
    private JButton crear;
    private JButton cancelar;

    public Usuario(){
        
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("CREAR USUARIO");
        Dimension dim = new Dimension(200, 50);
        
        id = new JLabel("ID: ");
        id.setSize(dim);
        id.setBounds(50,30,200,50);
        
        nombre = new JLabel("Nombre: ");
        nombre.setSize(dim);
        nombre.setBounds(50,80,200,50);
        
        apellido = new JLabel("Apellido: ");
        apellido.setSize(dim);
        apellido.setBounds(50,130,200,50);
        
        usuario = new JLabel("Usuario: ");
        usuario.setSize(dim);
        usuario.setBounds(50,180,200,50);
        
        rol = new JLabel("Rol: ");
        rol.setSize(dim);
        rol.setBounds(50,230,200,50);
        
        contrasena = new JLabel("Contraseña: ");
        contrasena.setSize(dim);
        contrasena.setBounds(50,280,200,50);
        
        confcontrasena = new JLabel("Confirmar Contraseña: ");
        confcontrasena.setSize(dim);
        confcontrasena.setBounds(50,330,200,50);
        
        text_id = new JTextField();
        text_id.setSize(dim);
        text_id.setBounds(130,40,400,25);
        
        text_nombre = new JTextField();
        text_nombre.setSize(dim);
        text_nombre.setBounds(130,90,400,25);
        
        text_apellido = new JTextField();
        text_apellido.setSize(dim);
        text_apellido.setBounds(130,140,400,25);
        
        text_usuario = new JTextField();
        text_usuario.setSize(dim);
        text_usuario.setBounds(130,190,400,25);
        
        text_rol = new JTextField();
        text_rol.setSize(dim);
        text_rol.setBounds(130,240,400,25);
        
        pass_contrasena=new JPasswordField();
        pass_contrasena.setSize(dim);
        pass_contrasena.setBounds(130,290,400,25);
        
        pass_confcontrasena=new JPasswordField();
        pass_confcontrasena.setSize(dim);
        pass_confcontrasena.setBounds(190,340,340,25);
        
        crear = new JButton("Crear");
        crear.setSize(dim);
        crear.setBounds(130, 400, 100, 30);
        
        cancelar = new JButton("Cancelar");
        cancelar.setSize(dim);
        cancelar.setBounds(300, 400, 100, 30);
        
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
        add(crear);
        add(cancelar);
        
        setSize(600,500);
        setVisible(true);
        Control manejo=new Control();
        crear.addActionListener(manejo);
        cancelar.addActionListener(manejo);
    }
        private class Control implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==crear){
            String obnomb=text_nombre.getText();
            String obap=text_apellido.getText();
            String obusu=text_usuario.getText();
            String obrol=text_rol.getText();
            String obcon=pass_confcontrasena.getText();
            String obconf=pass_contrasena.getText();
            String obid=text_id.getText();
                            
                            if((pass_contrasena.getText()).equals(pass_confcontrasena.getText())){
                                if("".equals(obnomb)||"".equals(obap)||"".equals(obusu)||"".equals(obrol)||"".equals(obcon)||"".equals(obconf)||"".equals(obid)){
                                    JOptionPane.showMessageDialog(Usuario.this,"DEBE LLENAR TODOS LOS CAMPOS","ERROR",JOptionPane.WARNING_MESSAGE);
                                }
                                Administrador.usuarios1[Administrador.personas1]=new Datosusuario(obnomb, obap, obusu, obrol, obid, obconf);
                                
                               for(int persona1=1;persona1<Administrador.personas1;persona1++){
                                   while((Administrador.usuarios1[Administrador.personas1].id).equals((Administrador.usuarios1[persona1].id))){
                                       JOptionPane.showMessageDialog(Usuario.this,"YA EXISTE UN USUARIO CON ESE ID, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                                       return;
                                   }
                               }
                               Administrador.personas1++;
                                System.out.println(Administrador.personas1);
                               JOptionPane.showMessageDialog(Usuario.this,"USUARIO CREADO EXITOSAMENTE","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                               text_nombre.setText("");
                               text_apellido.setText("");
                               text_id.setText("");
                               text_usuario.setText("");
                               text_rol.setText("");
                               pass_confcontrasena.setText("");
                               pass_contrasena.setText("");
                            }else{
                               JOptionPane.showMessageDialog(Usuario.this,"CONTRASEÑAS NO COINCIDEN","ERROR",JOptionPane.WARNING_MESSAGE); 
                            }
                                
                        }
                
                if(ae.getSource()==cancelar){
                    dispose();
                }
                
            }
        }
}

