/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Andrea Palomo
 */
public class Biblioteca {

    public static void main(String[] args) {
//        Principal obj=new Principal();
        
        Administrador obj=new Administrador();
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);//se utiliza para salir por medio del ícono "x"
        obj.setTitle("IPC PROYECTO 1");
        obj.setLocationRelativeTo(null);
    }
    
}
