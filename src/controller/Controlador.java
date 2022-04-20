package controller;

import interfaces.IVideojuegoService;
import model.Videojuego;


public class Controlador {
	
	IVideojuegoService videojuegoservice;
		
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
