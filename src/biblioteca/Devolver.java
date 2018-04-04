/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import static biblioteca.Prestar.prestados;
import static biblioteca.Prestar.prestados1;
import static biblioteca.Prestar.prestados2;
import static biblioteca.Prestar.restandos;
import static biblioteca.Prestar.restandos1;
import static biblioteca.Prestar.restandos2;
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
public class Devolver extends JFrame{
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
    public JLabel agr;
    
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
    private JButton devolverse;
    private JButton cancel;
    private JButton buscar;
    public Devolver(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("DEVOLVER BIBLIOGRAFIA");
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
        
        agr = new JLabel("COPIE Ó COLOQUE EL TÍTULO Y TIPO DEL ELEMENTO A DEVOLVER");
        agr.setSize(dim);
        agr.setBounds(95,380,500,50);
        
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
        
        combo_tipo= new JComboBox();
        combo_tipo.setSize(dim);
        combo_tipo.setBounds(130,420,300,25);
        combo_tipo.addItem("Libro");
        combo_tipo.addItem("Revista");
        combo_tipo.addItem("Tesis");
        
        devolverse = new JButton("Devolver");
        devolverse.setSize(dim);
        devolverse.setBounds(130, 460, 100, 30);
        
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
        add(combo_tipo);
        add(devolverse);
        add(cancel);
        add(buscar);
        add(agr);
        
        reacciones manejo=new reacciones();
        devolverse.addActionListener(manejo);
        cancel.addActionListener(manejo);
        buscar.addActionListener(manejo);
        
        setSize(580,550);
        setVisible(true);
    }
    private class reacciones implements ActionListener{
        String bibliotitulos;
        int contador,contador2,contador3,contador4;
        String oautor,otitulo,odescripcion,opalabras,otemas,oarea,ocategoria;
        int otipo,oano,oedicion,ocopias,oisbn,obejemplares,tamaño;
        String oejemplares;
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
                    for (int i=1;i<Prestar.restandos;i++){
                        if(bibliotitulos.equals(Prestar.prestados[i].titulo)){
                            contador=contador+i;
                            System.out.println(contador);
                        oautor=Prestar.prestados[contador].autor;
                        text_autor.setText(oautor);
                        oano=Prestar.prestados[contador].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.libros[contador].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Prestar.prestados[contador].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Prestar.prestados[contador].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Prestar.prestados[contador].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Prestar.prestados[contador].temas;
                        text_temas.setText(otemas);
                        oisbn=Prestar.prestados[contador].isbn;
                        text_isbn.setText(String.valueOf(oisbn));
                        ocopias=Prestar.prestados[contador].copias;
                        text_copias.setText(String.valueOf(ocopias));
                        probando=false;
                        i=Administradorbiblio.personas;
                        }
                    }
                     if(probando){
                        JOptionPane.showMessageDialog(null,"ESTE LIBRO NO EXISTE, INTENTE DE NUEVO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }   
                }
                ////////////REVISTAS
                if("Revista".equals(valorComboBox)){
                    contador2=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Prestar.restandos1;i++){
                        if(bibliotitulos.equals(Prestar.prestados1[i].titulo)){
                            contador2=contador2+i;
                            System.out.println(contador2);
                        oautor=Prestar.prestados1[contador2].autor;
                        text_autor.setText(oautor);
                        oano=Prestar.prestados1[contador2].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.revistas[contador2].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Prestar.prestados1[contador2].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Prestar.prestados1[contador2].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Prestar.prestados1[contador2].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Prestar.prestados1[contador2].temas;
                        text_temas.setText(otemas);
                        ocategoria=Prestar.prestados1[contador2].categoria;
                        text_categoria.setText((ocategoria));
                        ocopias=Prestar.prestados1[contador2].copias;
                        text_copias.setText(String.valueOf(ocopias));
                        obejemplares=Prestar.prestados1[contador2].ejemplares;
                        text_ejemplares.setText(String.valueOf(obejemplares));
                        probando=false;
                        i=Administradorbiblio.personas;
                        }
                    }
                        if(probando){
                        JOptionPane.showMessageDialog(null,"ESTA REVISTA NO EXISTE, INTENTE DE NUEVO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }  
                }
                
                ////////////////TESIS
                if("Tesis".equals(valorComboBox)){
                    contador3=0;
                    bibliotitulos=text_titulo.getText();
                    for (int i=1;i<Prestar.restandos2;i++){
                        if(bibliotitulos.equals(Prestar.prestados2[i].titulo)){
                            contador3=contador3+i;
                           System.out.println(contador3);
                        oautor=Prestar.prestados2[contador3].autor;
                        text_autor.setText(oautor);
                        oano=Prestar.prestados2[contador3].ano;
                        text_ano.setText(String.valueOf(oano));
//                        otitulo=Administradorbiblio.tesis[contador3].titulo;
//                        text_titulo.setText(otitulo);
                        oedicion=Prestar.prestados2[contador3].edicion;
                        text_edicion.setText(String.valueOf(oedicion));
                        opalabras=Prestar.prestados2[contador3].palabras;
                        text_palabras.setText(opalabras);
                        odescripcion=Prestar.prestados2[contador3].descripcion;
                        text_descripcion.setText(odescripcion);
                        otemas=Prestar.prestados2[contador3].temas;
                        text_temas.setText(otemas);
                        oarea=Prestar.prestados2[contador3].area;
                        text_area.setText(oarea);
                        ocopias=Prestar.prestados2[contador3].copias;
                        text_copias.setText(String.valueOf(ocopias)); 
                        probando=false;
                        i=Administradorbiblio.personas;
                        }
                    }
                      if(probando){
                        JOptionPane.showMessageDialog(null,"ESTA TESIS NO EXISTE, INTENTE DE NUEVO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }    
                        
                }
                
                    
                }
            if(ae.getSource()==devolverse){
                        
                        
                if("Libro".equals(valorComboBox)){
                    for(int persona=1;persona<Prestar.restandos;persona++){
                       if(String.valueOf(Prestar.prestados[persona].id).equals(String.valueOf(Biblioteca.usuarioactual))){
                                       
                    Administradorbiblio.libros[contador].devolver();
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Prestar.prestados[contador].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Prestar.prestados[contador].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Prestar.prestados[contador].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Prestar.prestados[contador].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Prestar.prestados[contador].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Prestar.prestados[contador].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Prestar.prestados[contador].temas=otemas;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Prestar.prestados[contador].copias=ocopias;
                        text_isbn.setText("0");
                        oisbn=Integer.parseInt(text_isbn.getText());
                        Prestar.prestados[contador].isbn=oisbn;
                                   }
                    }
                }
                if("Revista".equals(valorComboBox)){
                    
                    Administradorbiblio.revistas[contador2].devolver();
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Prestar.prestados1[contador2].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Prestar.prestados1[contador2].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Prestar.prestados1[contador2].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Prestar.prestados1[contador2].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Prestar.prestados1[contador2].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Prestar.prestados1[contador2].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Prestar.prestados1[contador2].temas=otemas;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Prestar.prestados1[contador2].copias=ocopias;
                        text_categoria.setText(null);
                        ocategoria=text_categoria.getText();
                        Prestar.prestados1[contador2].categoria=ocategoria;
                        text_ejemplares.setText("0");
                        obejemplares=Integer.parseInt(text_ejemplares.getText());
                        Prestar.prestados1[contador2].ejemplares=obejemplares;
                        
                }
                if("Tesis".equals(valorComboBox)){
                    
                    Administradorbiblio.tesis[contador3].devolver();
                        text_autor.setText(null);
                        oautor=text_autor.getText();
                        Prestar.prestados2[contador3].autor=oautor;
                        text_ano.setText("0");
                        oano=Integer.parseInt(text_ano.getText());
                        Prestar.prestados2[contador3].ano=oano;
                        text_titulo.setText(null);
                        otitulo=text_titulo.getText();
                        Prestar.prestados2[contador3].titulo=otitulo;
                        text_edicion.setText("0");
                        oedicion=Integer.parseInt(text_edicion.getText());
                        Prestar.prestados2[contador3].edicion=oedicion;
                        text_palabras.setText(null);
                        opalabras=text_palabras.getText();
                        Prestar.prestados2[contador3].palabras=opalabras;
                        text_descripcion.setText(null);
                        odescripcion=text_descripcion.getText();
                        Prestar.prestados2[contador3].descripcion=odescripcion;
                        text_temas.setText(null);
                        otemas=text_temas.getText();
                        Prestar.prestados2[contador3].temas=otemas;
                        text_copias.setText("0");
                        ocopias=Integer.parseInt(text_copias.getText());
                        Prestar.prestados2[contador3].copias=ocopias;
                        text_area.setText(null);
                        oarea=text_area.getText();
                        Prestar.prestados2[contador3].area=oarea;
                        
                }
                      dispose();  
            }
            if(ae.getSource()==cancel){
                dispose();
            }
        }
    }
}
