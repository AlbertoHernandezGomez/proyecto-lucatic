package controller;

import interfaces.IVideojuego;
import model.Videojuego;


public class Controlador {
	
	IVideojuego videojuegoservice;
		
	public Integer darDeAltaVideojuego(Videojuego videojuego) {
		// Comprobar si ya existe el juego
		boolean comprob=true;
		if (comprob) {
			videojuegoservice.dar_alta_videojuego(videojuego);
			return 0;
		} else {
			return 1;
		}
	}
}
