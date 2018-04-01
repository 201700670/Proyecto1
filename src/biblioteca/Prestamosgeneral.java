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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Prestamosgeneral extends JFrame {
    private JLabel user;
    private JLabel psswd;
    private JLabel filtro;
    
    private JTextField busqueda;
    
    public JComboBox combo_tipoatr;
    public JComboBox combo_tipo;
    
    private JButton regresar;
    private JButton logOut;
    private JButton filtrar;
    private JButton buscar;
    private JButton prestar;
    private JButton ver;
    private JButton existencias;
    
    private ImageIcon imagen;
    private ImageIcon imagen2;

    private JLabel pnlicon;
    private JLabel logo;
    
    
    private String [] encabezado={"Tipo","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Copias","Área","Categoría","ISBN","Ejemplares"};
    private Object [][]datos=new Object [0][8];
    private Object [][]datos1=new Object [0][8];
    private JPanel usumos= new JPanel();
    private JPanel usumos1= new JPanel();
    private JPanel usumos2= new JPanel();
    private JPanel usumos3= new JPanel();
    private JPanel usumos4= new JPanel();
    DefaultTableModel usuariotabal;
    DefaultTableModel usuariotaba2;
    DefaultTableModel usuariotaba3;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    DefaultTableModel creaciontabla1=new DefaultTableModel(datos1,encabezado);
    DefaultTableModel creaciontabla2=new DefaultTableModel(datos,encabezado);
    DefaultTableModel creaciontabla3=new DefaultTableModel(datos,encabezado);
    DefaultTableModel creaciontabla4=new DefaultTableModel(datos,encabezado);
    
    public Prestamosgeneral(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("BIBLIOTECA VIRTUAL");
        Dimension dim = new Dimension(200, 50);
        Dimension dim2 = new Dimension(400, 50);
        
        user = new JLabel("Logo");
        user.setSize(dim);
        user.setBounds(20,30,200,50);
      
        psswd = new JLabel("Usuario");
        psswd.setSize(dim);
        psswd.setBounds(400,30,200,50);
        
        regresar = new JButton("Regresar");
        regresar.setSize(dim);
        regresar.setBounds(600, 120, 150, 30);
        
        logOut = new JButton("LogOut");
        logOut.setSize(dim);
        logOut.setBounds(600, 70, 150, 30);
        
        filtrar = new JButton("Filtrar");
        filtrar.setSize(dim);
        filtrar.setBounds(610,300, 100, 30);
        
        prestar= new JButton("Prestar");
        prestar.setSize(dim);
        prestar.setBounds(630,400, 120, 30);
        
        buscar = new JButton("Buscar");
        buscar.setSize(dim);
        buscar.setBounds(320,300, 150, 30);
        
        existencias = new JButton("Reporte exitencias");
        existencias.setSize(dim);
        existencias.setBounds(50,300, 150, 30);
        
        ver = new JButton("Ver préstamos");
        ver.setSize(dim);
        ver.setBounds(50,250, 150, 30);
        
        busqueda = new JTextField();
        busqueda.setSize(dim);
        busqueda.setBounds(320,220, 150, 30);
        
        combo_tipoatr= new JComboBox();
        combo_tipoatr.setSize(dim);
        combo_tipoatr.setBounds(300,260,200,25);
        combo_tipoatr.addItem("Autor");
        combo_tipoatr.addItem("Año publicado");
        combo_tipoatr.addItem("Título");
        combo_tipoatr.addItem("Edición");
        combo_tipoatr.addItem("Palabras clave");
        combo_tipoatr.addItem("Descripción");
        combo_tipoatr.addItem("Temas");
        combo_tipoatr.addItem("Copias");
        combo_tipoatr.addItem("Área");
        combo_tipoatr.addItem("Categoría");
        combo_tipoatr.addItem("ISBN");
        combo_tipoatr.addItem("Ejemplares");
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(570,260,180,25);
        combo_tipo.addItem("Libros");
        combo_tipo.addItem("Revistas");
        combo_tipo.addItem("Tesis");
        
        imagen = new ImageIcon(getClass().getResource("persona.jpg"));
        imagen2 = new ImageIcon(getClass().getResource("usac.png"));
        
        pnlicon=new JLabel();
        pnlicon.setSize(50,50);
        pnlicon.setBounds(400, 70, 150, 150);
        pnlicon.setIcon(imagen);
        
        logo=new JLabel();
        logo.setSize(50,50);
        logo.setBounds(20, 70, 350, 127);
        logo.setIcon(imagen2);
        
      
        add(user);
        add(psswd);
        add(regresar);
        add(logOut);
        add(buscar);
        add(filtrar);
        add(pnlicon);
        add(logo);
        add(combo_tipoatr);
        add(combo_tipo);
        add(busqueda);
        add(prestar);
        add(existencias);
        add(ver);
        
        Tratar manejo=new Tratar();
        filtrar.addActionListener(manejo);
        logOut.addActionListener(manejo);
        buscar.addActionListener(manejo);
        regresar.addActionListener(manejo);
        prestar.addActionListener(manejo);
        
        setSize(800,600);
        setVisible(true);
        
    }

    private class Tratar implements ActionListener{
        String obusqueda,obusqueda1;
        int con1,con2,con3,con4,con5,con6,con7,con8;
        boolean probar=true;
        @Override
        public void actionPerformed(ActionEvent ae) {
            obusqueda=busqueda.getText();
            obusqueda1=busqueda.getText();
            String valorComboBox = "";
            valorComboBox = combo_tipoatr.getSelectedItem().toString();
            String valorComboBox1 = "";
            valorComboBox1 = combo_tipo.getSelectedItem().toString();
            
            if(ae.getSource()==buscar){
                ///////////////////////////DATOS DE LIBRO EN BUSQUEDA
                if("Autor".equals(valorComboBox)||"Año publicado".equals(valorComboBox)||"Título".equals(valorComboBox)||"Edición".equals(valorComboBox)||"Palabras clave".equals(valorComboBox)||"Descripción".equals(valorComboBox)||"Temas".equals(valorComboBox)||"Copias".equals(valorComboBox)||"ISBN".equals(valorComboBox)){
                    for (int i=1;i<Administradorbiblio.personas;i++){
                        con1=0;
                        if(obusqueda.equals(Administradorbiblio.libros[i].autor)||obusqueda.equals(Administradorbiblio.libros[i].ano)||obusqueda.equals(Administradorbiblio.libros[i].titulo)||obusqueda.equals(Administradorbiblio.libros[i].edicion)||obusqueda.equals(Administradorbiblio.libros[i].palabras)||obusqueda.equals(Administradorbiblio.libros[i].descripcion)||obusqueda.equals(Administradorbiblio.libros[i].temas)||obusqueda.equals(Administradorbiblio.libros[i].copias)||obusqueda.equals(Administradorbiblio.libros[i].isbn)){
                            con1=con1+i;
                            System.out.println(con1);
                            String[]moslib={ String.valueOf(Administradorbiblio.libros[i].tipo),Administradorbiblio.libros[i].autor, String.valueOf(Administradorbiblio.libros[i].ano), Administradorbiblio.libros[i].titulo, Administradorbiblio.libros[i].descripcion, Administradorbiblio.libros[i].palabras, String.valueOf(Administradorbiblio.libros[i].edicion),Administradorbiblio.libros[i].temas,String.valueOf(Administradorbiblio.libros[i].copias)," "," ",String.valueOf(Administradorbiblio.libros[i].isbn)," ", " "};
                            creaciontabla.addRow(moslib);
                            add(usumos);
                            usumos.setBounds(55,350,400,200);
                            usumos.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla);
//                            creaciontabla.fireTableDataChanged();
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                            usumos.repaint();
                        }
                    }
                    busqueda.setText(null);
                }
                ///////////////////////////DATOS DE REVISTA EN BUSQUEDA
                if("Autor".equals(valorComboBox)||"Año publicado".equals(valorComboBox)||"Título".equals(valorComboBox)||"Edición".equals(valorComboBox)||"Palabras clave".equals(valorComboBox)||"Descripción".equals(valorComboBox)||"Temas".equals(valorComboBox)||"Copias".equals(valorComboBox)||"Categoría".equals(valorComboBox)||"Ejemplares".equals(valorComboBox)){
                    for (int j=1;j<Administradorbiblio.personas2;j++){
                        con1=0;
                        if(obusqueda.equals(Administradorbiblio.revistas[j].autor)||obusqueda.equals(Administradorbiblio.revistas[j].ano)||obusqueda.equals(Administradorbiblio.revistas[j].titulo)||obusqueda.equals(Administradorbiblio.revistas[j].edicion)||obusqueda.equals(Administradorbiblio.revistas[j].palabras)||obusqueda.equals(Administradorbiblio.revistas[j].descripcion)||obusqueda.equals(Administradorbiblio.revistas[j].temas)||obusqueda.equals(Administradorbiblio.revistas[j].copias)||obusqueda.equals(Administradorbiblio.revistas[j].categoria)||obusqueda.equals(Administradorbiblio.revistas[j].ejemplares)){
                            con1=con1+j;
                            System.out.println(con1);
                            String[]mosrev={String.valueOf(Administradorbiblio.revistas[j].tipo),Administradorbiblio.revistas[j].autor, String.valueOf(Administradorbiblio.revistas[j].ano), Administradorbiblio.revistas[j].titulo, Administradorbiblio.revistas[j].descripcion, Administradorbiblio.revistas[j].palabras, String.valueOf(Administradorbiblio.revistas[j].edicion),Administradorbiblio.revistas[j].temas,String.valueOf(Administradorbiblio.revistas[j].copias)," ",Administradorbiblio.revistas[j].categoria," ",String.valueOf(Administradorbiblio.revistas[j].ejemplares), " "};
                            creaciontabla.addRow(mosrev);
                            add(usumos);
                            usumos.setBounds(55,350,400,200);
                            usumos.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla);
//                            creaciontabla.fireTableDataChanged();
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                        }
                    }
                    busqueda.setText(null);
                }
                ///////////////////////////DATOS DE TESIS EN BUSQUEDA
                if("Tesis".equals(valorComboBox)){
                        for (int k=1;k<Administradorbiblio.personas3;k++){
                        con1=0;
                        if(obusqueda.equals(Administradorbiblio.tesis[k].autor)||obusqueda.equals(Administradorbiblio.tesis[k].ano)||obusqueda.equals(Administradorbiblio.tesis[k].titulo)||obusqueda.equals(Administradorbiblio.tesis[k].edicion)||obusqueda.equals(Administradorbiblio.tesis[k].palabras)||obusqueda.equals(Administradorbiblio.tesis[k].descripcion)||obusqueda.equals(Administradorbiblio.tesis[k].temas)||obusqueda.equals(Administradorbiblio.tesis[k].copias)||obusqueda.equals(Administradorbiblio.tesis[k].area)){
                            con1=con1+k;
                            System.out.println(con1);
                            String[]moste={String.valueOf(Administradorbiblio.tesis[k].tipo),Administradorbiblio.tesis[k].autor,String.valueOf(Administradorbiblio.tesis[k].ano),Administradorbiblio.tesis[k].titulo, Administradorbiblio.tesis[k].descripcion,Administradorbiblio.tesis[k].palabras,String.valueOf(Administradorbiblio.tesis[k].edicion),Administradorbiblio.tesis[k].temas,String.valueOf(Administradorbiblio.tesis[k].copias),Administradorbiblio.tesis[k].area," "," "," ", " "};
                            creaciontabla.addRow(moste);
                            add(usumos);
                            usumos.setBounds(55,350,400,200);
                            usumos.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla);
//                            creaciontabla.fireTableDataChanged();
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                        }
                    }
                    busqueda.setText(null);
                }
                  
                /////////////////////////////MUESTRA TODOS LOS DATOS 
                for(int i=1;i<Administradorbiblio.personas;i++){
            String[]moslib={ String.valueOf(Administradorbiblio.libros[i].tipo),Administradorbiblio.libros[i].autor, String.valueOf(Administradorbiblio.libros[i].ano), Administradorbiblio.libros[i].titulo, Administradorbiblio.libros[i].descripcion, Administradorbiblio.libros[i].palabras, String.valueOf(Administradorbiblio.libros[i].edicion),Administradorbiblio.libros[i].temas,String.valueOf(Administradorbiblio.libros[i].copias)," "," ",String.valueOf(Administradorbiblio.libros[i].isbn)," ", " "};
            creaciontabla1.addRow(moslib);
        }
        for(int j=1;j<Administradorbiblio.personas2;j++){
            String[]mosrev={String.valueOf(Administradorbiblio.revistas[j].tipo),Administradorbiblio.revistas[j].autor, String.valueOf(Administradorbiblio.revistas[j].ano), Administradorbiblio.revistas[j].titulo, Administradorbiblio.revistas[j].descripcion, Administradorbiblio.revistas[j].palabras, String.valueOf(Administradorbiblio.revistas[j].edicion),Administradorbiblio.revistas[j].temas,String.valueOf(Administradorbiblio.revistas[j].copias)," ",Administradorbiblio.revistas[j].categoria," ",String.valueOf(Administradorbiblio.revistas[j].ejemplares), " "};
            creaciontabla1.addRow(mosrev);
        }
        for(int k=1;k<Administradorbiblio.personas3;k++){
            String[]moste={String.valueOf(Administradorbiblio.tesis[k].tipo),Administradorbiblio.tesis[k].autor,String.valueOf(Administradorbiblio.tesis[k].ano),Administradorbiblio.tesis[k].titulo, Administradorbiblio.tesis[k].descripcion,Administradorbiblio.tesis[k].palabras,String.valueOf(Administradorbiblio.tesis[k].edicion),Administradorbiblio.tesis[k].temas,String.valueOf(Administradorbiblio.tesis[k].copias),Administradorbiblio.tesis[k].area," "," "," ", " "};
            creaciontabla1.addRow(moste);
        }
          add(usumos1);
                            
                            usumos1.setBounds(55,350,400,200);
                            usumos1.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla1);
                            tabla.setSize(600,500);
                            creaciontabla1.fireTableDataChanged();
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos1.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                
            }
            if(ae.getSource()==filtrar){
                System.out.println("hola");
                ///////////////////////////DATOS DE LIBRO EN BUSQUEDA
                if("Libros".equals(valorComboBox1)){
                    System.out.println("mundo");
                        for (int i=1;i<Administradorbiblio.personas;i++){
                            String[]moslib={ String.valueOf(Administradorbiblio.libros[i].tipo),Administradorbiblio.libros[i].autor, String.valueOf(Administradorbiblio.libros[i].ano), Administradorbiblio.libros[i].titulo, Administradorbiblio.libros[i].descripcion, Administradorbiblio.libros[i].palabras, String.valueOf(Administradorbiblio.libros[i].edicion),Administradorbiblio.libros[i].temas,String.valueOf(Administradorbiblio.libros[i].copias)," "," ",String.valueOf(Administradorbiblio.libros[i].isbn)," ", " "};
                            creaciontabla2.addRow(moslib);
                            add(usumos2);
                            usumos2.setBounds(55,350,400,200);
                            usumos2.setSize(570, 150);
                            JTable tabla1=new JTable(creaciontabla2);
//                            creaciontabla.fireTableDataChanged();
                            tabla1.setSize(600,500);
                            tabla1.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento1=new JScrollPane(tabla1);
                            usumos2.add(desplazamiento1,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                            usumos2.repaint();
                        }
                    }
                }
                ///////////////////////////DATOS DE REVISTA EN BUSQUEDA
                if("Revistas".equals(valorComboBox1)){
                    for (int j=1;j<Administradorbiblio.personas2;j++){
                            String[]mosrev={String.valueOf(Administradorbiblio.revistas[j].tipo),Administradorbiblio.revistas[j].autor, String.valueOf(Administradorbiblio.revistas[j].ano), Administradorbiblio.revistas[j].titulo, Administradorbiblio.revistas[j].descripcion, Administradorbiblio.revistas[j].palabras, String.valueOf(Administradorbiblio.revistas[j].edicion),Administradorbiblio.revistas[j].temas,String.valueOf(Administradorbiblio.revistas[j].copias)," ",Administradorbiblio.revistas[j].categoria," ",String.valueOf(Administradorbiblio.revistas[j].ejemplares), " "};
                            creaciontabla3.addRow(mosrev);
                            add(usumos3);
                            usumos3.setBounds(55,350,400,200);
                            usumos3.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla3);
//                            creaciontabla.fireTableDataChanged();
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos3.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                    }
                }
                ///////////////////////////DATOS DE TESIS EN BUSQUEDA
                if("Autor".equals(valorComboBox1)||"Año publicado".equals(valorComboBox)||"Título".equals(valorComboBox)||"Edición".equals(valorComboBox)||"Palabras clave".equals(valorComboBox)||"Descripción".equals(valorComboBox)||"Temas".equals(valorComboBox)||"Copias".equals(valorComboBox)||"Categoría".equals(valorComboBox)||"Ejemplares".equals(valorComboBox)){
                    for (int k=1;k<Administradorbiblio.personas3;k++){
                            String[]moste={String.valueOf(Administradorbiblio.tesis[k].tipo),Administradorbiblio.tesis[k].autor,String.valueOf(Administradorbiblio.tesis[k].ano),Administradorbiblio.tesis[k].titulo, Administradorbiblio.tesis[k].descripcion,Administradorbiblio.tesis[k].palabras,String.valueOf(Administradorbiblio.tesis[k].edicion),Administradorbiblio.tesis[k].temas,String.valueOf(Administradorbiblio.tesis[k].copias),Administradorbiblio.tesis[k].area," "," "," ", " "};
                            creaciontabla4.addRow(moste);
                            add(usumos4);
                            usumos4.setBounds(55,350,400,200);
                            usumos4.setSize(570, 150);
                            JTable tabla=new JTable(creaciontabla4);
//                            creaciontabla.fireTableDataChanged();
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(568, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos4.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                }
                  
            }
            if(ae.getSource()==prestar){
                Prestar obj=new Prestar();
                obj.setVisible(true);
            }
                
            if(ae.getSource()==logOut){
                Cargaindividual obj= new Cargaindividual();
//                Login obj=new Login();
                obj.setVisible(true);
//                dispose();
            }
            if(ae.getSource()==regresar){
                Usuarionormal obj=new Usuarionormal();
                obj.setVisible(true);
                dispose();
            }
            
        }
    }
}

