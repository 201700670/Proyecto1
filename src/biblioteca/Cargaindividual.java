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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    public JLabel ejemplares;
    public JLabel tamaño;
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
    public JTextField text_ejemplares;
    public JTextField text_tamaño;
    
    public JComboBox combo_tipo;
    
    private JButton cargar;
    private JButton cancel;
    public Cargaindividual(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("CARGA INDIVIDUAL");
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
        
        ejemplares = new JLabel("Ejemplares: ");
        ejemplares.setSize(dim);
        ejemplares.setBounds(50,350,300,50);
        
        tamaño = new JLabel("Tamaño: ");
        tamaño.setSize(dim);
        tamaño.setBounds(50,380,300,50);
        
        tipo = new JLabel("Tipo: ");
        tipo.setSize(dim);
        tipo.setBounds(50,410,300,50);
        
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
        
        text_ejemplares = new JTextField();
        text_ejemplares.setSize(dim);
        text_ejemplares.setBounds(130,360,300,25);
        
        text_tamaño = new JTextField();
        text_tamaño.setSize(dim);
        text_tamaño.setBounds(130,390,300,25);
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(130,420,300,25);
        combo_tipo.addItem("Libro");
        combo_tipo.addItem("Revista");
        combo_tipo.addItem("Tesis");
        combo_tipo.addItem("Libro digital");
        
        cargar = new JButton("Cargar");
        cargar.setSize(dim);
        cargar.setBounds(130, 460, 100, 30);
        
        cancel = new JButton("Cancelar");
        cancel.setSize(dim);
        cancel.setBounds(300, 460, 100, 30);
        
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
        add(ejemplares);
        add(tamaño);
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
        add(text_ejemplares);
        add(text_tamaño);
        add(combo_tipo);
        add(cargar);
        add(cancel);
        
        Reaccion manejo=new Reaccion();
        cargar.addActionListener(manejo);
        cancel.addActionListener(manejo);
        combo_tipo.addActionListener(manejo);
        
        setSize(500,550);
        setVisible(true);
    }

    private class Reaccion implements ActionListener{
        String oautor,otitulo,odescripcion,opalabras,otemas,oarea,ocategoria;
        String otipo,oano,oedicion,ocopias,oisbn,obejemplares,tamaño;
        int elemento=combo_tipo.getItemCount();
        int l=0;
        @Override
        public void actionPerformed(ActionEvent ae) {
            oautor=text_autor.getText();
            otitulo=text_titulo.getText();
            odescripcion=text_descripcion.getText();
            opalabras=text_palabras.getText();
            otemas=text_temas.getText();
            oarea=text_area.getText();
            ocategoria=text_categoria.getText();
            oano=text_ano.getText();
            ocopias=text_copias.getText();
            oisbn=text_isbn.getText();
            obejemplares=text_ejemplares.getText();
            tamaño=text_tamaño.getText();
            oedicion=text_edicion.getText();
            
            String valorComboBox = "";
            valorComboBox = combo_tipo.getSelectedItem().toString();
            if(ae.getSource()==cargar){
                
                if("Libro".equals(valorComboBox)){
                    
                    Administradorbiblio.libros[Administradorbiblio.personas]=new Libros(oautor,Integer.parseInt(oano), otitulo, Integer.parseInt(oedicion), opalabras, odescripcion, otemas, Integer.parseInt(oisbn), Integer.parseInt(ocopias));
                   for(int persona1=1;persona1<Administradorbiblio.personas;persona1++){
                                   while((Administradorbiblio.libros[Administradorbiblio.personas].titulo).equals((Administradorbiblio.libros[persona1].titulo))){
                                       JOptionPane.showMessageDialog(null,"ESTE TITULO YA EXISTE, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                                       return;
                                   }
                               }
                    Administradorbiblio.personas++;
                    System.out.println(Administradorbiblio.personas);
                }
                if("Revista".equals(valorComboBox)){
                    Administradorbiblio.revistas[Administradorbiblio.personas2]=new Revistas(ocategoria, Integer.parseInt(obejemplares),Integer.parseInt(ocopias), oautor, Integer.parseInt(oano), otitulo, Integer.parseInt(oedicion), opalabras, odescripcion, otemas);
                    for(int persona=1;persona<Administradorbiblio.personas2;persona++){
                                   while((Administradorbiblio.revistas[Administradorbiblio.personas2].titulo).equals((Administradorbiblio.revistas[persona].titulo))){
                                       JOptionPane.showMessageDialog(Cargaindividual.this,"ESTE TITULO YA EXISTE, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                                       return;
                                   }
                               }
                    Administradorbiblio.personas2++;
                    System.out.println(Administradorbiblio.personas2);
                }
                if("Tesis".equals(valorComboBox)){
                    Administradorbiblio.tesis[Administradorbiblio.personas3]=new Tesis(oarea, Integer.parseInt(ocopias), oautor,Integer.parseInt(oano), otitulo, Integer.parseInt(oedicion), opalabras, odescripcion, otemas);
                    for(int persona=1;persona<Administradorbiblio.personas3;persona++){
                                   while((Administradorbiblio.tesis[Administradorbiblio.personas3].titulo).equals((Administradorbiblio.tesis[persona].titulo))){
                                       JOptionPane.showMessageDialog(Cargaindividual.this,"ESTE TITULO YA EXISTE, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                                       return;
                                   }
                               }
                    Administradorbiblio.personas3++;
                    System.out.println(Administradorbiblio.personas3);
                }
                if("Libro digital".equals(valorComboBox)){
                    Administradorbiblio.librodigital[Administradorbiblio.personas4]=new Librodigital(Integer.parseInt(tamaño), oautor,Integer.parseInt(oano), otitulo, Integer.parseInt(oedicion), opalabras, odescripcion, otemas);
                    for(int persona=1;persona<Administradorbiblio.personas4;persona++){
                                   while((Administradorbiblio.librodigital[Administradorbiblio.personas4].titulo).equals((Administradorbiblio.librodigital[persona].titulo))){
                                       JOptionPane.showMessageDialog(Cargaindividual.this,"ESTE TITULO YA EXISTE, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                                       return;
                                   }
                               }
                    Administradorbiblio.personas4++;
                    System.out.println(Administradorbiblio.personas4);
                }
                text_autor.setText("");
                text_titulo.setText("");
                text_descripcion.setText("");
                text_palabras.setText("");
                text_temas.setText("");
                text_area.setText("");
                text_categoria.setText("");
                text_ano.setText("");
                text_copias.setText("");
                text_isbn.setText("");
                text_ejemplares.setText("");
                text_tamaño.setText("");
                text_edicion.setText("");
                
                               JOptionPane.showMessageDialog(Cargaindividual.this,"ELEMENTO AGREGADO A LA BIBLIOGRAFIA","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        }
    }
    
}
