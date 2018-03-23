/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Jtable1 extends JFrame{
    private JFrame ventana;
    private JTable tabla;
    
    
    private String [] encabezado={ "ID", "Nombre", "Apellido", "Usuario", "Rol", "Contraseña"};
    private String [][]datos=new String [0][5];
    JPanel mostrarusuarios=new JPanel();
    
    DefaultTableModel usuariotabal;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    
    public Jtable1() {
        for(int i=0;i<Administrador.personas1;i++){
            String[]mosusu={Administrador.usuarios1[i].id, Administrador.usuarios1[i].nombre,Administrador.usuarios1[i].apellido, Administrador.usuarios1[i].usuario, Administrador.usuarios1[i].rol,Administrador.usuarios1[i].contrasena};
            creaciontabla.addRow(mosusu);
        }
          add(mostrarusuarios);
          JTable tabla=new JTable(creaciontabla);
                JScrollPane desplazamiento=new JScrollPane(tabla);
                mostrarusuarios.add(desplazamiento,BorderLayout.SOUTH);
    }
//    public void setTable(){
//        for(int i=0;i<Administrador.personas1;i++){
//            
//        }
//        tabla=new JTable (datos,encabezado);
//        JScrollPane mov= new JScrollPane();
//        mov.setPreferredSize(new Dimension(400,500));
//        ventana.add(mov);
//    }
//     public static void main(String[] args) {
////        Principal obj=new Principal();
//        
//        Jtable1 table=new Jtable1();
////        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);//se utiliza para salir por medio del ícono "x"
////        obj.setLocationRelativeTo(null);
//    }
}
