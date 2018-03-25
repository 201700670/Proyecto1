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
public class Libros extends Bibliografias{
    int prestamos;
    int isbn;
    int copias;

    public Libros(String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas, int isbn, int copias) {
        super(autor,ano,titulo,edicion, palabras,descripcion,temas);
        this.prestamos = 0;
        this.isbn = isbn;
        this.copias = copias;
        super.tipo=0;
    }
    public String mostrar(){
    
        return ""+tipo+ ";"+super.mostrar()+isbn+";"+copias;
    }
    public void prestar(){
        copias --;
        prestamos ++;
    }
    
    public void devolver(){
        copias ++;
    }

    
    public int disponibles(){
        return copias;
    }
    
    public int prestamos(){
        return prestamos;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
