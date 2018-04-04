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
public class Tesis extends Bibliografias {
    String area;
    int copias;
    int prestamos;
    int disponibles;

    public Tesis(String area, int copias, String autor, int ano, String titulo, int edicion, String palabras, String descripcion, String temas) {
        super(autor, ano, titulo, edicion, palabras, descripcion, temas);
        this.area = area;
        this.copias = copias;
        this.prestamos = 0;
        super.tipo=2;
        disponibles=copias;
    }
    public String mostrar(){
    
        return ""+tipo+ ";"+super.mostrar()+";"+area+";"+copias;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
    
    public void prestar(){
        disponibles --;
        prestamos ++;
    }
    
    public void devolver(){
        disponibles ++;
    }

    
    public int disponibles(){
        return disponibles;
    }
    
    public int prestamos(){
        return prestamos;
    }
}
