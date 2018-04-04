/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Andrea Palomo
 */
public class prestalibros extends Libros{
    int id;
    public prestalibros(String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas, int isbn, int copias,int id) {
        super(autor, ano, titulo, edicion, palabras, descripcion, temas, isbn, copias);
        this.id=id;
    }
    
}
