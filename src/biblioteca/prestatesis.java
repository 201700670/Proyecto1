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
public class prestatesis extends Tesis {
    int id;
    public prestatesis(String area, int copias, String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas,int id) {
        super(area, copias, autor, ano, titulo, edicion, palabras, descripcion, temas);
        this.id=id;
    }
    
}
