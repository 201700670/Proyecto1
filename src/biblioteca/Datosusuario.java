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
public class Datosusuario  {
    String nombre;
    String apellido;
    String usuario;
    String rol;
    String id;
    String contrasena;
    public String[][]prestamos=new String[2][10];
    public int filaprestamos=0;
    public String[][]agregados=new String[8][10];
    public int filaagregados=0;
    
    public Datosusuario(String nombre, String apellido, String usuario, String rol, String id, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.rol = rol;
        this.id = id;
        this.contrasena = contrasena;
        
        for(int i = 0; i<2; i++){
            for(int j = 0; j<10; j++){
                prestamos[i][j] = "";
            }
        }
        for(int i = 0; i<2; i++){
            for(int j = 0; j<10; j++){
                agregados[i][j] = "";
            }
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
