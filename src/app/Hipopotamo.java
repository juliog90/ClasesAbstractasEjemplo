package app;

/**
 * Hipopotamo
 */
public class Hipopotamo extends Animal {

    // Metodo abstracto implementado forzosamente
    @Override
    public String hacerRuido() {
        return "Grito de Hipopotamo :)";
    }
    
    // Metodo no abstracto substituido por el programador
    @Override
    public void comer() {
        System.out.println("Comiendo frutas y pasto");
    }
}