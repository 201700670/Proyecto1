/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Andrea Palomo
 */
public class botoncargar extends JFrame{
    private JButton individual;
    private JButton masiva;

    public botoncargar() {
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("BOTONES DE CARGA");
        
        individual = new JButton("Carga Individual");
        individual.setSize(100, 30);
        individual.setBounds(50, 20, 130, 30);
        
        masiva= new JButton("Carga Masiva");
        masiva.setSize(100, 30);
        masiva.setBounds(200, 20, 120, 30);
        
        add(individual);
        add(masiva);
        
        Evaluar manejo=new Evaluar();
        individual.addActionListener(manejo);
        masiva.addActionListener(manejo);
        
        setSize(390,110);
        setVisible(true);
    }

    private class Evaluar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==individual){
                Cargaindividual obj=new Cargaindividual();
                obj.setVisible(true);
            }
            if(ae.getSource()==masiva){
//                Biblioteca_virtual obj=new Biblioteca_virtual();
                Cargamasiva obj=new Cargamasiva();
                obj.setVisible(true);
                
            }
        }
    }
    
}
