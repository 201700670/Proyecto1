/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class AdministradorJF extends JFrame{
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
    
    private ImageIcon imagen;
    
    private JPanel pnl;
    public AdministradorJF(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("ADMINISTRADOR");
        Dimension dim = new Dimension(200, 50);
        Dimension dim2 = new Dimension(400, 50);
        
        userio = new JLabel("Usuarios");
        userio.setSize(dim);
        userio.setBounds(80,30,200,50);
        
        bigrafos = new JLabel("Bibliografías");
        bigrafos.setSize(dim);
        bigrafos.setBounds(80,140,200,50);
        
        reporte = new JLabel("Reportes");
        reporte.setSize(dim);
        reporte.setBounds(80,240,200,50);
        
        crearusuario = new JButton("Crear");
        crearusuario.setSize(dim2);
        crearusuario.setBounds(100,90,100,30);
        
        modificarusuario = new JButton("Modificar");
        modificarusuario.setSize(dim2);
        modificarusuario.setBounds(200,90, 100, 30);
        
        eliminarusuario = new JButton("Eliminar");
        eliminarusuario.setSize(dim);
        eliminarusuario.setBounds(300, 90, 100, 30);
        
        mostrarusuario= new JButton("Mostrar");
        mostrarusuario.setSize(dim);
        mostrarusuario.setBounds(400, 90, 100, 30);
        
        crearbiblio = new JButton("Crear");
        crearbiblio.setSize(dim);
        crearbiblio.setBounds(100, 200, 100, 30);
        
        modificarbiblio = new JButton("Modificar");
        modificarbiblio.setSize(dim);
        modificarbiblio.setBounds(200, 200, 100, 30);
        
        eliminadrbiblio = new JButton("Eliminar");
        eliminadrbiblio.setSize(dim);
        eliminadrbiblio.setBounds(300, 200, 100, 30);
        
        mostrarbiblio = new JButton("Mostrar");
        mostrarbiblio.setSize(dim);
        mostrarbiblio.setBounds(400, 200, 100, 30);
        
        reportelibro = new JButton("Reporte Usuarios");
        reportelibro.setSize(dim);
        reportelibro.setBounds(100, 290, 150, 30);
       
        reporteusuario = new JButton("Reporte Libros");
        reporteusuario.setSize(dim);
        reporteusuario.setBounds(300, 290, 130, 30);
        
        pnl = new JPanel();
        pnl.setSize(600, 600);
        pnl.setBounds(0,0,600,600);
        
        add(userio);
        add(bigrafos);
        add(reporte);
        add(crearusuario);
        add(modificarusuario);
        add(eliminarusuario);
        add(mostrarusuario);
        add(crearbiblio);
        add(modificarbiblio);
        add(eliminadrbiblio);
        add(mostrarbiblio);
        add(reportelibro);
        add(reporteusuario);
      
        
        setSize(600,400);
        setVisible(true);
        Evento manejo=new Evento();
        crearusuario.addActionListener(manejo);
        modificarusuario.addActionListener(manejo);
        eliminarusuario.addActionListener(manejo);
        mostrarusuario.addActionListener(manejo);
        crearbiblio.addActionListener(manejo);
        modificarbiblio.addActionListener(manejo);
        eliminadrbiblio.addActionListener(manejo);
        mostrarbiblio.addActionListener(manejo);
        reportelibro.addActionListener(manejo);
        reporteusuario.addActionListener(manejo);
}

    private class Evento implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==crearusuario){
                Usuario obj= new Usuario();
                obj.setVisible(true);
            }
            if(ae.getSource()==modificarusuario){
                Modificar_usuarios obj=new Modificar_usuarios();
                obj.setVisible(true);
            }
            if(ae.getSource()==eliminarusuario){
                Eliminar_usuarios obj=new Eliminar_usuarios();
                obj.setVisible(true);
            }
            if(ae.getSource()==mostrarusuario){
              Administrador obj= new Administrador();
                   obj.setVisible(true);
                   obj.setSize(500,400);
            }
            if(ae.getSource()==crearbiblio){
                botoncargar obj=new botoncargar();
                obj.setVisible(true);
            }
        }
    }
}
