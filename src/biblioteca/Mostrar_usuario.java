/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
/**
 *
 * @author Andrea Palomo
 */
public class Mostrar_usuario extends JFrame{
    
public Mostrar_usuario(Datosusuario[]usuarios) {
        Modelotabla obj=new Modelotabla();
        JTable tablasusuario=new JTable(obj);
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i]!=null){
            obj.agregarusuario(usuarios[i]);
            }
        }
        add(tablasusuario);
        setEnabled(false);
        setVisible(true);
        setSize(600,500);
}

}




