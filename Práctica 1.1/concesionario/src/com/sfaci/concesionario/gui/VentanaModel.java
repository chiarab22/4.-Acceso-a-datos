package com.sfaci.concesionario.gui;

import com.sfaci.concesionario.base.Coche;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class VentanaModel {

    private HashMap<String, Coche> coches;
    private final String RUTA_FICHERO =
            System.getProperty("user.home") + File.separator + "coches.dat";

    public VentanaModel() throws FileNotFoundException, ClassNotFoundException,
        IOException {

        File fichero = new File(RUTA_FICHERO);
        if (fichero.exists()) {
            cargarDeFichero();
        }
        else {
            coches = new HashMap<>();
        }
    }

    public void registrarCoche(Coche coche) {

        coches.put(coche.getMatricula(), coche);
    }

    public void modificarCoche(Coche nuevoCoche, String matricula) {

        Coche coche = coches.get(matricula);
        coche.setMatricula(nuevoCoche.getMatricula());
        coche.setModelo(nuevoCoche.getModelo());
        coche.setFechaCompra(nuevoCoche.getFechaCompra());
        coche.setPotencia(nuevoCoche.getPotencia());
        coche.setCombustible(nuevoCoche.getCombustible());
        coche.setHibrido(nuevoCoche.isHibrido());
    }

    public void eliminarCoche(String matricula) {

        coches.remove(matricula);
    }


    public Coche obtenerCoche(String matricula) {

        return null;
    }

    public ArrayList<Coche> obtenerCoches(String busqueda) {

        ArrayList<Coche> cochesEncontrados = new ArrayList<>();

        for (Coche coche : obtenerCoches()) {
            if ((coche.getMatricula().contains(busqueda))
                || (coche.getModelo().contains(busqueda))) {
                cochesEncontrados.add(coche);
            }
        }

        return cochesEncontrados;
    }

    public Collection<Coche> obtenerCoches() {

        return coches.values();
    }

    public void guardarAFichero() throws IOException {

        ObjectOutputStream serializador = null;

        serializador = new ObjectOutputStream(new FileOutputStream(RUTA_FICHERO));
        serializador.writeObject(coches);
        if (serializador != null)
            serializador.close();
    }

    public void cargarDeFichero() throws FileNotFoundException,
        ClassNotFoundException, IOException {

        ObjectInputStream deserializador = null;

        deserializador = new ObjectInputStream(new FileInputStream(RUTA_FICHERO));
        coches = (HashMap<String, Coche>) deserializador.readObject();
        if (deserializador == null)
            deserializador.close();
    }
}
