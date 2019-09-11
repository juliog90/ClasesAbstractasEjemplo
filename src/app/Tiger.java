package app;

/**
 * Tiger
 */
public class Tiger extends Feline{

    @Override
    public String makeNoise() {
        return "Grrrrr";
    }

    @Override
    public void eat() {
        System.out.println("Eating wounded Deer");
    }
    
}