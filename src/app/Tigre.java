package app;

/**
 * Tigre
 */
public class Tigre extends Felino {

    @Override
    public String hacerRuido() {
        return "Grrrrr";
    }

    @Override
    public void comer() {
        System.out.println("Comiendo carne de venado");
    }
    
}