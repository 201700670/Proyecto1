/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Dimension;
import java.awt.HeadlessException;
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
public class Eliminar_bibliografia extends JFrame{
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
    
    private JButton eliminar;
    private JButton cancel;
    private JButton buscar;

    public Eliminar_bibliografia() {
        setLayout(null);
        setLocationRelativeTo(null);
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
        
        text_copias = new JTextField();
        text_copias.setSize(dim);
        text_copias.setBounds(130,240,300,25);
        text_copias.setEnabled(false);
        
        text_area = new JTextField();
        text_area.setSize(dim);
        text_area.setBounds(130,270,300,25);
        text_area.setEnabled(false);
        
        text_categoria = new JTextField();
        text_categoria.setSize(dim);
        text_categoria.setBounds(130,300,300,25);
        text_categoria.setEnabled(false);
        
        text_isbn = new JTextField();
        text_isbn.setSize(dim);
        text_isbn.setBounds(130,330,300,25);
        text_isbn.setEnabled(false);
        
        text_ejemplares = new JTextField();
        text_ejemplares.setSize(dim);
        text_ejemplares.setBounds(130,360,300,25);
        text_ejemplares.setEnabled(false);
        
        text_tamaño = new JTextField();
        text_tamaño.setSize(dim);
        text_tamaño.setBounds(130,390,300,25);
        text_tamaño.setEnabled(false);
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(130,420,300,25);
        combo_tipo.addItem("Libro");
        combo_tipo.addItem("Revista");
        combo_tipo.addItem("Tesis");
        combo_tipo.addItem("Libro digital");
        
        eliminar = new JButton("Eliminar");
        eliminar.setSize(dim);
        eliminar.setBounds(130, 460, 100, 30);
        
        buscar = new JButton("Buscar");
        buscar.setSize(dim);
        buscar.setBounds(445,90, 100, 25);
        
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
        add(eliminar);
        add(buscar);
        add(cancel);
        
        Reaccion manejo=new Reaccion();
        eliminar.addActionListener(manejo);
        cancel.addActionListener(manejo);
        combo_tipo.addActionListener(manejo);
        buscar.addActionListener(manejo);
        setSize(580,550);
        setVisible(true);
        
        
    }

    private class Reaccion implements ActionListener{
        String bibliotitulos;
        int contador,contador2,contador3,contador4;
        String oautor,otitulo,odescripcion,opalabras,otemas,oarea,ocategoria;
        int otipo,oano,oedicion,ocopias,oisbn,obejemplares,tamaño;
        boolean probando=true;
        @Override
        public void actionPerformed(ActionEvent ae) {
            String valorComboBox = "";
            valorComboBox = combo_tipo.getSelectedItem().toString();
            if(ae.getSource()==buscar){
                ////////////////LIBROS
                if("Libro".equals(valorComboBox)){
                    contador=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Administradorbiblio.personas;i++){
                        if(bibliotitulos.equals(Administradorbiblio.libros[i].titulo)){
                            contador=contador+i;
                            System.out.println(contador);
                        oautor=Administradorbiblio.libros[contador].autor;
                        text_autor.setText(oautor);
                        oano=Administradorbiblio.libros[contador].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.libros[contador].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Administradorbiblio.libros[contador].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Administradorbiblio.libros[contador].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Administradorbiblio.libros[contador].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Administradorbiblio.libros[contador].temas;
                        text_temas.setText(otemas);
                        oisbn=Administradorbiblio.libros[contador].isbn;
                        text_isbn.setText(String.valueOf(oisbn));
                        ocopias=Administradorbiblio.libros[contador].copias;
                        text_copias.setText(String.valueOf(ocopias));
                        probando=false;
                        }
                    }
                        
                }
                ////////////REVISTAS
                if("Revista".equals(valorComboBox)){
                    contador2=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Administradorbiblio.personas2;i++){
                        if(bibliotitulos.equals(Administradorbiblio.revistas[i].titulo)){
                            contador2=contador2+i;
                            System.out.println(contador2);
                        oautor=Administradorbiblio.revistas[contador2].autor;
                        text_autor.setText(oautor);
                        oano=Administradorbiblio.revistas[contador2].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.revistas[contador2].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Administradorbiblio.revistas[contador2].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Administradorbiblio.revistas[contador2].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Administradorbiblio.revistas[contador2].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Administradorbiblio.revistas[contador2].temas;
                        text_temas.setText(otemas);
                        ocategoria=Administradorbiblio.revistas[contador2].categoria;
                        text_categoria.setText((ocategoria));
                        ocopias=Administradorbiblio.revistas[contador2].copias;
                        text_copias.setText(String.valueOf(ocopias));
                        obejemplares=Administradorbiblio.revistas[contador2].ejemplares;
                        text_ejemplares.setText(String.valueOf(obejemplares));
                        probando=false;
                        }
                    }
                        
                }
                
