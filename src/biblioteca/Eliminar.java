/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Eliminar extends JFrame{

    private JLabel agr;
    public JLabel autor;
    public JLabel ano;
    public JLabel titulo;
    public JLabel descripcion;
    public JLabel palabras;
    public JLabel edicion;
    public JLabel temas;
    public JLabel tamaño;
    public JLabel tipo;
    
    private JTextField text_autor;
    private JTextField text_ano;
    private JTextField text_titulo;
    private JTextField text_descripcion;
    private JTextField text_palabras;
    private JTextField text_edicion;
    private JTextField text_temas;
    private JTextField text_tamaño;
    
    public static JButton eliminarse;
    private JButton cancel;
    private JButton buscar;
    public Eliminar(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("ELIMINAR LIBROS DIGITALES");
        Dimension dim = new Dimension(200, 50);
        
        agr = new JLabel("COPIE Ó COLOQUE EL TÍTULO DEL LIBRO QUE DESEA ELIMINAR DE SU CUENTA");
        agr.setSize(dim);
        agr.setBounds(70,280,450,50);
        
        autor = new JLabel("Autor: ");
        autor.setSize(dim);
        autor.setBounds(50,20,300,50);
        
        ano = new JLabel("Año: ");
        ano.setSize(dim);
        ano.setBounds(50,50,300,50);
        
        titulo = new JLabel("Título: ");
        titulo.setSize(dim);
        titulo.setBounds(50,80,300,50);
        
        descripcion = new JLabel("Descripción: ");
        descripcion.setSize(dim);
        descripcion.setBounds(50,110,300,50);
        
        palabras = new JLabel("Palabras: ");
        palabras.setSize(dim);
        palabras.setBounds(50,140,200,50);
        
        edicion = new JLabel("Edición: ");
        edicion.setSize(dim);
        edicion.setBounds(50,170,300,50);
        
        temas = new JLabel("Temas: ");
        temas.setSize(dim);
        temas.setBounds(50,200,300,50);
        
        tamaño = new JLabel("Tamaño: ");
        tamaño.setSize(dim);
        tamaño.setBounds(50,230,300,50);
        
        text_autor = new JTextField();
        text_autor.setSize(dim);
        text_autor.setBounds(130,30,300,25);
        text_autor.setEnabled(false);
        
        text_ano = new JTextField();
        text_ano.setSize(dim);
        text_ano.setBounds(130,60,300,25);
        text_ano.setEnabled(false);
        
        text_titulo = new JTextField();
        text_titulo.setSize(dim);
        text_titulo.setBounds(130,90,300,25);
        
        text_descripcion = new JTextField();
        text_descripcion.setSize(dim);
        text_descripcion.setBounds(130,120,300,25);
        text_descripcion.setEnabled(false);
        
        text_palabras = new JTextField();
        text_palabras.setSize(dim);
        text_palabras.setBounds(130,150,300,25);
        text_palabras.setEnabled(false);
        
        text_edicion = new JTextField();
        text_edicion.setSize(dim);
        text_edicion.setBounds(130,180,300,25);
        text_edicion.setEnabled(false);
        
        text_temas = new JTextField();
        text_temas.setSize(dim);
        text_temas.setBounds(130,210,300,25);
        text_temas.setEnabled(false);
        
        text_tamaño = new JTextField();
        text_tamaño.setSize(dim);
        text_tamaño.setBounds(130,240,300,25);
        text_tamaño.setEnabled(false);
        
        eliminarse = new JButton("Eliminar");
        eliminarse.setSize(dim);
        eliminarse.setBounds(130, 360, 100, 30);
        
        cancel = new JButton("Cancelar");
        cancel.setSize(dim);
        cancel.setBounds(300, 360, 100, 30);
        
        buscar = new JButton("Buscar");
        buscar.setSize(dim);
        buscar.setBounds(445,90, 100, 25);;
        
        add(autor);
        add(ano);
        add(titulo);
        add(descripcion);
        add(palabras);
        add(edicion);
        add(temas);
        add(tamaño);
        add(text_autor);
        add(text_ano);
        add(text_titulo);
        add(text_descripcion);
        add(text_palabras);
        add(text_edicion);
        add(text_temas);
        add(text_tamaño);
        add(eliminarse);
        add(cancel);
        add(buscar);
        add(agr);
        Edicion manejo=new Edicion();
        eliminarse.addActionListener(manejo);
        cancel.addActionListener(manejo);
        buscar.addActionListener(manejo);
        
        setSize(580,480);
        setVisible(true);
    }

    private class Edicion implements ActionListener {
        String bibliotitulos;
        int contador,contador2,contador3,contador4;
        String oautor,otitulo,odescripcion,opalabras,otemas,oarea,ocategoria;
        int otipo,oano,oedicion,ocopias,oisbn,obejemplares,tamaño;
        boolean probando=true;
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            contador=0;
            if(ae.getSource()==buscar){
               contador4=0; 
                bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Agregar.sumandos;i++){
                        if(bibliotitulos.equals(Agregar.agregados[i].titulo)){
                            contador4=contador4+i;
                        System.out.println(contador4+"prueba");
                        oautor=Agregar.agregados[contador4].autor;
                        text_autor.setText(oautor);
                        oano=Agregar.agregados[contador4].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Agregar.agregados[contador4].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Agregar.agregados[contador4].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Agregar.agregados[contador4].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Agregar.agregados[contador4].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Agregar.agregados[contador4].temas;
                        text_temas.setText(otemas);
                        tamaño=Agregar.agregados[contador4].tamaño;
                        text_tamaño.setText(String.valueOf(tamaño));
                        probando=false;
                        }
                    }
                    if(probando){
                        JOptionPane.showMessageDialog(null,"ESTE DATO NO EXISTE","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    
            }
            if(ae.getSource()==eliminarse){
                if("".equals(otitulo)){
                    JOptionPane.showMessageDialog(null,"LLENAR LA CASILLA, INTENTE DE NUEVO","ERROR",JOptionPane.WARNING_MESSAGE);
                }else{
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Agregar.agregados[contador4].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Agregar.agregados[contador4].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Agregar.agregados[contador4].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Agregar.agregados[contador4].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Agregar.agregados[contador4].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Agregar.agregados[contador4].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Agregar.agregados[contador4].temas=otemas;
                        text_tamaño.setText("0");
                        tamaño=Integer.parseInt(text_tamaño.getText());
                        Agregar.agregados[contador4].tamaño=tamaño;
                        dispose();
                }
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        }

    }
}
