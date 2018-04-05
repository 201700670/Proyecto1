/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

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
public class existencias extends JFrame{
    private String [] encabezado={"Tipo","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Copias","Área","Categoría","ISBN","Ejemplares","Disponibles"};
    private Object [][]datos=new Object [0][9];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    public existencias(){
        setLayout(null);
        for(int i=1;i<Administradorbiblio.personas;i++){
            String[]moslib={ String.valueOf(Administradorbiblio.libros[i].tipo),Administradorbiblio.libros[i].autor, String.valueOf(Administradorbiblio.libros[i].ano), Administradorbiblio.libros[i].titulo, Administradorbiblio.libros[i].descripcion, Administradorbiblio.libros[i].palabras, String.valueOf(Administradorbiblio.libros[i].edicion),Administradorbiblio.libros[i].temas,String.valueOf(Administradorbiblio.libros[i].copias)," "," ",String.valueOf(Administradorbiblio.libros[i].isbn)," ",String.valueOf(Administradorbiblio.libros[i].disponibles())};
            creaciontabla.addRow(moslib);
        }
        for(int j=1;j<Administradorbiblio.personas2;j++){
            String[]mosrev={String.valueOf(Administradorbiblio.revistas[j].tipo),Administradorbiblio.revistas[j].autor, String.valueOf(Administradorbiblio.revistas[j].ano), Administradorbiblio.revistas[j].titulo, Administradorbiblio.revistas[j].descripcion, Administradorbiblio.revistas[j].palabras, String.valueOf(Administradorbiblio.revistas[j].edicion),Administradorbiblio.revistas[j].temas,String.valueOf(Administradorbiblio.revistas[j].copias)," ",Administradorbiblio.revistas[j].categoria," ",String.valueOf(Administradorbiblio.revistas[j].ejemplares),String.valueOf(Administradorbiblio.revistas[j].disponibles())};
            creaciontabla.addRow(mosrev);
        }
        for(int k=1;k<Administradorbiblio.personas3;k++){
            String[]moste={String.valueOf(Administradorbiblio.tesis[k].tipo),Administradorbiblio.tesis[k].autor,String.valueOf(Administradorbiblio.tesis[k].ano),Administradorbiblio.tesis[k].titulo, Administradorbiblio.tesis[k].descripcion,Administradorbiblio.tesis[k].palabras,String.valueOf(Administradorbiblio.tesis[k].edicion),Administradorbiblio.tesis[k].temas,String.valueOf(Administradorbiblio.tesis[k].copias),Administradorbiblio.tesis[k].area," "," "," ",String.valueOf(Administradorbiblio.tesis[k].disponibles())};
            creaciontabla.addRow(moste);
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
                    setTitle("REPORTE DE LIBROS EN EXISTENCIA");
    }
}