                ////////////////TESIS
                if("Tesis".equals(valorComboBox)){
                    contador3=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Administradorbiblio.personas3;i++){
                        if(bibliotitulos.equals(Administradorbiblio.tesis[i].titulo)){
                            contador3=contador3+i;
                            System.out.println(contador3);
                        oautor=Administradorbiblio.tesis[contador3].autor;
                        text_autor.setText(oautor);
                        oano=Administradorbiblio.tesis[contador3].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.tesis[contador3].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Administradorbiblio.tesis[contador3].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Administradorbiblio.tesis[contador3].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Administradorbiblio.tesis[contador3].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Administradorbiblio.tesis[contador3].temas;
                        text_temas.setText(otemas);
                        oarea=Administradorbiblio.tesis[contador3].area;
                        text_area.setText(oarea);
                        ocopias=Administradorbiblio.tesis[contador3].copias;
                        text_copias.setText(String.valueOf(ocopias));
                        probando=false;
                        }
                    }
                        
                        
                }
                //////////////////////LIBROS DIGITALES
                if("Libro digital".equals(valorComboBox)){
                    contador4=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Administradorbiblio.personas4;i++){
                        if(bibliotitulos.equals(Administradorbiblio.librodigital[i].titulo)){
                            contador4=contador4+i;
                            System.out.println(contador4);
                        oautor=Administradorbiblio.librodigital[contador4].autor;
                        text_autor.setText(oautor);
                        oano=Administradorbiblio.librodigital[contador4].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.librodigital[contador4].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Administradorbiblio.librodigital[contador4].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Administradorbiblio.librodigital[contador4].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Administradorbiblio.librodigital[contador4].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Administradorbiblio.librodigital[contador4].temas;
                        text_temas.setText(otemas);
                        tamaño=Administradorbiblio.librodigital[contador4].tamaño;
                        text_tamaño.setText(String.valueOf(tamaño));
                        probando=false;
                        }
                    }
                        
                }
            }
            
            //////////////////////////////////BOTON MODIFICAR
            if(ae.getSource()==eliminar){
                 ////////////////LIBRO
                 if("Libro".equals(valorComboBox)){
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Administradorbiblio.libros[contador].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Administradorbiblio.libros[contador].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Administradorbiblio.libros[contador].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Administradorbiblio.libros[contador].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Administradorbiblio.libros[contador].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Administradorbiblio.libros[contador].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Administradorbiblio.libros[contador].temas=otemas;
                        text_isbn.setText("0");
                        oisbn=Integer.parseInt(text_isbn.getText());
                        Administradorbiblio.libros[contador].isbn=oisbn;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Administradorbiblio.libros[contador].copias=ocopias;
                    
                 }
                    
                ////////////////REVISTA
                if("Revista".equals(valorComboBox)){
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Administradorbiblio.revistas[contador2].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Administradorbiblio.revistas[contador2].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Administradorbiblio.revistas[contador2].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Administradorbiblio.revistas[contador2].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Administradorbiblio.revistas[contador2].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Administradorbiblio.revistas[contador2].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Administradorbiblio.revistas[contador2].temas=otemas;
                        text_categoria.setText(null);
                        ocategoria=text_categoria.getText();
                        Administradorbiblio.revistas[contador2].categoria=ocategoria;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Administradorbiblio.revistas[contador2].copias=ocopias;
                        text_ejemplares.setText("0");
                        obejemplares=Integer.parseInt(text_ejemplares.getText());
                        Administradorbiblio.revistas[contador2].ejemplares=obejemplares;
                }
                ////////////////TESIS
                if("Tesis".equals(valorComboBox)){
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Administradorbiblio.tesis[contador3].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Administradorbiblio.tesis[contador3].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Administradorbiblio.tesis[contador3].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Administradorbiblio.tesis[contador3].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Administradorbiblio.tesis[contador3].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Administradorbiblio.tesis[contador3].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Administradorbiblio.tesis[contador3].temas=otemas;
                        text_area.setText(null);
                        oarea=text_area.getText();
                        Administradorbiblio.tesis[contador3].area=oarea;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Administradorbiblio.tesis[contador3].copias=ocopias;
                }
                //////////////////////LIBROS DIGITALES
                if("Libro digital".equals(valorComboBox)){
                    System.out.println(contador4);
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Administradorbiblio.librodigital[contador4].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Administradorbiblio.librodigital[contador4].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Administradorbiblio.librodigital[contador4].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Administradorbiblio.librodigital[contador4].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Administradorbiblio.librodigital[contador4].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Administradorbiblio.librodigital[contador4].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Administradorbiblio.librodigital[contador4].temas=otemas;
                        text_tamaño.setText("0");
                        tamaño=Integer.parseInt(text_tamaño.getText());
                        Administradorbiblio.librodigital[contador4].tamaño=tamaño;
                } 
                    
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        }
    }
    
}
