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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Principal obj=new Principal();
        //Login obj=new Login();//en la composición se encuentra todo el procedimiento de cada objeto
        //Usuario obj=new Usuario();
        Cargaindividual obj=new Cargaindividual();
        obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);//se utiliza para salir por medio del ícono "x"
        
        
        /*obj.setTitle("IPC PROYECTO 1");
        obj.setSize(500,150);//el tamaño de la ventana
        obj.setLocationRelativeTo(null);//coloca la ventana al centro de la pantalla al ejecutar
        obj.setVisible(true);//al ser ve*/
    }
    
}
