package cursoDOO.persistencia;

/**
 *
 * @author samuel
 */

import java.util.Random;

public class Dado {
    private int valorCara;
    
    public int obtenerValorCara() {
        return this.valorCara;
    }
    
    public void lanzar() {
        Random rand = new Random();
        this.valorCara = rand.nextInt(6 - 1 + 1) + 1;
    }
}
