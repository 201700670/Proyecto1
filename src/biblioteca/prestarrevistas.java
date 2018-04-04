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
public class prestarrevistas extends Revistas{
    int id;
    public prestarrevistas(String categoria, int ejemplares, int copias, String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas, int id) {
        super(categoria, ejemplares, copias, autor, ano, titulo, edicion, palabras, descripcion, temas);
        this.id=id;
    }
    
}
