package app;

/**
 * Felino
 */
public abstract class Felino extends Animal {

    public abstract String hacerRuido();

    @Override
    public void andar() {
        System.out.println("Roaming Silently");
    }
}