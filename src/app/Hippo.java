package app;

/**
 * Hippo
 */
public class Hippo extends Animal {

    // Metodo abstracto implementado forzosamente
    @Override
    public String makeNoise() {
        return "Hippo Noise :)";
    }
    
    // Metodo no abstracto substituido por el programador
    @Override
    public void eat() {
        System.out.println("Eating Fruits and Grass");
    }
}