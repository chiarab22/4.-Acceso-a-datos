package com.example.gestoranimales.lanzador;

import com.example.gestoranimales.gui.Ventana;
import com.example.gestoranimales.gui.VentanaController;
import com.example.gestoranimales.gui.VentanaModel;

public class Lanzador {

    public static void lanzar(String[] args) {
        // TODO Auto-generated method stub
        Ventana view = new Ventana();
        VentanaModel model = new VentanaModel();
        VentanaController controller = new VentanaController(model, view);


    }

}

