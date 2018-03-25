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
//     Administrador frame = new Administrador();
////    frame.pack();
//    frame.setVisible(true);
        botoncargar obj=new botoncargar();
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);//se utiliza para salir por medio del ícono "x"
        obj.setLocationRelativeTo(null);
    }
    
}
