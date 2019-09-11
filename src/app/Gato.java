package app;

/**
 * Gato
 */
public class Gato extends Felino{

    @Override
    public String hacerRuido() {
        return "Miau Miau";
    }

    @Override
    public void comer() {
        System.out.println("Comiendo Wiskas");
    }
    
}