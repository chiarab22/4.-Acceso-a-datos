package com.example.gestoranimales.gui;


import javax.swing.*;
public class JBarraEstado {
    private JPanel panel1;
    private JLabel lbMensaje;
    private JLabel lbEstado;

    public JBarraEstado() {

    }

    /**
     * Fija el mensaje de la barra de estado
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        lbMensaje.setText(mensaje);
    }

    /**
     * Fija el estado de la barra de estado
     * @param mensaje
     */
    public void setEstado(String mensaje) {
        lbEstado.setText(mensaje);
    }
}
