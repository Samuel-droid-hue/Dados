package cursoDOO.persistencia;

/**
 *
 * @author samuel
 */

import cursoDOO.persistencia.Dado;

public class JuegoDados {
    Dado dado1, dado2;
    
    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }
    
    public void jugar() {
        dado1.lanzar();
        System.out.println("Dado 1: " + dado1.obtenerValorCara());
        
        dado2.lanzar();
        System.out.println("Dado 2: " + dado2.obtenerValorCara());
    }
}
