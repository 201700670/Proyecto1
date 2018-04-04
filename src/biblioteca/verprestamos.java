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
public class verprestamos extends JFrame{
    private String [] encabezado={"Tipo","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Copias","Área","Categoría","ISBN","Ejemplares", "ID"};
    private Object [][]datos=new Object [0][13];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    private JButton devolver;
    private JButton regresar;
    private JButton Logout;
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    public verprestamos(){
        for (int i=1;i<Prestar.restandos;i++){
            if((String.valueOf(Prestar.prestados[i].id)).equals(Biblioteca.usuarioactual)&&!("").equals(Prestar.prestados[i].autor)){
                String []moslib={ String.valueOf(Prestar.prestados[i].tipo),Prestar.prestados[i].autor, String.valueOf(Prestar.prestados[i].ano), Prestar.prestados[i].titulo, 
                Prestar.prestados[i].descripcion,Prestar.prestados[i].palabras, String.valueOf(Prestar.prestados[i].edicion),
                Prestar.prestados[i].temas,String.valueOf(Prestar.prestados[i].copias)," "," ",String.valueOf(Prestar.prestados[i].isbn)," ",String.valueOf(Prestar.prestados[i].id)};
            creaciontabla.addRow(moslib);
System.out.println(i);
            }
        }
        for (int j=1;j<Prestar.restandos1;j++){
            if((String.valueOf(Prestar.prestados1[j].id)).equals(Biblioteca.usuarioactual)&&!("").equals(Prestar.prestados1[j].autor)){
                String[]mosrev={String.valueOf(Prestar.prestados1[j].tipo),Prestar.prestados1[j].autor, 
                    String.valueOf(Prestar.prestados1[j].ano),Prestar.prestados1[j].titulo,Prestar.prestados1[j].descripcion,
                    Prestar.prestados1[j].palabras, String.valueOf(Prestar.prestados1[j].edicion),
                    Prestar.prestados1[j].temas,String.valueOf(Prestar.prestados1[j].copias)," ",Prestar.prestados1[j].categoria,
                    " ",String.valueOf(Prestar.prestados1[j].ejemplares),String.valueOf(Prestar.prestados1[j].id)};
            creaciontabla.addRow(mosrev);
System.out.println(j);
            }
        }
        for (int k=1;k<Prestar.restandos2;k++){
            if((String.valueOf(Prestar.prestados2[k].id)).equals(Biblioteca.usuarioactual)&&!("").equals(Prestar.prestados2[k].autor)){
                String[]moste={String.valueOf(Prestar.prestados2[k].tipo),Prestar.prestados2[k].autor,
                String.valueOf(Prestar.prestados2[k].ano),Prestar.prestados2[k].titulo,Prestar.prestados2[k].descripcion,
                Prestar.prestados2[k].palabras,String.valueOf(Prestar.prestados2[k].edicion),Prestar.prestados2[k].temas,
                String.valueOf(Prestar.prestados2[k].copias),Prestar.prestados2[k].area," "," "," ",String.valueOf(Prestar.prestados2[k].id)};
            creaciontabla.addRow(moste);
System.out.println(k);
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
                    setTitle("LISTADO DE PRESTAMOS REALIZADOS");
        setLayout(null);
        devolver = new JButton("Devolver");
        devolver.setBounds(600, 70, 150, 30);
        
        regresar = new JButton("Regresar");
        regresar.setBounds(600, 110, 150, 30);
        
        Logout = new JButton("LogOut");
        Logout.setBounds(600, 150, 150, 30);
        
        add(devolver);
        add(regresar);
        add(Logout);
        
        Tratado manejo=new Tratado();
        devolver.addActionListener(manejo);
        regresar.addActionListener(manejo);
        Logout.addActionListener(manejo);
        
    }
    private class Tratado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==devolver){
                Devolver obj=new Devolver();
                obj.setVisible(true);
                
            }
            if(ae.getSource()==regresar){
                Prestamosgeneral obj= new Prestamosgeneral();
                obj.setVisible(true);
                dispose();
            }
            if(ae.getSource()==Logout){
                Login obj= new Login();
                obj.setVisible(true);
                dispose();
            }
        }

    }
}
