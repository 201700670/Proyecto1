/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Andrea Palomo
 */
public class Cargamasiva extends JFrame {
    public JLabel carga;
    public JTextArea masiva;
    public JScrollPane mover;
    private JPanel pnl;
    private JButton cargas;
    private JButton cancelar;
    public Cargamasiva(){
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("CARGA MASIVA");
        
        carga = new JLabel("Carga Individual");
        carga.setSize(100, 30);
        carga.setBounds(50, 20, 130, 30);
        
        masiva = new JTextArea();
        masiva.setSize(100, 30);
        masiva.setBounds(50, 70, 690, 230);
        masiva.setEditable(true);
        masiva.setLineWrap(true);
        masiva.setWrapStyleWord(true);
        
        cargas= new JButton("Cargar");
        cargas.setBounds(80, 300, 100, 30);
        
        cancelar= new JButton("Cancelar");
        cancelar.setBounds(200, 300, 100, 30);
       
        mover=new JScrollPane(masiva);

        mover.setVerticalScrollBarPolicy (
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mover.setVisible(true);
        mover.setColumnHeaderView (masiva);
        add(carga);
        add(masiva);
        add(cargas);
        add(cancelar);
        Reacciones manejo=new Reacciones();
        cargas.addActionListener(manejo);
        cancelar.addActionListener(manejo);
        
        setSize(800,400);
        setVisible(true);
        
    }

    private class Reacciones implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==cargas){
                for (Libros elemento: Administradorbiblio.libros){
                
                    if (elemento.tipo == 0){
                        Libros temporal = (Libros)elemento;
                        masiva.setText(temporal.mostrar());
                    }
        }
                for (Revistas elemento: Administradorbiblio.revistas){
                
                    if (elemento.tipo == 1){
                        Revistas temporal = (Revistas)elemento;
                        masiva.setText(temporal.mostrar());
                    }
        }
                for (Tesis elemento: Administradorbiblio.tesis){
                
                    if (elemento.tipo == 2){
                        Tesis temporal = (Tesis)elemento;
                        masiva.setText(temporal.mostrar());
                    }
        }
            }
            if(ae.getSource()==cancelar){
                dispose();
            }
        }
    }
    
}
