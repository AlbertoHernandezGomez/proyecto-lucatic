package services;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.IVideojuegoService;
import model.Videojuego;

public class VideojuegoService implements IVideojuegoService {

	
	@Override
	public void darDeAltaVideojuego() {
		
		//ESCANER PARA LEER POR PANTALLA
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del videojuego: ");
		String nombre_videojuego = sc.next();
		System.out.println("Introduzca la plataforma: ");
		String plataforma = sc.next();
		System.out.println("Introduza el año de lanzamiento: ");
		int anyo_lanzamiento = sc.nextInt();
		System.out.println("Introduzca el genero: ");
		String genero = sc.next();
		System.out.println("Introduzca el nombre de la compañia: ");
		String publisher = sc.next();
	
		
		
		//IVideojuegoDAO videojuegodao = metodo.obtenerCSV
		//videojuegodao.addVideojuego(videojuego)
		//cerrarfichero();


	}

	@Override
	public ArrayList<Videojuego> listado_videojuegos() {
		
		return null;
	}

}
