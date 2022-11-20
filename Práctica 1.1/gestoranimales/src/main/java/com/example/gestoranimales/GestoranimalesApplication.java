package com.example.gestoranimales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.gestoranimales.lanzador.Lanzador.lanzar;

@SpringBootApplication
public class GestoranimalesApplication {

	public static void main(String[] args) {
		lanzar(args);
	}

}
