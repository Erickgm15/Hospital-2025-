package Paneles;

import javax.swing.*;
import java.awt.*;

public class MenuLateralPanel  extends JPanel {

    public MenuLateralPanel(){

        this.setPreferredSize(new Dimension(400,100));
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

    public JPanel getPanel(){

        return this;
    }
}