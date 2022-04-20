package daos;

import java.util.ArrayList;

import interfaces.IVideojuegoDAO;
import model.Videojuego;

public class VideojuegoDAO implements IVideojuegoDAO {
	
	//ArrayList de tipo Videojuego
//	ArrayList<Videojuego> fichero = new ArrayList();
//
//	@Override
//	public void addVideojuego(Videojuego videojuego) {
//		fichero.add(videojuego);
//		for (Videojuego vid : fichero) {
//			if (vid.getRank() == fichero.size() - 1) {
//				System.out.println(vid);
//			}		
//		}
//
//	}
	
	//ArrayList de tipo Videojuego
	ArrayList<String[]> fichero = new ArrayList();

	@Override
	public void addVideojuego(String[] videojuego) {
		fichero.add(videojuego);
		int lastIdx = fichero.size() - 1;
		System.out.println(fichero.get(lastIdx));
		
	}
	


}
