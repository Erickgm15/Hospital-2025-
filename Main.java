import javax.swing.*;
import javax.awt.Color;

// Clase principal del programa
public class Main{

    public static void main(String[] args) {
        
        // Crear una venta con JFrame 
        JFrame miventana = new JFrame(); // Se crea un nuevo objeto tipo JFrame llamado "miventana"
        
        miventana.setTitle(" Hospital "); // Se asigna un título a la ventana
       
        miventana.setSize(700,500); // Se define el tamaño de la ventana (ancho x alto) 
       
        JPanel panelBanner = new JPanel();
        panelBanner.setSize(500,800);
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color RED);
        miventana.add(panelBanner);


        JPanel pannerBanner2 = new JPanel();
        pannerBanner2.setSize(500,800);
        panelBanner2.setOpaque(true);
        panelBanner2.setBackground(Color BLUE);

    
        miventana.setVisible(true); // Se hace visible la ventana
        
       
    }
}