import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main{

    public static void main(String[] args) {
        
        // Crear una venta con JFrame 

        JFrame miventana = new JFrame();
        miventana.setTitle(" Hospital ");
        miventana.setSize(700,800);
       

        // CRear un texto con Jlabel 

        JLabel texto =new JLabel(  );
        texto.setText("Hola mundo ");
        miventana.add(texto);
        miventana.setVisible(true);
        
       
    }
}