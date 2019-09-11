package app;

/**
 * Feline
 */
public abstract class Feline extends Animal {

    public abstract String makeNoise();

    @Override
    public void roam() {
        System.out.println("Roaming Silently");
    }
}