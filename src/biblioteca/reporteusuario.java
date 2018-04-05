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
public class reporteusuario extends JFrame{
    private String [] encabezado={"Tipo","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Copias","Área","Categoría","ISBN","Ejemplares", "ID-Usuario"};
    private Object [][]datos=new Object [0][13];
    private JPanel usumos= new JPanel();
    DefaultTableModel usuariotabal;
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    public reporteusuario(){
        for (int i=1;i<Prestar.restandos;i++){
            if(!("").equals(Prestar.prestados[i].autor)){
        String []moslib={ String.valueOf(Prestar.prestados[i].tipo),Prestar.prestados[i].autor, String.valueOf(Prestar.prestados[i].ano), Prestar.prestados[i].titulo, 
                Prestar.prestados[i].descripcion,Prestar.prestados[i].palabras, String.valueOf(Prestar.prestados[i].edicion),
                Prestar.prestados[i].temas,String.valueOf(Prestar.prestados[i].copias)," "," ",String.valueOf(Prestar.prestados[i].isbn)," ",
                String.valueOf(Prestar.prestados[i].id)};
            creaciontabla.addRow(moslib);
System.out.println(i);
            }
        }
        for (int j=1;j<Prestar.restandos1;j++){
            if(!("").equals(Prestar.prestados1[j].autor)){
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
            if(!("").equals(Prestar.prestados2[k].autor)){
            String[]moste={String.valueOf(Prestar.prestados2[k].tipo),Prestar.prestados2[k].autor,
                String.valueOf(Prestar.prestados2[k].ano),Prestar.prestados2[k].titulo,Prestar.prestados2[k].descripcion,
                Prestar.prestados2[k].palabras,String.valueOf(Prestar.prestados2[k].edicion),Prestar.prestados2[k].temas,
                String.valueOf(Prestar.prestados2[k].copias),Prestar.prestados2[k].area," "," "," ",String.valueOf(Prestar.prestados2[k].id)};
            creaciontabla.addRow(moste);
System.out.println(k);
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
                    setTitle("REPORTES DE USUARIOS");
    }
    
}
