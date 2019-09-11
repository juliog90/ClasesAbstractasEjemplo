package app;

/**
 * Lion
 */
public class Lion extends Feline{

    @Override
    public String makeNoise() {
        return "Yawwwm";
    }

    @Override
    public void eat() {
        System.out.println("Eating wounded animal lazily");
    }
    
}