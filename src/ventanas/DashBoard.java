package ventanas;

import Paneles.MenuLateralPanel;
import Paneles.Tabla;
import javax.swing.JFrame;
import java.awt.*;

public class DashBoard extends JFrame {

    public DashBoard() {
        setTitle("Doctor");
        setSize(1900, 1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear e integrar la tabla
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        Tabla tabla = new Tabla();
        add(tabla); // Agregar directamente al JFrame

        this.setVisible(true);
    }

}