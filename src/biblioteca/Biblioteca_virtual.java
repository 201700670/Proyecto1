/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import static biblioteca.Administradorbiblio.personas4;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Biblioteca_virtual extends JFrame{
    private JLabel user;
    private JLabel psswd;
    
    private JTextField busqueda;
    
    public JComboBox combo_tipo;
    
    private JButton regresar;
    private JButton logOut;
    private JButton ver;
    private JButton buscar;
    private JButton agregar;
    
    private ImageIcon imagen;
    private ImageIcon imagen2;

    private JLabel pnlicon;
    private JLabel logo;
    
    
    private String [] encabezado={"No.","Autor", "Año", "Título", "Descrip.", "Palabras", "Edicion","Temas","Tamaño"};
    private Object [][]datos=new Object [0][8];
    private Object [][]datos1=new Object [0][8];
    private JPanel usumos= new JPanel();
    private JPanel usumos1= new JPanel();
    private JPanel usumos2= new JPanel();
    DefaultTableModel usuariotabal;
    DefaultTableModel usuariotaba2;
    DefaultTableModel usuariotaba3;
    
    DefaultTableModel creaciontabla=new DefaultTableModel(datos,encabezado);
    DefaultTableModel creaciontabla1=new DefaultTableModel(datos1,encabezado);
    DefaultTableModel creaciontabla2=new DefaultTableModel(datos,encabezado);
    public Biblioteca_virtual(){
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
        
        ver = new JButton("Ver Biblioteca virtual");
        ver.setSize(dim);
        ver.setBounds(580,300, 170, 30);
        
        agregar= new JButton("Agregar un libro dig.");
        agregar.setSize(dim);
        agregar.setBounds(580,400, 170, 30);
        
        buscar = new JButton("Buscar");
        buscar.setSize(dim);
        buscar.setBounds(320,300, 150, 30);
        
        busqueda = new JTextField();
        busqueda.setSize(dim);
        busqueda.setBounds(320,220, 150, 30);
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(300,260,200,25);
        combo_tipo.addItem("Autor");
        combo_tipo.addItem("Año publicado");
        combo_tipo.addItem("Título");
        combo_tipo.addItem("Edición");
        combo_tipo.addItem("Palabras clave");
        combo_tipo.addItem("Descripción");
        combo_tipo.addItem("Temas");
        combo_tipo.addItem("Tamaño");
        combo_tipo.addItem("TODOS");
        
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
        add(ver);
        add(pnlicon);
        add(logo);
        add(combo_tipo);
        add(busqueda);
        add(agregar);
        
        Tratar manejo=new Tratar();
        ver.addActionListener(manejo);
        logOut.addActionListener(manejo);
        buscar.addActionListener(manejo);
        regresar.addActionListener(manejo);
        agregar.addActionListener(manejo);
        
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
            valorComboBox = combo_tipo.getSelectedItem().toString();
            con2=0;con3=0;
            con4=0;con5=0;con6=0;
            con7=0;con8=0;
            
            
            if(ae.getSource()==buscar){
                if("Autor".equals(valorComboBox)||"Año publicado".equals(valorComboBox)||"Título".equals(valorComboBox)||"Edición".equals(valorComboBox)||"Palabras clave".equals(valorComboBox)||"Descripción".equals(valorComboBox)||"Temas".equals(valorComboBox)||"Tamaño".equals(valorComboBox)){
                    for (int i=1;i<Administradorbiblio.personas4;i++){
                        con1=0;
                        if(obusqueda.equals(Administradorbiblio.librodigital[i].autor)||obusqueda.equals(Administradorbiblio.librodigital[i].ano)||obusqueda.equals(Administradorbiblio.librodigital[i].titulo)||obusqueda.equals(Administradorbiblio.librodigital[i].edicion)||obusqueda.equals(Administradorbiblio.librodigital[i].palabras)||obusqueda.equals(Administradorbiblio.librodigital[i].descripcion)||obusqueda.equals(Administradorbiblio.librodigital[i].temas)||obusqueda.equals(Administradorbiblio.librodigital[i].tamaño)){
                            con1=con1+i;
                            System.out.println(con1);
                            String[]moslibdig={String.valueOf(con1),Administradorbiblio.librodigital[con1].autor,String.valueOf(Administradorbiblio.librodigital[con1].ano),Administradorbiblio.librodigital[con1].titulo,Administradorbiblio.librodigital[con1].descripcion,Administradorbiblio.librodigital[con1].palabras,String.valueOf(Administradorbiblio.librodigital[con1].edicion),Administradorbiblio.librodigital[con1].temas,String.valueOf(Administradorbiblio.librodigital[con1].tamaño)};
                            creaciontabla.addRow(moslibdig);
                            add(usumos);
                            usumos.setBounds(55,350,485,300);
                            usumos.setSize(500, 150);
                            JTable tabla=new JTable(creaciontabla);
                            tabla.setSize(500,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(495, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                        }
                    }
                    busqueda.setText(null);
                }
                else if("TODOS".equals(valorComboBox)){
                       System.out.println("hola"); 
                    for(int l=1;l<Administradorbiblio.personas4;l++){
                        String[]moslibdig1={String.valueOf(l),Administradorbiblio.librodigital[l].autor,String.valueOf(Administradorbiblio.librodigital[l].ano),Administradorbiblio.librodigital[l].titulo,Administradorbiblio.librodigital[l].descripcion,Administradorbiblio.librodigital[l].palabras,String.valueOf(Administradorbiblio.librodigital[l].edicion),Administradorbiblio.librodigital[l].temas,String.valueOf(Administradorbiblio.librodigital[l].tamaño)};
                        creaciontabla2.addRow(moslibdig1);
                    }
                            add(usumos2);
                            usumos1.setBounds(55,350,485,100);
                            usumos2.setSize(500, 150);
                            JTable tabla=new JTable(creaciontabla2);
                            tabla.setSize(500,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(495, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos2.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
                    
                }
                    for(int l=1;l<Administradorbiblio.personas4;l++){
                        String[]moslibdig1={String.valueOf(l),Administradorbiblio.librodigital[l].autor,String.valueOf(Administradorbiblio.librodigital[l].ano),Administradorbiblio.librodigital[l].titulo,Administradorbiblio.librodigital[l].descripcion,Administradorbiblio.librodigital[l].palabras,String.valueOf(Administradorbiblio.librodigital[l].edicion),Administradorbiblio.librodigital[l].temas,String.valueOf(Administradorbiblio.librodigital[l].tamaño)};
                        creaciontabla1.addRow(moslibdig1);
                    }
                            add(usumos1);
                            usumos1.setBounds(55,350,485,100);
                            usumos1.setSize(500, 150);
                            JTable tabla=new JTable(creaciontabla1);
                            tabla.setSize(600,500);
                            tabla.setPreferredScrollableViewportSize(new Dimension(495, 118));
                            JScrollPane desplazamiento=new JScrollPane(tabla);
                            usumos1.add(desplazamiento,BorderLayout.SOUTH);
                            setSize(800,550);
                            setVisible(true);
            }
            if(ae.getSource()==agregar){
                Agregar obj=new Agregar();
                obj.setVisible(true);
            }
                
            if(ae.getSource()==logOut){
//                Cargaindividual obj= new Cargaindividual();
                Login obj=new Login();
                obj.setVisible(true);
                dispose();
            }
            if(ae.getSource()==regresar){
                Usuarionormal obj=new Usuarionormal();
                obj.setVisible(true);
                dispose();
            }
            if(ae.getSource()==ver){
                verdigitales obj= new verdigitales();
                obj.setVisible(true);
                dispose();
            }
        }
    }
}
