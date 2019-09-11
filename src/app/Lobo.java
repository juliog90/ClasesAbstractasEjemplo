package app;

/**
 * Lobo
 */
public class Lobo extends Canino {

    @Override
    public String hacerRuido() {
        return "Auuuuuuu";
    }

    @Override
    public void comer() {
        System.out.println("Comiendo carne fresca");
    }
}