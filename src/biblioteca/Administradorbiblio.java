/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import static biblioteca.Administrador.personas1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Administradorbiblio extends JFrame{
    public static Libros[]libros=new Libros[10];
    public static Revistas[]revistas=new Revistas[10];
    public static Tesis[]tesis=new Tesis[10];
    public static Librodigital[]librodigital=new Librodigital[10];
    public static int personas=1;
    public static int personas2=1;
    public static int personas3=1;
    public static int personas4=1;
    private String [] encabezado={"Tipo","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Copias","Área","Categoría","ISBN","Ejemplares", "Tamaño"};
    private Object [][]datos=new Object [0][13];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    public void contador(){
    for(int i = 0; i<libros.length; i++){
            libros[i] = null;
        }
        for(int j=0; j<revistas.length;j++){
            revistas[j] = null;
        }
        for(int k=0; k<tesis.length;k++){
            tesis [k] = null;
        }
        for(int k=0; k<librodigital.length;k++){
            librodigital [k] = null;
        }
}
    public Administradorbiblio(){
        setLayout(null);
       for(int i=1;i<personas;i++){
           if(!("").equals(Administradorbiblio.libros[i].autor)){
            String[]moslib={ String.valueOf(Administradorbiblio.libros[i].tipo),Administradorbiblio.libros[i].autor, String.valueOf(Administradorbiblio.libros[i].ano), Administradorbiblio.libros[i].titulo, Administradorbiblio.libros[i].descripcion, Administradorbiblio.libros[i].palabras, String.valueOf(Administradorbiblio.libros[i].edicion),Administradorbiblio.libros[i].temas,String.valueOf(Administradorbiblio.libros[i].copias)," "," ",String.valueOf(Administradorbiblio.libros[i].isbn)," ", " "};
            creaciontabla.addRow(moslib);
           }
        }
        for(int j=1;j<personas2;j++){
            if(!("").equals(Administradorbiblio.revistas[j].autor)){
            String[]mosrev={String.valueOf(Administradorbiblio.revistas[j].tipo),Administradorbiblio.revistas[j].autor, String.valueOf(Administradorbiblio.revistas[j].ano), Administradorbiblio.revistas[j].titulo, Administradorbiblio.revistas[j].descripcion, Administradorbiblio.revistas[j].palabras, String.valueOf(Administradorbiblio.revistas[j].edicion),Administradorbiblio.revistas[j].temas,String.valueOf(Administradorbiblio.revistas[j].copias)," ",Administradorbiblio.revistas[j].categoria," ",String.valueOf(Administradorbiblio.revistas[j].ejemplares), " "};
            creaciontabla.addRow(mosrev);
            }
        }
        for(int k=1;k<personas3;k++){
            if(!("").equals(Administradorbiblio.tesis[k].autor)){
            String[]moste={String.valueOf(Administradorbiblio.tesis[k].tipo),Administradorbiblio.tesis[k].autor,String.valueOf(Administradorbiblio.tesis[k].ano),Administradorbiblio.tesis[k].titulo, Administradorbiblio.tesis[k].descripcion,Administradorbiblio.tesis[k].palabras,String.valueOf(Administradorbiblio.tesis[k].edicion),Administradorbiblio.tesis[k].temas,String.valueOf(Administradorbiblio.tesis[k].copias),Administradorbiblio.tesis[k].area," "," "," ", " "};
            creaciontabla.addRow(moste);
            }
        }
        for(int l=1;l<personas4;l++){
            if(!("").equals(Administradorbiblio.librodigital[l].autor)){
            String[]moslibdig={" ",Administradorbiblio.librodigital[l].autor,String.valueOf(Administradorbiblio.librodigital[l].ano),Administradorbiblio.librodigital[l].titulo,Administradorbiblio.librodigital[l].descripcion,Administradorbiblio.librodigital[l].palabras,String.valueOf(Administradorbiblio.librodigital[l].edicion),Administradorbiblio.librodigital[l].temas," "," "," "," "," ",String.valueOf(Administradorbiblio.librodigital[l].tamaño)};
            creaciontabla.addRow(moslibdig);
            }
        }
          add(usumos);
       usumos.setBounds(10,0,600,600);
             usumos.setSize(950, 800);
                JTable tabla=new JTable(creaciontabla);
                tabla.setSize(500,500);
                tabla.setPreferredScrollableViewportSize(new Dimension(900, 200));
                JScrollPane desplazamiento=new JScrollPane(tabla);
                usumos.add(desplazamiento,BorderLayout.SOUTH);
                    setSize(1000,300);
                    setTitle("LISTADO DE BIBLIOTECA");
                    
    }
    
}
