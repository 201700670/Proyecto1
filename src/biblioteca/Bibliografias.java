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
public class Bibliografias {
    String autor;
    int ano;
    String titulo;
    int edicion;
    String palabras;
    String descripcion;
    String temas;
    int tipo;
    public Bibliografias(String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas) {
        this.autor = autor;
        this.ano = ano;
        this.titulo = titulo;
        this.edicion = edicion;
        this.palabras = palabras;
        this.descripcion = descripcion;
        this.temas = temas;
    }   

    public String mostrar(){
    
        return ""+autor+";"+ano+";"+titulo+";"+edicion+";"+palabras+";"+descripcion+";"+temas;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }
    
}
