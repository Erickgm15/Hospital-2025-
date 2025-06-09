package Paneles;

import data.Pacientes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JScrollPane {  // Ahora es un componente JScrollPane

    public Tabla() {
        // Columnas y datos
        String[] columnas = {"ID", "Nombre", "Edad"};

        Object[][] datos =  new Pacientes().getDatos();


        // Crear modelo y tabla
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);

        // Configurar este JScrollPane para contener la tabla
        this.setViewportView(table);
        this.setBounds(0, 0, 400, 800); // Posición y tamaño
    }
}