/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Administrador extends JFrame {
    private JLabel userio;
    private JLabel bigrafos;
    private JLabel reporte;
    
    private JButton crearusuario;
    private JButton modificarusuario;
    private JButton eliminarusuario;
    private JButton mostrarusuario;
    private JButton crearbiblio;
    private JButton modificarbiblio;
    private JButton eliminadrbiblio;
    private JButton mostrarbiblio;
    private JButton reporteusuario;
    private JButton reportelibro;
    
    public static Datosusuario []usuarios1=new Datosusuario[10];
    public static int personas1=1;
    private String [] encabezado={ "No.","ID", "Nombre", "Apellido", "Usuario", "Rol", "Password"};
    private Object [][]datos=new Object [0][6];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    
    private ImageIcon imagen;
    
    private JPanel pnl;
    public Administrador(){
        
        for(int i=0;i<personas1;i++){
            String[]mosusu={String.valueOf(i),Administrador.usuarios1[i].id, Administrador.usuarios1[i].nombre,Administrador.usuarios1[i].apellido, Administrador.usuarios1[i].usuario, Administrador.usuarios1[i].rol,Administrador.usuarios1[i].contrasena};
            creaciontabla.addRow(mosusu);
        }
        
          add(usumos);
       
             
                JTable tabla=new JTable(creaciontabla);
                JScrollPane desplazamiento=new JScrollPane(tabla);
                usumos.add(desplazamiento,BorderLayout.SOUTH);
                    
                    setTitle("LISTADO DE USUARIOS REGISTRADOS");
            }
        }
    

