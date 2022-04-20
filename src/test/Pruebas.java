package test;

import model.Videojuego;
import org.junit.jupiter.api.Test;

import java.lang.ModuleLayer.Controller;
import java.util.logging.Logger;
import daos.VideojuegoDAO;

import static org.junit.Assert.assertNull;

public class Pruebas {
    private static Logger logger;

    static{
        try{
            logger= Logger.getLogger(Controller.class);
        }catch(Throwable e){
            System.out.println("No funciona");
        }
    }

    @Test
    public void datoNoCorrecto(){
        //assertNull(VideojuegoDAO.addVideojuego(null));
        logger.log(assertNull(VideojuegoDAO.addVideojuego(null)));
    }

    @Test
    public void datoCorrecto(){
        //assertNull(VideojuegoDAO.addVideojuego(null));
        Videojuego juego= new Videojuego(16,"Metroid","DS",2005,"Platform","Nintendo");
        logger.log(assertNull(VideojuegoDAO.addVideojuego(juego)));
    }
}
