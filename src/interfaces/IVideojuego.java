package interfaces;

import java.util.ArrayList;

import model.Videojuego;

public interface IVideojuego {
	
	public void dar_alta_videojuego(Videojuego videojuego);
	public ArrayList<Videojuego> listado_videojuegos(); 

}
