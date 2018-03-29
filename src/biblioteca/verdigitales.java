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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class verdigitales extends JFrame{
    private String [] encabezado={"No.","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Tamaño"};
    private Object [][]datos=new Object [0][8];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    private JButton eliminar;
    private JButton regresar;
    private JButton Logout;
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    public verdigitales(){
        for(int l=1;l<Agregar.sumandos;l++){
            String[]moslibdig={String.valueOf(l),Agregar.agregados[l].autor,String.valueOf(Agregar.agregados[l].ano),Agregar.agregados[l].titulo,Agregar.agregados[l].descripcion,Agregar.agregados[l].palabras,String.valueOf(Agregar.agregados[l].edicion),Agregar.agregados[l].temas,String.valueOf(Agregar.agregados[l].tamaño)};
            creaciontabla.addRow(moslibdig);
            if(Agregar.agregados[l].tamaño==0){
               creaciontabla.removeRow(1);
            }
        }
          add(usumos);
          usumos.setBounds(0,0,485,500);
             usumos.setSize(600, 800);
          JTable tabla=new JTable(creaciontabla);
                tabla.setSize(500,500);
                tabla.setPreferredScrollableViewportSize(new Dimension(500, 200));
                JScrollPane desplazamiento=new JScrollPane(tabla);
                usumos.add(desplazamiento,BorderLayout.SOUTH);
                    setSize(800,550);
                    setTitle("LISTADO DE LIBROS DIGITALES AGREGADOS");
        setLayout(null);
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(600, 70, 150, 30);
        
        regresar = new JButton("Regresar");
        regresar.setBounds(600, 110, 150, 30);
        
        Logout = new JButton("LogOut");
        Logout.setBounds(600, 150, 150, 30);
        
        add(eliminar);
        add(regresar);
        add(Logout);
        
        Tratado manejo=new Tratado();
        eliminar.addActionListener(manejo);
        regresar.addActionListener(manejo);
        Logout.addActionListener(manejo);
    }

    private class Tratado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==eliminar){
                Eliminar obj=new Eliminar();
                obj.setVisible(true);
            }
            if(ae.getSource()==regresar){
                Biblioteca_virtual obj= new Biblioteca_virtual();
                obj.setVisible(true);
                dispose();
            }
            if(ae.getSource()==Logout){
                Principal obj= new Principal();
                obj.setVisible(true);
                dispose();
            }
        }

    }
}
