package app;

/**
 * Perro
 */
public class Perro extends Canino{

    @Override
    public String hacerRuido() {
        return "Guau Guau";
    }

    @Override
    public void comer() {
        System.out.println("Comiendo Sobras");
    }
}