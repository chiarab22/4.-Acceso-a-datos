package com.example.gestoranimales.gui;

import javax.swing.*;
public class Ventana {
    private JPanel panel1 = new JPanel();
    JTextField tfNombre;
    JTextField tfRaza;
    JTextField tfCaracteristicas;
    JTextField tfPeso;
    JButton btGuardar;
    JButton btNuevo;
    JButton btModificar;
    JButton btEliminar;
    JButton btAnterior;
    JButton btSiguiente;
    JButton btPrimero;
    JButton btUltimo;

    JBarraEstado barraEstado;
    JTextField tfBusqueda;
    JButton btBuscar;

    public Ventana() {

        JFrame frame = new JFrame("Gestor de animales");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
