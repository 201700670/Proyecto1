/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Andrea Palomo
 */
public class Cargaindividual extends JFrame{
    public JLabel autor;
    public JLabel ano;
    public JLabel titulo;
    public JLabel descripcion;
    public JLabel palabras;
    public JLabel edicion;
    public JLabel temas;
    public JLabel copias;
    public JLabel area;
    public JLabel categoria;
    public JLabel isbn;
    public JLabel tipo;
    
    public JTextField text_autor;
    public JTextField text_ano;
    public JTextField text_titulo;
    public JTextField text_descripcion;
    public JTextField text_palabras;
    public JTextField text_edicion;
    public JTextField text_temas;
    public JTextField text_copias;
    public JTextField text_area;
    public JTextField text_categoria;
    public JTextField text_isbn;
    
    public JComboBox combo_tipo;
    
    private JButton cargar;
    private JButton cancel;
    public Cargaindividual(){
        setLayout(null);
        setTitle("MODIFICAR USUARIOS");
        Dimension dim = new Dimension(200, 50);
        
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
        
        copias = new JLabel("Copias: ");
        copias.setSize(dim);
        copias.setBounds(50,230,300,50);
        
        area = new JLabel("Área: ");
        area.setSize(dim);
        area.setBounds(50,260,300,50);
        
        categoria = new JLabel("Categoría: ");
        categoria.setSize(dim);
        categoria.setBounds(50,290,300,50);
        
        isbn = new JLabel("Isbn: ");
        isbn.setSize(dim);
        isbn.setBounds(50,320,300,50);
        
        tipo = new JLabel("Tipo: ");
        tipo.setSize(dim);
        tipo.setBounds(50,350,300,50);
        
        text_autor = new JTextField();
        text_autor.setSize(dim);
        text_autor.setBounds(130,30,300,25);
        
        text_ano = new JTextField();
        text_ano.setSize(dim);
        text_ano.setBounds(130,60,300,25);
        
        text_titulo = new JTextField();
        text_titulo.setSize(dim);
        text_titulo.setBounds(130,90,300,25);
        
        text_descripcion = new JTextField();
        text_descripcion.setSize(dim);
        text_descripcion.setBounds(130,120,300,25);
        
        text_palabras = new JTextField();
        text_palabras.setSize(dim);
        text_palabras.setBounds(130,150,300,25);
        
        text_edicion = new JTextField();
        text_edicion.setSize(dim);
        text_edicion.setBounds(130,180,300,25);
        
        text_temas = new JTextField();
        text_temas.setSize(dim);
        text_temas.setBounds(130,210,300,25);
        
        text_copias = new JTextField();
        text_copias.setSize(dim);
        text_copias.setBounds(130,240,300,25);
        
        text_area = new JTextField();
        text_area.setSize(dim);
        text_area.setBounds(130,270,300,25);
        
        text_categoria = new JTextField();
        text_categoria.setSize(dim);
        text_categoria.setBounds(130,300,300,25);
        
        text_isbn = new JTextField();
        text_isbn.setSize(dim);
        text_isbn.setBounds(130,330,300,25);
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(130,360,300,25);
        
        cargar = new JButton("Cargar");
        cargar.setSize(dim);
        cargar.setBounds(130, 400, 100, 30);
        
        cancel = new JButton("Cancelar");
        cancel.setSize(dim);
        cancel.setBounds(300, 400, 100, 30);
        
        add(autor);
        add(ano);
        add(titulo);
        add(descripcion);
        add(palabras);
        add(edicion);
        add(temas);
        add(copias);
        add(area);
        add(categoria);
        add(isbn);
        add(tipo);
        add(text_autor);
        add(text_ano);
        add(text_titulo);
        add(text_descripcion);
        add(text_palabras);
        add(text_edicion);
        add(text_temas);
        add(text_copias);
        add(text_area);
        add(text_categoria);
        add(text_isbn);
        add(combo_tipo);
        add(cargar);
        add(cancel);
        
        setSize(500,500);
        setVisible(true);
    }
    
}
